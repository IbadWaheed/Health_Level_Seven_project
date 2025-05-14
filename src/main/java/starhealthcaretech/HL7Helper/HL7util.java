package starhealthcaretech.HL7Helper;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import starhealthcaretech.DataTypes.MSG;
import starhealthcaretech.HL7Message.ADT;
import starhealthcaretech.HL7Message.SIU;
import starhealthcaretech.Segments.MSH;

public class HL7util {
    public static String processAllFields(Object obj) {
        StringBuilder result = new StringBuilder();

        if (obj == null) {
            return result.toString(); // return empty if null
        }

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            try {
                Object value = field.get(obj);
                result.append(processObject(value));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        return result.toString();
    }
    // public static String processAllFields(Object obj) {
    // StringBuilder result = new StringBuilder();

    // if (obj == null) {
    // return result.toString(); // return empty if null
    // }

    // if (obj instanceof List<?>) {
    // List<?> list = (List<?>) obj;
    // for (Object item : list) {
    // result.append(processAllFields(item)); // recursively call for each object
    // }
    // } else {
    // Field[] fields = obj.getClass().getDeclaredFields();

    // for (Field field : fields) {
    // field.setAccessible(true);
    // try {
    // Object value = field.get(obj);
    // result.append(processObject(value));
    // } catch (IllegalAccessException e) {
    // e.printStackTrace();
    // }
    // }
    // }

    // return result.toString();
    // }

    public static String processObject(Object obj) {
        StringBuilder result = new StringBuilder();
        result.append("|"); // Always start with a field separator

        if (obj == null) {
            return result.toString(); // Only the separator
        }

        if (obj instanceof List<?>) {
            List<?> list = (List<?>) obj;
            if (!list.isEmpty()) {
                StringBuilder listValues = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    Object listItem = list.get(i);
                    String processedItem = processObject(listItem).replaceFirst("\\|", ""); // Remove leading '|'
                    if (i > 0) {
                        listValues.append("~");
                    }
                    listValues.append(processedItem);
                }
                result.append(listValues);
            }
        } else if (isPrimitive(obj)) {
            String value = obj.toString().trim();
            if (!value.isEmpty()) {
                result.append(value);
            }
        } else {
            // Custom object: include all fields separated by ^ (including empty)
            String custom = processCustomObject(obj); // Do NOT remove leading ^
            result.append(custom);
        }

        return result.toString();
    }

    private static boolean isPrimitive(Object obj) {
        return obj instanceof String || obj instanceof Integer || obj instanceof Boolean ||
                obj instanceof Double || obj instanceof Float || obj instanceof Long ||
                obj instanceof Short || obj instanceof Byte;
    }

