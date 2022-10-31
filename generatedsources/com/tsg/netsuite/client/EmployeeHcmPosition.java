
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmployeeHcmPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeHcmPosition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="position" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="primaryPosition" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="positionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="positionAllocation" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="fullTimeEquivalent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="employmentCategory" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="reportsTo" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="subsidiary" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeHcmPosition", namespace = "urn:employees_2022_1.lists.webservices.netsuite.com", propOrder = {
    "position",
    "primaryPosition",
    "positionId",
    "positionAllocation",
    "fullTimeEquivalent",
    "employmentCategory",
    "reportsTo",
    "subsidiary",
    "location"
})
public class EmployeeHcmPosition
    implements Serializable
{

    protected RecordRef position;
    protected Boolean primaryPosition;
    protected String positionId;
    protected Double positionAllocation;
    protected Double fullTimeEquivalent;
    protected RecordRef employmentCategory;
    protected RecordRef reportsTo;
    protected RecordRef subsidiary;
    protected RecordRef location;

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPosition(RecordRef value) {
        this.position = value;
    }

    /**
     * Gets the value of the primaryPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryPosition() {
        return primaryPosition;
    }

    /**
     * Sets the value of the primaryPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryPosition(Boolean value) {
        this.primaryPosition = value;
    }

    /**
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionId(String value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the positionAllocation property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPositionAllocation() {
        return positionAllocation;
    }

    /**
     * Sets the value of the positionAllocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPositionAllocation(Double value) {
        this.positionAllocation = value;
    }

    /**
     * Gets the value of the fullTimeEquivalent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFullTimeEquivalent() {
        return fullTimeEquivalent;
    }

    /**
     * Sets the value of the fullTimeEquivalent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFullTimeEquivalent(Double value) {
        this.fullTimeEquivalent = value;
    }

    /**
     * Gets the value of the employmentCategory property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEmploymentCategory() {
        return employmentCategory;
    }

    /**
     * Sets the value of the employmentCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEmploymentCategory(RecordRef value) {
        this.employmentCategory = value;
    }

    /**
     * Gets the value of the reportsTo property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getReportsTo() {
        return reportsTo;
    }

    /**
     * Sets the value of the reportsTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setReportsTo(RecordRef value) {
        this.reportsTo = value;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSubsidiary() {
        return subsidiary;
    }

    /**
     * Sets the value of the subsidiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSubsidiary(RecordRef value) {
        this.subsidiary = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLocation(RecordRef value) {
        this.location = value;
    }

}
