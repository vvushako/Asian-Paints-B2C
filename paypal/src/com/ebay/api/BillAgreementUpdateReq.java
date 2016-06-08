
package com.ebay.api;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}BAUpdateRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "baUpdateRequest"
})
@XmlRootElement(name = "BillAgreementUpdateReq", namespace = "urn:ebay:api:PayPalAPI")
public class BillAgreementUpdateReq {

    @XmlElement(name = "BAUpdateRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected BAUpdateRequestType baUpdateRequest;

    /**
     * Gets the value of the baUpdateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link BAUpdateRequestType }
     *     
     */
    public BAUpdateRequestType getBAUpdateRequest() {
        return baUpdateRequest;
    }

    /**
     * Sets the value of the baUpdateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BAUpdateRequestType }
     *     
     */
    public void setBAUpdateRequest(BAUpdateRequestType value) {
        this.baUpdateRequest = value;
    }

}
