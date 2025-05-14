package starhealthcaretech.HL7Helper;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.*;

public class HL7Parser {

    public static <T> T parseSegment(String segmentStr, T modelObj) {
        try {
            String[] elements = segmentStr.split("\\|");
            Field[] fields = modelObj.getClass().getDeclaredFields();

            for (int i = 1; i < elements.length && (i - 1) < fields.length; i++) {
                String element = elements[i];
                Field field = fields[i - 1];
                field.setAccessible(true);

                boolean isList = List.class.isAssignableFrom(field.getType());
                boolean isNested = isCustomClass(field.getType());

                // 1. Handle Lists with repetitions
                if (isList && element.contains("~")) {
                    ParameterizedType listType = (ParameterizedType) field.getGenericType();
                    Class<?> listClass = (Class<?>) listType.getActualTypeArguments()[0];

                    List<Object> list = new ArrayList<>();
                    String[] repetitions = element.split("~");
                    for (String repetition : repetitions) {
                        if (isCustomClass(listClass) && repetition.contains("^")) {
                            Object nestedObj = listClass.getDeclaredConstructor().newInstance();
                            Field[] nestedFields = listClass.getDeclaredFields();
                            String[] components = repetition.split("\\^");
                            for (int j = 0; j < components.length && j < nestedFields.length; j++) {
                                nestedFields[j].setAccessible(true);
                                nestedFields[j].set(nestedObj, components[j]);
                            }
                            list.add(nestedObj);
                        } else {
                            list.add(repetition);
                        }
                    }
                    field.set(modelObj, list);
                }

                // 2. Handle single nested object with ^ (only if field is custom class)
                else if (isNested && element.contains("^")) {
                    Object nestedObj = field.getType().getDeclaredConstructor().newInstance();
                    Field[] nestedFields = field.getType().getDeclaredFields();
                    String[] components = element.split("\\^");
                    for (int j = 0; j < components.length && j < nestedFields.length; j++) {
                        nestedFields[j].setAccessible(true);
                        nestedFields[j].set(nestedObj, components[j]);
                    }
                    field.set(modelObj, nestedObj);
                }

                // 3. Default — assign raw value
                else {
                    field.set(modelObj, element);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return modelObj;
    }

    // Helper: Detect user-defined (non-primitive, non-wrapper, non-string) class
    private static boolean isCustomClass(Class<?> clazz) {
        return !(clazz.isPrimitive()
                || clazz == String.class
                || Number.class.isAssignableFrom(clazz)
                || clazz == Boolean.class
                || clazz == Character.class);
    }
}