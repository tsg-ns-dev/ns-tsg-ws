
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomizationIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomizationIdResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:core_2022_1.platform.webservices.netsuite.com}getCustomizationIdResult"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomizationIdResponse", namespace = "urn:messages_2022_1.platform.webservices.netsuite.com", propOrder = {
    "getCustomizationIdResult"
})
public class GetCustomizationIdResponse
    implements Serializable
{

    @XmlElement(namespace = "urn:core_2022_1.platform.webservices.netsuite.com", required = true)
    protected GetCustomizationIdResult getCustomizationIdResult;

    /**
     * Gets the value of the getCustomizationIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomizationIdResult }
     *     
     */
    public GetCustomizationIdResult getGetCustomizationIdResult() {
        return getCustomizationIdResult;
    }

    /**
     * Sets the value of the getCustomizationIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomizationIdResult }
     *     
     */
    public void setGetCustomizationIdResult(GetCustomizationIdResult value) {
        this.getCustomizationIdResult = value;
    }

}
