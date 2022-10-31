
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsoLoginRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsoLoginRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ssoPassport" type="{urn:core_2022_1.platform.webservices.netsuite.com}SsoPassport"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsoLoginRequest", namespace = "urn:messages_2022_1.platform.webservices.netsuite.com", propOrder = {
    "ssoPassport"
})
public class SsoLoginRequest
    implements Serializable
{

    @XmlElement(required = true)
    protected SsoPassport ssoPassport;

    /**
     * Gets the value of the ssoPassport property.
     * 
     * @return
     *     possible object is
     *     {@link SsoPassport }
     *     
     */
    public SsoPassport getSsoPassport() {
        return ssoPassport;
    }

    /**
     * Sets the value of the ssoPassport property.
     * 
     * @param value
     *     allowed object is
     *     {@link SsoPassport }
     *     
     */
    public void setSsoPassport(SsoPassport value) {
        this.ssoPassport = value;
    }

}
