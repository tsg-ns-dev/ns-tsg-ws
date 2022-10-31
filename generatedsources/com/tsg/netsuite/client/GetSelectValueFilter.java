
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSelectValueFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSelectValueFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filterValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="operator" use="required" type="{urn:types.core_2022_1.platform.webservices.netsuite.com}GetSelectValueFilterOperator" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSelectValueFilter", namespace = "urn:core_2022_1.platform.webservices.netsuite.com", propOrder = {
    "filterValue"
})
public class GetSelectValueFilter
    implements Serializable
{

    @XmlElement(required = true)
    protected String filterValue;
    @XmlAttribute(name = "operator", required = true)
    protected GetSelectValueFilterOperator operator;

    /**
     * Gets the value of the filterValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValue() {
        return filterValue;
    }

    /**
     * Sets the value of the filterValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValue(String value) {
        this.filterValue = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueFilterOperator }
     *     
     */
    public GetSelectValueFilterOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueFilterOperator }
     *     
     */
    public void setOperator(GetSelectValueFilterOperator value) {
        this.operator = value;
    }

}
