
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="doesNotAddToTotal" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="postToItemCost" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="taxInNetAmount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reverseCharge" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="nexusAccountsList" type="{urn:accounting_2022_1.lists.webservices.netsuite.com}TaxTypeNexusAccountsList" minOccurs="0"/&gt;
 *         &lt;element name="nexusesTaxList" type="{urn:accounting_2022_1.lists.webservices.netsuite.com}TaxTypeNexusesTaxList" minOccurs="0"/&gt;
 *         &lt;element name="country" type="{urn:types.common_2022_1.platform.webservices.netsuite.com}Country" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "name",
    "description",
    "doesNotAddToTotal",
    "postToItemCost",
    "taxInNetAmount",
    "reverseCharge",
    "isInactive",
    "nexusAccountsList",
    "nexusesTaxList",
    "country"
})
public class TaxType
    extends Record
    implements Serializable
{

    protected String name;
    protected String description;
    protected Boolean doesNotAddToTotal;
    protected Boolean postToItemCost;
    protected Boolean taxInNetAmount;
    protected Boolean reverseCharge;
    protected Boolean isInactive;
    protected TaxTypeNexusAccountsList nexusAccountsList;
    protected TaxTypeNexusesTaxList nexusesTaxList;
    @XmlSchemaType(name = "string")
    protected Country country;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the doesNotAddToTotal property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoesNotAddToTotal() {
        return doesNotAddToTotal;
    }

    /**
     * Sets the value of the doesNotAddToTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoesNotAddToTotal(Boolean value) {
        this.doesNotAddToTotal = value;
    }

    /**
     * Gets the value of the postToItemCost property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostToItemCost() {
        return postToItemCost;
    }

    /**
     * Sets the value of the postToItemCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostToItemCost(Boolean value) {
        this.postToItemCost = value;
    }

    /**
     * Gets the value of the taxInNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTaxInNetAmount() {
        return taxInNetAmount;
    }

    /**
     * Sets the value of the taxInNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxInNetAmount(Boolean value) {
        this.taxInNetAmount = value;
    }

    /**
     * Gets the value of the reverseCharge property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReverseCharge() {
        return reverseCharge;
    }

    /**
     * Sets the value of the reverseCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReverseCharge(Boolean value) {
        this.reverseCharge = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the nexusAccountsList property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeNexusAccountsList }
     *     
     */
    public TaxTypeNexusAccountsList getNexusAccountsList() {
        return nexusAccountsList;
    }

    /**
     * Sets the value of the nexusAccountsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeNexusAccountsList }
     *     
     */
    public void setNexusAccountsList(TaxTypeNexusAccountsList value) {
        this.nexusAccountsList = value;
    }

    /**
     * Gets the value of the nexusesTaxList property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeNexusesTaxList }
     *     
     */
    public TaxTypeNexusesTaxList getNexusesTaxList() {
        return nexusesTaxList;
    }

    /**
     * Sets the value of the nexusesTaxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeNexusesTaxList }
     *     
     */
    public void setNexusesTaxList(TaxTypeNexusesTaxList value) {
        this.nexusesTaxList = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
