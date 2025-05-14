package starhealthcaretech;


import java.io.File;


import starhealthcaretech.HL7Helper.HL7util;
import starhealthcaretech.HL7Helper.ModelInitializer;
import starhealthcaretech.HL7Message.ADT;
import starhealthcaretech.HL7Message.SIU;




public class Main {

    public static void main(String[] args) {
        // Generate ADT HL7 messages using JSON and hardcoded model
        processADT();

        // Generate SIU HL7 messages using JSON and hardcoded model
        processSIU();
    }

    // Method to handle ADT message creation
    public static void processADT() {
        ADT adt = new ADT();

        // Initialize the ADT model structure (empty)
        HL7util.initialize(adt);

        // Base project directory
        String baseDir = System.getProperty("user.dir") + File.separator + "GeneratedFiles";
        String inputDir = baseDir + File.separator + "Input-Files";
        String outputDir = baseDir + File.separator + "Output-Files";

        // Create folders automatically if not exist
        createDirectories(inputDir, outputDir);

        String jsonFilePath = inputDir + File.separator + "ADT.json";

        // 🔹 Step 1: Create JSON from empty ADT model (structure only) when nedeed
        // HL7util.jsonmaker(adt, inputDir);

        // 🔹 Step 2: Generate HL7 from JSON file
        HL7util.generateHL7FromJson(new File(jsonFilePath), outputDir);

        // (Optional) Step 3: If you want to use hardcoded values:
        ModelInitializer.assignValuesADT(adt);
        HL7util.generateHL7FromModel(adt, outputDir);

        System.out.println("✅ ADT processing complete.");
    }

    // Method to handle SIU message creation
    public static void processSIU() {
        SIU siu = new SIU();

        // 🔹 Step 1: Assign hardcoded values to SIU model (direct method)
        ModelInitializer.assignValuesSIU(siu);

        // Base project directory
        String baseDir = System.getProperty("user.dir") + File.separator + "GeneratedFiles";
        String inputDir = baseDir + File.separator + "Input-Files";
        String outputDir = baseDir + File.separator + "Output-Files";

        // Create folders automatically if not exist
        createDirectories(inputDir, outputDir);

        // 🔹 Step 2: Create JSON from populated SIU model (optional) when nedeed
        // HL7util.jsonmaker(siu, inputDir);

        // 🔹 Step 3: Generate HL7 from JSON file
        HL7util.generateHL7FromJson(new File(inputDir + File.separator + "SIU.json"), outputDir);

        // 🔹 Step 4: Also generate HL7 directly from the hardcoded model
        HL7util.generateHL7FromModel(siu, outputDir);

        System.out.println("✅ SIU processing complete.");
    }

    // Utility method to ensure folders exist
    private static void createDirectories(String inputDir, String outputDir) {
        new File(inputDir).mkdirs();
        new File(outputDir).mkdirs();
    }
}

