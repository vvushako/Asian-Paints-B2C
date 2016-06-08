
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ListingDurationCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ListingDurationCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Days_1"/>
 *     &lt;enumeration value="Days_3"/>
 *     &lt;enumeration value="Days_5"/>
 *     &lt;enumeration value="Days_7"/>
 *     &lt;enumeration value="Days_10"/>
 *     &lt;enumeration value="Days_30"/>
 *     &lt;enumeration value="Days_60"/>
 *     &lt;enumeration value="Days_90"/>
 *     &lt;enumeration value="Days_120"/>
 *     &lt;enumeration value="GTC"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ListingDurationCodeType")
@XmlEnum
public enum ListingDurationCodeType {


    /**
     * 
     * 						    1 Day
     * 					
     * 
     */
    @XmlEnumValue("Days_1")
    DAYS_1("Days_1"),

    /**
     * 
     * 						    3 Days
     * 					
     * 
     */
    @XmlEnumValue("Days_3")
    DAYS_3("Days_3"),

    /**
     * 
     * 						   5 Days
     * 					
     * 
     */
    @XmlEnumValue("Days_5")
    DAYS_5("Days_5"),

    /**
     * 
     * 						  7 Days
     * 					
     * 
     */
    @XmlEnumValue("Days_7")
    DAYS_7("Days_7"),

    /**
     * 
     * 						  10 Days
     * 					
     * 
     */
    @XmlEnumValue("Days_10")
    DAYS_10("Days_10"),

    /**
     * 
     * 						  30 Days
     * 					
     * 
     */
    @XmlEnumValue("Days_30")
    DAYS_30("Days_30"),

    /**
     * 
     * 						    60 Days
     * 					
     * 
     */
    @XmlEnumValue("Days_60")
    DAYS_60("Days_60"),

    /**
     * 
     * 						  90 Days
     * 					
     * 
     */
    @XmlEnumValue("Days_90")
    DAYS_90("Days_90"),

    /**
     * 
     * 						  120 Days
     * 					
     * 
     */
    @XmlEnumValue("Days_120")
    DAYS_120("Days_120"),

    /**
     * 
     * 						  GTC
     * 					
     * 
     */
    GTC("GTC"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ListingDurationCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListingDurationCodeType fromValue(String v) {
        for (ListingDurationCodeType c: ListingDurationCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
