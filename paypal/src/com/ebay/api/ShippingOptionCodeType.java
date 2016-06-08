
package com.ebay.api;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShippingOptionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ShippingOptionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="SiteOnly"/>
 *     &lt;enumeration value="WorldWide"/>
 *     &lt;enumeration value="SitePlusRegions"/>
 *     &lt;enumeration value="WillNotShip"/>
 *     &lt;enumeration value="CustomCode"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ShippingOptionCodeType")
@XmlEnum
public enum ShippingOptionCodeType {


    /**
     * 
     * 						    Site only.
     * 					
     * 
     */
    @XmlEnumValue("SiteOnly")
    SITE_ONLY("SiteOnly"),

    /**
     * 
     * 						   WorldWide.
     * 					
     * 
     */
    @XmlEnumValue("WorldWide")
    WORLD_WIDE("WorldWide"),

    /**
     * 
     * 						   SitePlusRegions.
     * 					
     * 
     */
    @XmlEnumValue("SitePlusRegions")
    SITE_PLUS_REGIONS("SitePlusRegions"),

    /**
     * 
     * 						   WillNotShip.
     * 					
     * 
     */
    @XmlEnumValue("WillNotShip")
    WILL_NOT_SHIP("WillNotShip"),

    /**
     * 
     * 						  Reserved for internal or future use.
     * 					
     * 
     */
    @XmlEnumValue("CustomCode")
    CUSTOM_CODE("CustomCode");
    private final String value;

    ShippingOptionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShippingOptionCodeType fromValue(String v) {
        for (ShippingOptionCodeType c: ShippingOptionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
