
package com.tsg.netsuite.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimeSheetSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeSheetSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeSheetSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="employeeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeBillJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeBillSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="timeEntryJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TimeEntrySearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="customSearchJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}CustomSearchJoin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeSheetSearch", namespace = "urn:employees_2022_1.transactions.webservices.netsuite.com", propOrder = {
    "basic",
    "employeeJoin",
    "timeBillJoin",
    "timeEntryJoin",
    "customSearchJoin"
})
public class TimeSheetSearch
    extends SearchRecord
    implements Serializable
{

    protected TimeSheetSearchBasic basic;
    protected EmployeeSearchBasic employeeJoin;
    protected TimeBillSearchBasic timeBillJoin;
    protected TimeEntrySearchBasic timeEntryJoin;
    protected List<CustomSearchJoin> customSearchJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TimeSheetSearchBasic }
     *     
     */
    public TimeSheetSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeSheetSearchBasic }
     *     
     */
    public void setBasic(TimeSheetSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the timeBillJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public TimeBillSearchBasic getTimeBillJoin() {
        return timeBillJoin;
    }

    /**
     * Sets the value of the timeBillJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeBillSearchBasic }
     *     
     */
    public void setTimeBillJoin(TimeBillSearchBasic value) {
        this.timeBillJoin = value;
    }

    /**
     * Gets the value of the timeEntryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TimeEntrySearchBasic }
     *     
     */
    public TimeEntrySearchBasic getTimeEntryJoin() {
        return timeEntryJoin;
    }

    /**
     * Sets the value of the timeEntryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeEntrySearchBasic }
     *     
     */
    public void setTimeEntryJoin(TimeEntrySearchBasic value) {
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
     * {@link CustomSearchJoin }
     * 
     * 
     */
    public List<CustomSearchJoin> getCustomSearchJoin() {
        if (customSearchJoin == null) {
            customSearchJoin = new ArrayList<CustomSearchJoin>();
        }
        return this.customSearchJoin;
    }

}
