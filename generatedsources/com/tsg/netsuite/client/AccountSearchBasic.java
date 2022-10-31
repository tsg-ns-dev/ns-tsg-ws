
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountSearchBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecordBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountingContext" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="balance" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/&gt;
 *         &lt;element name="cashFlowRateType" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="category1099Misc" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="externalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="externalIdString" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="generalRateType" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalId" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="internalIdNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/&gt;
 *         &lt;element name="isInactive" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/&gt;
 *         &lt;element name="legalName" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="locale" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="localizedLegalName" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="localizedName" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="localizedNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="number" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/&gt;
 *         &lt;element name="customFieldList" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountSearchBasic", namespace = "urn:common_2022_1.platform.webservices.netsuite.com", propOrder = {
    "accountingContext",
    "balance",
    "cashFlowRateType",
    "category1099Misc",
    "description",
    "externalId",
    "externalIdString",
    "generalRateType",
    "internalId",
    "internalIdNumber",
    "isInactive",
    "legalName",
    "locale",
    "localizedLegalName",
    "localizedName",
    "localizedNumber",
    "name",
    "number",
    "parent",
    "subsidiary",
    "type",
    "customFieldList"
})
public class AccountSearchBasic
    extends SearchRecordBasic
    implements Serializable
{

    protected SearchMultiSelectField accountingContext;
    protected SearchDoubleField balance;
    protected SearchEnumMultiSelectField cashFlowRateType;
    protected SearchMultiSelectField category1099Misc;
    protected SearchStringField description;
    protected SearchMultiSelectField externalId;
    protected SearchStringField externalIdString;
    protected SearchEnumMultiSelectField generalRateType;
    protected SearchMultiSelectField internalId;
    protected SearchLongField internalIdNumber;
    protected SearchBooleanField isInactive;
    protected SearchStringField legalName;
    protected SearchEnumMultiSelectField locale;
    protected SearchStringField localizedLegalName;
    protected SearchStringField localizedName;
    protected SearchStringField localizedNumber;
    protected SearchStringField name;
    protected SearchStringField number;
    protected SearchMultiSelectField parent;
    protected SearchMultiSelectField subsidiary;
    protected SearchEnumMultiSelectField type;
    protected SearchCustomFieldList customFieldList;

    /**
     * Gets the value of the accountingContext property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getAccountingContext() {
        return accountingContext;
    }

    /**
     * Sets the value of the accountingContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setAccountingContext(SearchMultiSelectField value) {
        this.accountingContext = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBalance(SearchDoubleField value) {
        this.balance = value;
    }

    /**
     * Gets the value of the cashFlowRateType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getCashFlowRateType() {
        return cashFlowRateType;
    }

    /**
     * Sets the value of the cashFlowRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setCashFlowRateType(SearchEnumMultiSelectField value) {
        this.cashFlowRateType = value;
    }

    /**
     * Gets the value of the category1099Misc property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCategory1099Misc() {
        return category1099Misc;
    }

    /**
     * Sets the value of the category1099Misc property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCategory1099Misc(SearchMultiSelectField value) {
        this.category1099Misc = value;
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
     * Gets the value of the generalRateType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getGeneralRateType() {
        return generalRateType;
    }

    /**
     * Sets the value of the generalRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setGeneralRateType(SearchEnumMultiSelectField value) {
        this.generalRateType = value;
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
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setLegalName(SearchStringField value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setLocale(SearchEnumMultiSelectField value) {
        this.locale = value;
    }

    /**
     * Gets the value of the localizedLegalName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getLocalizedLegalName() {
        return localizedLegalName;
    }

    /**
     * Sets the value of the localizedLegalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setLocalizedLegalName(SearchStringField value) {
        this.localizedLegalName = value;
    }

    /**
     * Gets the value of the localizedName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getLocalizedName() {
        return localizedName;
    }

    /**
     * Sets the value of the localizedName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setLocalizedName(SearchStringField value) {
        this.localizedName = value;
    }

    /**
     * Gets the value of the localizedNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getLocalizedNumber() {
        return localizedNumber;
    }

    /**
     * Sets the value of the localizedNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setLocalizedNumber(SearchStringField value) {
        this.localizedNumber = value;
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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setNumber(SearchStringField value) {
        this.number = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParent(SearchMultiSelectField value) {
        this.parent = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidiary(SearchMultiSelectField value) {
        this.subsidiary = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setType(SearchEnumMultiSelectField value) {
        this.type = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
