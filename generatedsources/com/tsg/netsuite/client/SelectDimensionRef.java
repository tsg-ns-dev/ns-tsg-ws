
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SelectDimensionRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectDimensionRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}DimensionRef"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{urn:core_2022_1.platform.webservices.netsuite.com}ListOrRecordRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectDimensionRef", namespace = "urn:core_2022_1.platform.webservices.netsuite.com", propOrder = {
    "value"
})
public class SelectDimensionRef
    extends DimensionRef
    implements Serializable
{

    @XmlElement(required = true)
    protected ListOrRecordRef value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ListOrRecordRef }
     *     
     */
    public ListOrRecordRef getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOrRecordRef }
     *     
     */
    public void setValue(ListOrRecordRef value) {
        this.value = value;
    }

}
