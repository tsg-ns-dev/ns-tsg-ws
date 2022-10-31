
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidatedExchangeRate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedExchangeRate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="postingPeriod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromSubsidiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fromCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toSubsidiary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="averageRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="currentRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="historicalRate" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="accountingBook" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPeriodClosed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isDerived" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="isEliminationSubsidiary" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "ConsolidatedExchangeRate", propOrder = {
    "postingPeriod",
    "fromSubsidiary",
    "fromCurrency",
    "toSubsidiary",
    "toCurrency",
    "averageRate",
    "currentRate",
    "historicalRate",
    "accountingBook",
    "isPeriodClosed",
    "isDerived",
    "isEliminationSubsidiary"
})
public class ConsolidatedExchangeRate
    extends Record
    implements Serializable
{

    protected String postingPeriod;
    protected String fromSubsidiary;
    protected String fromCurrency;
    protected String toSubsidiary;
    protected String toCurrency;
    protected Double averageRate;
    protected Double currentRate;
    protected Double historicalRate;
    protected String accountingBook;
    protected Boolean isPeriodClosed;
    protected Boolean isDerived;
    protected Boolean isEliminationSubsidiary;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the postingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostingPeriod() {
        return postingPeriod;
    }

    /**
     * Sets the value of the postingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostingPeriod(String value) {
        this.postingPeriod = value;
    }

    /**
     * Gets the value of the fromSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromSubsidiary() {
        return fromSubsidiary;
    }

    /**
     * Sets the value of the fromSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromSubsidiary(String value) {
        this.fromSubsidiary = value;
    }

    /**
     * Gets the value of the fromCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromCurrency() {
        return fromCurrency;
    }

    /**
     * Sets the value of the fromCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromCurrency(String value) {
        this.fromCurrency = value;
    }

    /**
     * Gets the value of the toSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSubsidiary() {
        return toSubsidiary;
    }

    /**
     * Sets the value of the toSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToSubsidiary(String value) {
        this.toSubsidiary = value;
    }

    /**
     * Gets the value of the toCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToCurrency() {
        return toCurrency;
    }

    /**
     * Sets the value of the toCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToCurrency(String value) {
        this.toCurrency = value;
    }

    /**
     * Gets the value of the averageRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getAverageRate() {
        return averageRate;
    }

    /**
     * Sets the value of the averageRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setAverageRate(Double value) {
        this.averageRate = value;
    }

    /**
     * Gets the value of the currentRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCurrentRate() {
        return currentRate;
    }

    /**
     * Sets the value of the currentRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCurrentRate(Double value) {
        this.currentRate = value;
    }

    /**
     * Gets the value of the historicalRate property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHistoricalRate() {
        return historicalRate;
    }

    /**
     * Sets the value of the historicalRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHistoricalRate(Double value) {
        this.historicalRate = value;
    }

    /**
     * Gets the value of the accountingBook property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingBook() {
        return accountingBook;
    }

    /**
     * Sets the value of the accountingBook property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingBook(String value) {
        this.accountingBook = value;
    }

    /**
     * Gets the value of the isPeriodClosed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPeriodClosed() {
        return isPeriodClosed;
    }

    /**
     * Sets the value of the isPeriodClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPeriodClosed(Boolean value) {
        this.isPeriodClosed = value;
    }

    /**
     * Gets the value of the isDerived property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDerived() {
        return isDerived;
    }

    /**
     * Sets the value of the isDerived property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDerived(Boolean value) {
        this.isDerived = value;
    }

    /**
     * Gets the value of the isEliminationSubsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsEliminationSubsidiary() {
        return isEliminationSubsidiary;
    }

    /**
     * Sets the value of the isEliminationSubsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsEliminationSubsidiary(Boolean value) {
        this.isEliminationSubsidiary = value;
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
