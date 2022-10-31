
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePasswordRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changePassword" type="{urn:core_2022_1.platform.webservices.netsuite.com}ChangePassword"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordRequest", namespace = "urn:messages_2022_1.platform.webservices.netsuite.com", propOrder = {
    "changePassword"
})
public class ChangePasswordRequest
    implements Serializable
{

    @XmlElement(required = true)
    protected ChangePassword changePassword;

    /**
     * Gets the value of the changePassword property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePassword }
     *     
     */
    public ChangePassword getChangePassword() {
        return changePassword;
    }

    /**
     * Sets the value of the changePassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePassword }
     *     
     */
    public void setChangePassword(ChangePassword value) {
        this.changePassword = value;
    }

}
