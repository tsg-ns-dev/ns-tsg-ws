
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomRecordTypeSublists complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomRecordTypeSublists"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="recordSearch" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="recordDescr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recordDescrLanguageValueList" type="{urn:customization_2022_1.setup.webservices.netsuite.com}LanguageValueList" minOccurs="0"/&gt;
 *         &lt;element name="recordTab" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="recordId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRecordTypeSublists", namespace = "urn:customization_2022_1.setup.webservices.netsuite.com", propOrder = {
    "recordSearch",
    "recordDescr",
    "recordDescrLanguageValueList",
    "recordTab",
    "recordId"
})
public class CustomRecordTypeSublists
    implements Serializable
{

    protected RecordRef recordSearch;
    protected String recordDescr;
    protected LanguageValueList recordDescrLanguageValueList;
    protected RecordRef recordTab;
    protected String recordId;

    /**
     * Gets the value of the recordSearch property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRecordSearch() {
        return recordSearch;
    }

    /**
     * Sets the value of the recordSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRecordSearch(RecordRef value) {
        this.recordSearch = value;
    }

    /**
     * Gets the value of the recordDescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordDescr() {
        return recordDescr;
    }

    /**
     * Sets the value of the recordDescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordDescr(String value) {
        this.recordDescr = value;
    }

    /**
     * Gets the value of the recordDescrLanguageValueList property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageValueList }
     *     
     */
    public LanguageValueList getRecordDescrLanguageValueList() {
        return recordDescrLanguageValueList;
    }

    /**
     * Sets the value of the recordDescrLanguageValueList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageValueList }
     *     
     */
    public void setRecordDescrLanguageValueList(LanguageValueList value) {
        this.recordDescrLanguageValueList = value;
    }

    /**
     * Gets the value of the recordTab property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getRecordTab() {
        return recordTab;
    }

    /**
     * Sets the value of the recordTab property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setRecordTab(RecordRef value) {
        this.recordTab = value;
    }

    /**
     * Gets the value of the recordId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * Sets the value of the recordId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordId(String value) {
        this.recordId = value;
    }

}
