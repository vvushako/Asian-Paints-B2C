
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExternalPartnerTrackingDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExternalPartnerTrackingDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExternalPartnerSegmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExternalPartnerTrackingDetailsType", propOrder = {
    "externalPartnerSegmentID"
})
public class ExternalPartnerTrackingDetailsType {

    @XmlElement(name = "ExternalPartnerSegmentID")
    protected String externalPartnerSegmentID;

    /**
     * Gets the value of the externalPartnerSegmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalPartnerSegmentID() {
        return externalPartnerSegmentID;
    }

    /**
     * Sets the value of the externalPartnerSegmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalPartnerSegmentID(String value) {
        this.externalPartnerSegmentID = value;
    }

}
