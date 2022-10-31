
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFieldType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}Record"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fieldType" type="{urn:types.customization_2022_1.setup.webservices.netsuite.com}CustomizationFieldType" minOccurs="0"/&gt;
 *         &lt;element name="scriptId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldType", namespace = "urn:customization_2022_1.setup.webservices.netsuite.com", propOrder = {
    "fieldType",
    "scriptId"
})
@XmlSeeAlso({
    EntityCustomField.class,
    CrmCustomField.class,
    OtherCustomField.class,
    ItemCustomField.class,
    TransactionBodyCustomField.class,
    TransactionColumnCustomField.class,
    ItemOptionCustomField.class,
    CustomRecordCustomField.class,
    ItemNumberCustomField.class
})
public abstract class CustomFieldType
    extends Record
    implements Serializable
{

    @XmlSchemaType(name = "string")
    protected CustomizationFieldType fieldType;
    protected String scriptId;

    /**
     * Gets the value of the fieldType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationFieldType }
     *     
     */
    public CustomizationFieldType getFieldType() {
        return fieldType;
    }

    /**
     * Sets the value of the fieldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationFieldType }
     *     
     */
    public void setFieldType(CustomizationFieldType value) {
        this.fieldType = value;
    }

    /**
     * Gets the value of the scriptId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScriptId() {
        return scriptId;
    }

    /**
     * Sets the value of the scriptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScriptId(String value) {
        this.scriptId = value;
    }

}
