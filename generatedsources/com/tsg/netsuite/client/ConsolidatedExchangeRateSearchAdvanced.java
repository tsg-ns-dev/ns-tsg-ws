
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsolidatedExchangeRateSearchAdvanced complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsolidatedExchangeRateSearchAdvanced"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="criteria" type="{urn:accounting_2022_1.lists.webservices.netsuite.com}ConsolidatedExchangeRateSearch" minOccurs="0"/&gt;
 *         &lt;element name="columns" type="{urn:accounting_2022_1.lists.webservices.netsuite.com}ConsolidatedExchangeRateSearchRow" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="savedSearchId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="savedSearchScriptId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsolidatedExchangeRateSearchAdvanced", propOrder = {
    "criteria",
    "columns"
})
public class ConsolidatedExchangeRateSearchAdvanced
    extends SearchRecord
    implements Serializable
{

    protected ConsolidatedExchangeRateSearch criteria;
    protected ConsolidatedExchangeRateSearchRow columns;
    @XmlAttribute(name = "savedSearchId")
    protected String savedSearchId;
    @XmlAttribute(name = "savedSearchScriptId")
    protected String savedSearchScriptId;

    /**
     * Gets the value of the criteria property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedExchangeRateSearch }
     *     
     */
    public ConsolidatedExchangeRateSearch getCriteria() {
        return criteria;
    }

    /**
     * Sets the value of the criteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedExchangeRateSearch }
     *     
     */
    public void setCriteria(ConsolidatedExchangeRateSearch value) {
        this.criteria = value;
    }

    /**
     * Gets the value of the columns property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedExchangeRateSearchRow }
     *     
     */
    public ConsolidatedExchangeRateSearchRow getColumns() {
        return columns;
    }

    /**
     * Sets the value of the columns property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedExchangeRateSearchRow }
     *     
     */
    public void setColumns(ConsolidatedExchangeRateSearchRow value) {
        this.columns = value;
    }

    /**
     * Gets the value of the savedSearchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchId() {
        return savedSearchId;
    }

    /**
     * Sets the value of the savedSearchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchId(String value) {
        this.savedSearchId = value;
    }

    /**
     * Gets the value of the savedSearchScriptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSavedSearchScriptId() {
        return savedSearchScriptId;
    }

    /**
     * Sets the value of the savedSearchScriptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSavedSearchScriptId(String value) {
        this.savedSearchScriptId = value;
    }

}