    private static String processCustomObject(Object obj) {
        StringBuilder customObjResult = new StringBuilder();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            try {
                Object fieldValue = field.get(obj);
                String valueStr = processObject(fieldValue).replaceFirst("\\|", "").trim();

                if (i == 0) {
                    // First field logic
                    // if (valueStr.isEmpty()) {
                    // customObjResult.append("^"); // Only add ^ if empty
                    // } else {
                    // customObjResult.append(valueStr); // No ^ before first value
                    // }
                    if (!valueStr.isEmpty()) {
                        customObjResult.append(valueStr); // No ^ before first value
                    }
                } else {
                    // All other fields, always prepend ^
                    customObjResult.append("^");
                    if (!valueStr.isEmpty()) {
                        customObjResult.append(valueStr);
                    }
                }
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        while (customObjResult.length() > 0 && customObjResult.charAt(customObjResult.length() - 1) == '^') {
            customObjResult.deleteCharAt(customObjResult.length() - 1);
        }
        return customObjResult.toString();

    }

    public static void initialize(Object obj) {
        if (obj == null)
            return;

        Class<?> current = obj.getClass();

        while (current != null && current != Object.class) {
            for (Field field : current.getDeclaredFields()) {
                field.setAccessible(true);
                try {
                    Object value = field.get(obj);
                    if (value == null) {
                        Class<?> fieldType = field.getType();

                        if (isList(fieldType)) {
                            ParameterizedType listType = (ParameterizedType) field.getGenericType();
                            Class<?> itemType = (Class<?>) listType.getActualTypeArguments()[0];

                            List<Object> listInstance = new ArrayList<>();

                            if (!isSimpleType(itemType)) {
                                Object nestedObject = itemType.getDeclaredConstructor().newInstance();
                                initialize(nestedObject);
                                listInstance.add(nestedObject);
                            }

                            field.set(obj, listInstance);

                        } else if (!isSimpleType(fieldType)) {
                            Object nestedObject = fieldType.getDeclaredConstructor().newInstance();
                            initialize(nestedObject);
                            field.set(obj, nestedObject);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            current = current.getSuperclass(); // Move to the superclass to include inherited fields
        }
    }

    private static boolean isList(Class<?> clazz) {
        return List.class.isAssignableFrom(clazz);
    }

    private static boolean isSimpleType(Class<?> clazz) {
        return clazz.isPrimitive() ||
                clazz == String.class ||
                Number.class.isAssignableFrom(clazz) ||
                clazz == Boolean.class ||
                clazz == Character.class ||
                clazz.isEnum() ||
                clazz.getName().startsWith("java.");
    }

    public static void jsonmaker(Object obj, String folderPath) {
        if (obj == null || folderPath == null || folderPath.isEmpty()) {
            System.err.println("Invalid object or folder path.");
            return;
        }

        ObjectMapper mapper = new ObjectMapper();
        String className = obj.getClass().getSimpleName();
        File directory = new File(folderPath);

        if (!directory.exists()) {
            directory.mkdirs(); // Create folder if it doesn't exist
        }

        File outputFile = new File(directory, className + ".json");

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(outputFile, obj);
            System.out.println("JSON file created at: " + outputFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String cleanHL7MessageE(String hl7Message) {
        StringBuilder cleaned = new StringBuilder();

        // Split input string by newline (\r\n or \n or \r)
        String[] segments = hl7Message.split("\\r?\\n|\\r");

        for (String segment : segments) {
            String[] parts = segment.split("\\|", -1); // Split by pipe, keep empty fields

            if (parts.length <= 1)
                continue; // Skip if there's no real data

            // Combine all fields (excluding the segment name itself)
            StringBuilder data = new StringBuilder();
            for (int i = 1; i < parts.length; i++) {
                data.append(parts[i]);
            }

            // Remove all HL7 delimiters and trim
            String dataOnly = data.toString().replaceAll("[|^~&\\\\]", "").trim();

            if (!dataOnly.isEmpty()) {
                cleaned.append(segment).append("\r"); // Append valid segment
            }
        }

        return cleaned.toString();
    }

    public static void generateHL7FromJson(File jsonFile, String outputFolderPath) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Read the JSON file into a tree model
            JsonNode rootNode = objectMapper.readTree(jsonFile);

            // Access the "messageType" node
            JsonNode mainsegment = rootNode.path("messageHeader");
            JsonNode messageTypeNode = mainsegment.path("messageType");

            // Extract "messageCode" and "triggerEvent"
            String messageCode = messageTypeNode.path("messageCode").asText();
            String triggerEvent = messageTypeNode.path("triggerEvent").asText();

            // Construct full message type string like "ADT^A01"
            String messageType = messageCode.trim() + "^" + triggerEvent.trim();

            String hl7Output = "";

            // Decide the class to use based on message type
            switch (messageType) {
                case "ADT^A01":
                    ADT adt = objectMapper.treeToValue(rootNode, ADT.class);
                    hl7Output = adt.toHL7();

                    break;
                case "ADT^A18":
                    ADT adtA18 = objectMapper.treeToValue(rootNode, ADT.class);
                    hl7Output = adtA18.toHL7();
                    break;
                case "SIU^S12":
                    SIU siu = objectMapper.treeToValue(rootNode, SIU.class);
                    hl7Output = siu.toHL7();
                    break;
                // Add more cases as needed
                default:
                    System.out.println("Unsupported message type: " + messageType);
                    return;
            }

            // cleanHL7txt
            hl7Output = cleanHL7MessageE(hl7Output);
            // Save HL7 output to file
            String outputFileName = messageType.replace("^", "_") + ".hl7";
            File outputFile = new File(outputFolderPath, outputFileName);
            java.nio.file.Files.write(outputFile.toPath(), hl7Output.getBytes());

            System.out.println("HL7 file generated: " + outputFile.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error reading or processing JSON: " + e.getMessage());
        }
    }

    public static void generateHL7FromModel(Object model, String outputFolderPath) {
        try {
            if (model == null) {
                System.out.println("Model is null. Skipping.");
                return;
            }

            String hl7Output = "";
            MSG messageTypec = null;
            String messageType = "";
            String triggerevent = "";

            if (model instanceof ADT) {
                hl7Output = ((ADT) model).toHL7();
                MSH msh = ((ADT) model).getMessageHeader();
                messageTypec = msh.getMessageType();
                messageType = messageTypec.getMessageCode();
                triggerevent = messageTypec.getTriggerEvent();

                messageType = messageType + "^" + triggerevent;

            } else if (model instanceof SIU) {
                hl7Output = ((SIU) model).toHL7();
                MSH msh = ((SIU) model).getMsh();
                messageTypec = msh.getMessageType();
                messageType = messageTypec.getMessageCode();
                triggerevent = messageTypec.getTriggerEvent();

                messageType = messageType + "^" + triggerevent;

            } else {
                System.out.println("Unsupported model type: " + model.getClass().getSimpleName());
                return;
            }

            hl7Output = cleanHL7MessageE(hl7Output);

            String fileName = messageType + "_" + System.currentTimeMillis() + ".hl7";
            File outputFile = new File(outputFolderPath, fileName);
            java.nio.file.Files.write(outputFile.toPath(), hl7Output.getBytes());

            System.out.println("HL7 file generated: " + outputFile.getAbsolutePath());

        } catch (IOException e) {
            System.err.println("Error writing HL7: " + e.getMessage());
        }
    }


    

}
