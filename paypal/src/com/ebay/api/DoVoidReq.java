
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}DoVoidRequest"/>
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
    "doVoidRequest"
})
@XmlRootElement(name = "DoVoidReq", namespace = "urn:ebay:api:PayPalAPI")
public class DoVoidReq {

    @XmlElement(name = "DoVoidRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected DoVoidRequestType doVoidRequest;

    /**
     * Gets the value of the doVoidRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DoVoidRequestType }
     *     
     */
    public DoVoidRequestType getDoVoidRequest() {
        return doVoidRequest;
    }

    /**
     * Sets the value of the doVoidRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoVoidRequestType }
     *     
     */
    public void setDoVoidRequest(DoVoidRequestType value) {
        this.doVoidRequest = value;
    }

}
