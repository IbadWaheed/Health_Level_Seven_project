package starhealthcaretech.DataTypes;

public class HL7Helper {

    public static CE createCE(
        String identifier,
        String text,
        String nameOfCodingSystem,
        String alternateIdentifier,
        String alternateText,
        String nameOfAlternateCodingSystem) {

    CE ce = new CE();
    if (identifier != null) ce.setIdentifier(identifier);
    if (text != null) ce.setText(text);
    if (nameOfCodingSystem != null) ce.setNameOfCodingSystem(nameOfCodingSystem);
    if (alternateIdentifier != null) ce.setAlternateIdentifier(alternateIdentifier);
    if (alternateText != null) ce.setAlternateText(alternateText);
    if (nameOfAlternateCodingSystem != null) ce.setNameOfAlternateCodingSystem(nameOfAlternateCodingSystem);

    return ce;
}


    public static MSG createMSG(String messageCode, String triggerEvent, String messageStructure) {
        MSG msg = new MSG();
        if (messageCode != null) msg.setMessageCode(messageCode);
        if (triggerEvent != null) msg.setTriggerEvent(triggerEvent);
        if (messageStructure != null) msg.setMessageStructure(messageStructure);
        return msg;
    }
    public static TQ createTQ(String quantity, String interval, String duration, String startDateTime, String endDateTime) {
        TQ tq = new TQ();
    
        if (quantity != null) tq.setQuantity(quantity);
        if (interval != null) tq.setInterval(interval);
        if (duration != null) tq.setDuration(duration);
        if (startDateTime != null) tq.setStartDateTime(startDateTime);
        if (endDateTime != null) tq.setEndDateTime(endDateTime);
    
        return tq;
    }

