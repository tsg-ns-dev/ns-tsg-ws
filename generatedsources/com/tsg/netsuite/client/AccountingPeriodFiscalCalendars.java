
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountingPeriodFiscalCalendars complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingPeriodFiscalCalendars"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fiscalCalendar" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="parent" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingPeriodFiscalCalendars", propOrder = {
    "fiscalCalendar",
    "parent"
})
public class AccountingPeriodFiscalCalendars
    implements Serializable
{

    protected RecordRef fiscalCalendar;
    protected RecordRef parent;

    /**
     * Gets the value of the fiscalCalendar property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFiscalCalendar() {
        return fiscalCalendar;
    }

    /**
     * Sets the value of the fiscalCalendar property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFiscalCalendar(RecordRef value) {
        this.fiscalCalendar = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParent(RecordRef value) {
        this.parent = value;
    }

}
