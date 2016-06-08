
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentActionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentActionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="Authorization"/>
 *     &lt;enumeration value="Sale"/>
 *     &lt;enumeration value="Order"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PaymentActionCodeType")
@XmlEnum
public enum PaymentActionCodeType {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Authorization")
    AUTHORIZATION("Authorization"),
    @XmlEnumValue("Sale")
    SALE("Sale"),
    @XmlEnumValue("Order")
    ORDER("Order");
    private final String value;

    PaymentActionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PaymentActionCodeType fromValue(String v) {
        for (PaymentActionCodeType c: PaymentActionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
