package starhealthcaretech.DataTypes;

public class FN {

    // FN.1 - Surname (Required, String (ST), Length: 50)
    private String surname;

    // FN.2 - Own Surname Prefix (Optional, String (ST), Length: 20)
    private String ownSurnamePrefix;

    // FN.3 - Own Surname (Optional, String (ST), Length: 50)
    private String ownSurname;

    // FN.4 - Surname Prefix From Partner/Spouse (Optional, String (ST), Length: 20)
    private String surnamePrefixFromPartner;

    // FN.5 - Surname From Partner/Spouse (Optional, String (ST), Length: 50)
    private String surnameFromPartner;

    // Getter and Setter for surname
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // Getter and Setter for ownSurnamePrefix
    public String getOwnSurnamePrefix() {
        return ownSurnamePrefix;
    }

    public void setOwnSurnamePrefix(String ownSurnamePrefix) {
        this.ownSurnamePrefix = ownSurnamePrefix;
    }

    // Getter and Setter for ownSurname
    public String getOwnSurname() {
        return ownSurname;
    }

    public void setOwnSurname(String ownSurname) {
        this.ownSurname = ownSurname;
    }

    // Getter and Setter for surnamePrefixFromPartner
    public String getSurnamePrefixFromPartner() {
        return surnamePrefixFromPartner;
    }

    public void setSurnamePrefixFromPartner(String surnamePrefixFromPartner) {
        this.surnamePrefixFromPartner = surnamePrefixFromPartner;
    }

    // Getter and Setter for surnameFromPartner
    public String getSurnameFromPartner() {
        return surnameFromPartner;
    }

    public void setSurnameFromPartner(String surnameFromPartner) {
        this.surnameFromPartner = surnameFromPartner;
    }
}
