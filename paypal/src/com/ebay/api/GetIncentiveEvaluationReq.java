
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
 *         &lt;element ref="{urn:ebay:api:PayPalAPI}GetIncentiveEvaluationRequest"/>
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
    "getIncentiveEvaluationRequest"
})
@XmlRootElement(name = "GetIncentiveEvaluationReq", namespace = "urn:ebay:api:PayPalAPI")
public class GetIncentiveEvaluationReq {

    @XmlElement(name = "GetIncentiveEvaluationRequest", namespace = "urn:ebay:api:PayPalAPI", required = true)
    protected GetIncentiveEvaluationRequestType getIncentiveEvaluationRequest;

    /**
     * Gets the value of the getIncentiveEvaluationRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GetIncentiveEvaluationRequestType }
     *     
     */
    public GetIncentiveEvaluationRequestType getGetIncentiveEvaluationRequest() {
        return getIncentiveEvaluationRequest;
    }

    /**
     * Sets the value of the getIncentiveEvaluationRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetIncentiveEvaluationRequestType }
     *     
     */
    public void setGetIncentiveEvaluationRequest(GetIncentiveEvaluationRequestType value) {
        this.getIncentiveEvaluationRequest = value;
    }

}
