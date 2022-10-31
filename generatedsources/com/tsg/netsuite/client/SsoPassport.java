
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SsoPassport complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SsoPassport"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authenticationToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnerId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnerAccount" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnerUserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SsoPassport", namespace = "urn:core_2022_1.platform.webservices.netsuite.com", propOrder = {
    "authenticationToken",
    "partnerId",
    "partnerAccount",
    "partnerUserId"
})
public class SsoPassport
    implements Serializable
{

    @XmlElement(required = true)
    protected String authenticationToken;
    @XmlElement(required = true)
    protected String partnerId;
    @XmlElement(required = true)
    protected String partnerAccount;
    @XmlElement(required = true)
    protected String partnerUserId;

    /**
     * Gets the value of the authenticationToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationToken() {
        return authenticationToken;
    }

    /**
     * Sets the value of the authenticationToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationToken(String value) {
        this.authenticationToken = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the partnerAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerAccount() {
        return partnerAccount;
    }

    /**
     * Sets the value of the partnerAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerAccount(String value) {
        this.partnerAccount = value;
    }

    /**
     * Gets the value of the partnerUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerUserId() {
        return partnerUserId;
    }

    /**
     * Sets the value of the partnerUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerUserId(String value) {
        this.partnerUserId = value;
    }

}
