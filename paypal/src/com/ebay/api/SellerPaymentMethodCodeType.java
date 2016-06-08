
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SellerPaymentMethodCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SellerPaymentMethodCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Amex"/>
 *     &lt;enumeration value="Visa"/>
 *     &lt;enumeration value="Mastercard"/>
 *     &lt;enumeration value="Discover"/>
 *     &lt;enumeration value="JCB"/>
 *     &lt;enumeration value="Diners"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SellerPaymentMethodCodeType")
@XmlEnum
public enum SellerPaymentMethodCodeType {


    /**
     * 
     * 						    No payment method specified - some other payment method.
     * 					
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * 
     * 						    Amex
     * 					
     * 
     */
    @XmlEnumValue("Amex")
    AMEX("Amex"),

    /**
     * 
     * 						   Visa
     * 					
     * 
     */
    @XmlEnumValue("Visa")
    VISA("Visa"),

    /**
     * 
     * 						  Mastercard
     * 					
     * 
     */
    @XmlEnumValue("Mastercard")
    MASTERCARD("Mastercard"),

    /**
     * 
     * 						  Discover
     * 					
     * 
     */
    @XmlEnumValue("Discover")
    DISCOVER("Discover"),

    /**
     * 
     * 						   JCB
     * 					
     * 
     */
    JCB("JCB"),

    /**
     * 
     * 						   Diners
     * 					
     * 
     */
    @XmlEnumValue("Diners")
    DINERS("Diners"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    SellerPaymentMethodCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SellerPaymentMethodCodeType fromValue(String v) {
        for (SellerPaymentMethodCodeType c: SellerPaymentMethodCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