    public static XCN createXCN(
    String idNumber,
    String familyName,
    String givenName,
    String middleInitialOrName,
    String suffix,
    String prefix,
    String degree,
    String sourceTable,
    String assigningAuthority,
    String nameType,
    String identifierCheckDigit,
    String checkDigitScheme,
    String identifierTypeCode,
    String assigningFacilityId
) {
    XCN xcn = new XCN();

    if (idNumber != null) xcn.setIdNumber(idNumber);
    if (familyName != null) xcn.setFamilyName(familyName);
    if (givenName != null) xcn.setGivenName(givenName);
    if (middleInitialOrName != null) xcn.setMiddleInitialOrName(middleInitialOrName);
    if (suffix != null) xcn.setSuffix(suffix);
    if (prefix != null) xcn.setPrefix(prefix);
    if (degree != null) xcn.setDegree(degree);
    if (sourceTable != null) xcn.setSourceTable(sourceTable);
    if (assigningAuthority != null) xcn.setAssigningAuthority(assigningAuthority);
    if (nameType != null) xcn.setNameType(nameType);
    if (identifierCheckDigit != null) xcn.setIdentifierCheckDigit(identifierCheckDigit);
    if (checkDigitScheme != null) xcn.setCheckDigitScheme(checkDigitScheme);
    if (identifierTypeCode != null) xcn.setIdentifierTypeCode(identifierTypeCode);
    if (assigningFacilityId != null) xcn.setAssigningFacilityId(assigningFacilityId);

    return xcn;
}
public static CX createCX(
    String idNumber,
    String checkDigit,
    String checkDigitScheme,
    HD assigningAuthority,
    String identifierTypeCode,
    HD assigningFacility,
    String effectiveDate,
    String expirationDate,
    CWE assigningJurisdiction,
    CWE assigningAgencyOrDepartment
) {
    CX cx = new CX();

    if (idNumber != null) cx.setIdNumber(idNumber);
    if (checkDigit != null) cx.setCheckDigit(checkDigit);
    if (checkDigitScheme != null) cx.setCheckDigitScheme(checkDigitScheme);
    if (assigningAuthority != null) cx.setAssigningAuthority(assigningAuthority);
    if (identifierTypeCode != null) cx.setIdentifierTypeCode(identifierTypeCode);
    if (assigningFacility != null) cx.setAssigningFacility(assigningFacility);
    if (effectiveDate != null) cx.setEffectiveDate(effectiveDate);
    if (expirationDate != null) cx.setExpirationDate(expirationDate);
    if (assigningJurisdiction != null) cx.setAssigningJurisdiction(assigningJurisdiction);
    if (assigningAgencyOrDepartment != null) cx.setAssigningAgencyOrDepartment(assigningAgencyOrDepartment);

    return cx;
}
public static XPN createXPN(
    String familyName,
    String givenName,
    String middleNamesOrInitials,
    String suffix,
    String prefix,
    String degree,
    String nameTypeCode
    // String nameRepresentationCode,
    // String nameContext,
    // String nameValidityRange,
    // String nameAssemblyOrder,
    // String effectiveDate,
    // String expirationDate,
    // String professionalSuffix
) {
    XPN xpn = new XPN();

    if (familyName != null) xpn.setFamilyName(familyName);
    if (givenName != null) xpn.setGivenName(givenName);
    if (middleNamesOrInitials != null) xpn.setMiddleNamesOrInitials(middleNamesOrInitials);
    if (suffix != null) xpn.setSuffix(suffix);
    if (prefix != null) xpn.setPrefix(prefix);
    if (degree != null) xpn.setDegree(degree);
    if (nameTypeCode != null) xpn.setNameTypeCode(nameTypeCode);
    // if (nameRepresentationCode != null) xpn.setNameRepresentationCode(nameRepresentationCode);
    // if (nameContext != null) xpn.setNameContext(nameContext);
    // if (nameValidityRange != null) xpn.setNameValidityRange(nameValidityRange);
    // if (nameAssemblyOrder != null) xpn.setNameAssemblyOrder(nameAssemblyOrder);
    // if (effectiveDate != null) xpn.setEffectiveDate(effectiveDate);
    // if (expirationDate != null) xpn.setExpirationDate(expirationDate);
    // if (professionalSuffix != null) xpn.setProfessionalSuffix(professionalSuffix);

    return xpn;
}
public static XAD createXAD(
    String streetAddress,
    String otherDesignation,
    String city,
    String stateOrProvince,
    String zipOrPostalCode,
    String country,
    String addressType,
    String otherGeographicDesignation,
    String countyParishCode,
    String censusTract,
    String addressRepresentationCode,
    String addressValidityRange,
    String effectiveDate,
    String expirationDate
) {
    XAD xad = new XAD();

    if (streetAddress != null) xad.setStreetAddress(streetAddress);
    if (otherDesignation != null) xad.setOtherDesignation(otherDesignation);
    if (city != null) xad.setCity(city);
    if (stateOrProvince != null) xad.setStateOrProvince(stateOrProvince);
    if (zipOrPostalCode != null) xad.setZipOrPostalCode(zipOrPostalCode);
    if (country != null) xad.setCountry(country);
    if (addressType != null) xad.setAddressType(addressType);
    if (otherGeographicDesignation != null) xad.setOtherGeographicDesignation(otherGeographicDesignation);
    if (countyParishCode != null) xad.setCountyParishCode(countyParishCode);
    if (censusTract != null) xad.setCensusTract(censusTract);
    if (addressRepresentationCode != null) xad.setAddressRepresentationCode(addressRepresentationCode);
    if (addressValidityRange != null) xad.setAddressValidityRange(addressValidityRange);
    if (effectiveDate != null) xad.setEffectiveDate(effectiveDate);
    if (expirationDate != null) xad.setExpirationDate(expirationDate);

    return xad;
}

public static XTN createXTN(
    String telephoneNumber,
    String telecommunicationUseCode,
    String telecommunicationEquipmentType,
    String communicationAddress,
    String countryCode,
    String areaCityCode,
    String localNumber,
    String extension,
    String anyText,
    String extensionPrefix,
    String speedDialCode,
    String unformattedTelephoneNumber,
    String effectiveStartDate,
    String expirationDate,
    String expirationReason,
    String protectionCode,
    String sharedTelecommunicationIdentifier,
    String preferenceOrder
) {
    XTN xtn = new XTN();

    xtn.setTelephoneNumber(telephoneNumber);
    xtn.setTelecommunicationUseCode(telecommunicationUseCode);
    xtn.setTelecommunicationEquipmentType(telecommunicationEquipmentType);
    xtn.setCommunicationAddress(communicationAddress);
    xtn.setCountryCode(countryCode);
    xtn.setAreaCityCode(areaCityCode);
    xtn.setLocalNumber(localNumber);
    xtn.setExtension(extension);
    xtn.setAnyText(anyText);
    xtn.setExtensionPrefix(extensionPrefix);
    xtn.setSpeedDialCode(speedDialCode);
    xtn.setUnformattedTelephoneNumber(unformattedTelephoneNumber);
    xtn.setEffectiveStartDate(effectiveStartDate);
    xtn.setExpirationDate(expirationDate);
    xtn.setExpirationReason(expirationReason);
    xtn.setProtectionCode(protectionCode);
    xtn.setSharedTelecommunicationIdentifier(sharedTelecommunicationIdentifier);
    xtn.setPreferenceOrder(preferenceOrder);

    return xtn;
}


    
}
