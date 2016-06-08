
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReceiverInfoCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReceiverInfoCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="EmailAddress"/>
 *     &lt;enumeration value="UserID"/>
 *     &lt;enumeration value="PhoneNumber"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReceiverInfoCodeType")
@XmlEnum
public enum ReceiverInfoCodeType {

    @XmlEnumValue("EmailAddress")
    EMAIL_ADDRESS("EmailAddress"),
    @XmlEnumValue("UserID")
    USER_ID("UserID"),
    @XmlEnumValue("PhoneNumber")
    PHONE_NUMBER("PhoneNumber");
    private final String value;

    ReceiverInfoCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReceiverInfoCodeType fromValue(String v) {
        for (ReceiverInfoCodeType c: ReceiverInfoCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
