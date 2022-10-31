
package com.tsg.netsuite.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSheetSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSheetSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeSheetSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="employeeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeBillJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeBillSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeEntryJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeEntrySearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomSearchRowBasic" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSheetSearchRow", namespace = "urn:employees_2022_1.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "employeeJoin",
    "timeBillJoin",
    "timeEntryJoin",
    "customSearchJoin"
})
public class TimeSheetSearchRow
    extends SearchRow
    implements Serializable
{

    protected TimeSheetSearchRowBasic basic;
    protected EmployeeSearchRowBasic employeeJoin;
    protected TimeBillSearchRowBasic timeBillJoin;
    protected TimeEntrySearchRowBasic timeEntryJoin;
    protected List<CustomSearchRowBasic> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSheetSearchRowBasic }
     *     
     */
    public TimeSheetSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSheetSearchRowBasic }
     *     
     */
    public void setBasic(TimeSheetSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchRowBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the timeBillJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public TimeBillSearchRowBasic getTimeBillJoin() {
        return timeBillJoin;
    }

    /**
     * Sets the value of the timeBillJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchRowBasic }
     *     
     */
    public void setTimeBillJoin(TimeBillSearchRowBasic value) {
        this.timeBillJoin = value;
    }

    /**
     * Gets the value of the timeEntryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntrySearchRowBasic }
     *     
     */
    public TimeEntrySearchRowBasic getTimeEntryJoin() {
        return timeEntryJoin;
    }

    /**
     * Sets the value of the timeEntryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntrySearchRowBasic }
     *     
     */
    public void setTimeEntryJoin(TimeEntrySearchRowBasic value) {
        this.timeEntryJoin = value;
    }

    /**
     * Gets the value of the customSearchJoin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customSearchJoin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomSearchJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomSearchRowBasic }
     * 
     * 
     */
    public List<CustomSearchRowBasic> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchRowBasic>();
        }
        return this.customSearchJoin;
    }

}
