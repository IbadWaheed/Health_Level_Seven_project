package starhealthcaretech.DataTypes;

public class ED {

    // ED.1 - Source Application (Optional, Hierarchic Designator (HD), Length: 227)
    private HD sourceApplication;

    // ED.2 - Type Of Data (Required, Coded Value (ID), Length: 9)
    private String typeOfData;

    // ED.3 - Data Subtype (Optional, Coded Value (ID), Length: 18)
    private String dataSubtype;

    // ED.4 - Encoding (Required, Coded Value (ID), Length: 6)
    private String encoding;

    // ED.5 - Data (Required, Text (TX), Length: 65536)
    private String data;

    // Getter and Setter for sourceApplication
    public HD getSourceApplication() {
        return sourceApplication;
    }

    public void setSourceApplication(HD sourceApplication) {
        this.sourceApplication = sourceApplication;
    }

    // Getter and Setter for typeOfData
    public String getTypeOfData() {
        return typeOfData;
    }

    public void setTypeOfData(String typeOfData) {
        this.typeOfData = typeOfData;
    }

    // Getter and Setter for dataSubtype
    public String getDataSubtype() {
        return dataSubtype;
    }

    public void setDataSubtype(String dataSubtype) {
        this.dataSubtype = dataSubtype;
    }

    // Getter and Setter for encoding
    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    // Getter and Setter for data
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
