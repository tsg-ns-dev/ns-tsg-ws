
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCurrencyRateResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCurrencyRateResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_1.platform.webservices.netsuite.com}getCurrencyRateResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCurrencyRateResponse", namespace = "urn:messages_2022_1.platform.webservices.netsuite.com", propOrder = {
    "getCurrencyRateResult"
})
public class GetCurrencyRateResponse
    implements Serializable
{

    @XmlElement(namespace = "urn:core_2022_1.platform.webservices.netsuite.com", required = true)
    protected GetCurrencyRateResult getCurrencyRateResult;

    /**
     * Gets the value of the getCurrencyRateResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCurrencyRateResult }
     *     
     */
    public GetCurrencyRateResult getGetCurrencyRateResult() {
        return getCurrencyRateResult;
    }

    /**
     * Sets the value of the getCurrencyRateResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCurrencyRateResult }
     *     
     */
    public void setGetCurrencyRateResult(GetCurrencyRateResult value) {
        this.getCurrencyRateResult = value;
    }

}
