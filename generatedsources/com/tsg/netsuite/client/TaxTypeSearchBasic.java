
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxTypeSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxTypeSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="country" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="doesNotAddToTotal" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalIdString" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="nexus" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="payablesAccount" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="postToItemCost" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="receivablesAccount" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="reverseCharge" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="taxInNetAmount" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxTypeSearchBasic", namespace = "urn:common_2022_1.platform.webservices.netsuite.com", propOrder = {
    "country",
    "description",
    "doesNotAddToTotal",
    "externalId",
    "externalIdString",
    "internalId",
    "internalIdNumber",
    "isInactive",
    "name",
    "nexus",
    "payablesAccount",
    "postToItemCost",
    "receivablesAccount",
    "reverseCharge",
    "taxInNetAmount"
})
public class TaxTypeSearchBasic
    extends SearchRecordBasic
    implements Serializable
{

    protected SearchEnumMultiSelectField country;
    protected SearchStringField description;
    protected SearchBooleanField doesNotAddToTotal;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isInactive;
    protected SearchStringField name;
    protected SearchMultiSelectField nexus;
    protected SearchMultiSelectField payablesAccount;
    protected SearchBooleanField postToItemCost;
    protected SearchMultiSelectField receivablesAccount;
    protected SearchBooleanField reverseCharge;
    protected SearchBooleanField taxInNetAmount;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCountry(SearchEnumMultiSelectField value) {
        this.country = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setDescription(SearchStringField value) {
        this.description = value;
    }

    /**
     * Gets the value of the doesNotAddToTotal property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getDoesNotAddToTotal() {
        return doesNotAddToTotal;
    }

    /**
     * Sets the value of the doesNotAddToTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setDoesNotAddToTotal(SearchBooleanField value) {
        this.doesNotAddToTotal = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setExternalId(SearchMultiSelectField value) {
        this.externalId = value;
    }

    /**
     * Gets the value of the externalIdString property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getExternalIdString() {
        return externalIdString;
    }

    /**
     * Sets the value of the externalIdString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setExternalIdString(SearchStringField value) {
        this.externalIdString = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setInternalId(SearchMultiSelectField value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the internalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }

    /**
     * Sets the value of the internalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setInternalIdNumber(SearchLongField value) {
        this.internalIdNumber = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsInactive(SearchBooleanField value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setName(SearchStringField value) {
        this.name = value;
    }

    /**
     * Gets the value of the nexus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getNexus() {
        return nexus;
    }

    /**
     * Sets the value of the nexus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setNexus(SearchMultiSelectField value) {
        this.nexus = value;
    }

    /**
     * Gets the value of the payablesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPayablesAccount() {
        return payablesAccount;
    }

    /**
     * Sets the value of the payablesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPayablesAccount(SearchMultiSelectField value) {
        this.payablesAccount = value;
    }

    /**
     * Gets the value of the postToItemCost property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPostToItemCost() {
        return postToItemCost;
    }

    /**
     * Sets the value of the postToItemCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPostToItemCost(SearchBooleanField value) {
        this.postToItemCost = value;
    }

    /**
     * Gets the value of the receivablesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getReceivablesAccount() {
        return receivablesAccount;
    }

    /**
     * Sets the value of the receivablesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setReceivablesAccount(SearchMultiSelectField value) {
        this.receivablesAccount = value;
    }

    /**
     * Gets the value of the reverseCharge property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getReverseCharge() {
        return reverseCharge;
    }

    /**
     * Sets the value of the reverseCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setReverseCharge(SearchBooleanField value) {
        this.reverseCharge = value;
    }

    /**
     * Gets the value of the taxInNetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTaxInNetAmount() {
        return taxInNetAmount;
    }

    /**
     * Sets the value of the taxInNetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTaxInNetAmount(SearchBooleanField value) {
        this.taxInNetAmount = value;
    }

}
