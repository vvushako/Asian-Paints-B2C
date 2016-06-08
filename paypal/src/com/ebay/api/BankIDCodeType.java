
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BankIDCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BankIDCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CMB"/>
 *     &lt;enumeration value="ICBC"/>
 *     &lt;enumeration value="CCB"/>
 *     &lt;enumeration value="ChinaPay"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BankIDCodeType")
@XmlEnum
public enum BankIDCodeType {

    CMB("CMB"),
    ICBC("ICBC"),
    CCB("CCB"),
    @XmlEnumValue("ChinaPay")
    CHINA_PAY("ChinaPay");
    private final String value;

    BankIDCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BankIDCodeType fromValue(String v) {
        for (BankIDCodeType c: BankIDCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
