package starhealthcaretech.DataTypes;

public class AUI {
    private String authorizationNumber;  // AUI.1
    private String date;                 // AUI.2
    private String source;               // AUI.3



    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    public void setAuthorizationNumber(String authorizationNumber) {
        this.authorizationNumber = authorizationNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

}
