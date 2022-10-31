
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:messages_2022_1.platform.webservices.netsuite.com}sessionResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResponse", namespace = "urn:messages_2022_1.platform.webservices.netsuite.com", propOrder = {
    "sessionResponse"
})
public class LoginResponse
    implements Serializable
{

    @XmlElement(required = true)
    protected SessionResponse sessionResponse;

    /**
     * Gets the value of the sessionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SessionResponse }
     *     
     */
    public SessionResponse getSessionResponse() {
        return sessionResponse;
    }

    /**
     * Sets the value of the sessionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionResponse }
     *     
     */
    public void setSessionResponse(SessionResponse value) {
        this.sessionResponse = value;
    }

}