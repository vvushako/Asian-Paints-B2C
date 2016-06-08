
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoAuthorizationRequest"/>
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
    "doAuthorizationRequest"
})
@XmlRootElement(name = "DoAuthorizationReq", namespace = "urn:ebay:api:PayPalAPI")
public class DoAuthorizationReq {

    @XmlElement(name = "DoAuthorizationRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected DoAuthorizationRequestType doAuthorizationRequest;

    /**
     * Gets the value of the doAuthorizationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoAuthorizationRequestType }
     *     
     */
    public DoAuthorizationRequestType getDoAuthorizationRequest() {
        return doAuthorizationRequest;
    }

    /**
     * Sets the value of the doAuthorizationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoAuthorizationRequestType }
     *     
     */
    public void setDoAuthorizationRequest(DoAuthorizationRequestType value) {
        this.doAuthorizationRequest = value;
    }

}
