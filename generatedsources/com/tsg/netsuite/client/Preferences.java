
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Preferences complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Preferences"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="warningAsError" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="disableMandatoryCustomFieldValidation" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="disableSystemNotesForCustomFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ignoreReadOnlyFields" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="runServerSuiteScriptAndTriggerWorkflows" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Preferences", namespace = "urn:messages_2022_1.platform.webservices.netsuite.com", propOrder = {
    "warningAsError",
    "disableMandatoryCustomFieldValidation",
    "disableSystemNotesForCustomFields",
    "ignoreReadOnlyFields",
    "runServerSuiteScriptAndTriggerWorkflows"
})
public class Preferences
    implements Serializable
{

    protected Boolean warningAsError;
    protected Boolean disableMandatoryCustomFieldValidation;
    protected Boolean disableSystemNotesForCustomFields;
    protected Boolean ignoreReadOnlyFields;
    protected Boolean runServerSuiteScriptAndTriggerWorkflows;

    /**
     * Gets the value of the warningAsError property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWarningAsError() {
        return warningAsError;
    }

    /**
     * Sets the value of the warningAsError property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWarningAsError(Boolean value) {
        this.warningAsError = value;
    }

    /**
     * Gets the value of the disableMandatoryCustomFieldValidation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableMandatoryCustomFieldValidation() {
        return disableMandatoryCustomFieldValidation;
    }

    /**
     * Sets the value of the disableMandatoryCustomFieldValidation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableMandatoryCustomFieldValidation(Boolean value) {
        this.disableMandatoryCustomFieldValidation = value;
    }

    /**
     * Gets the value of the disableSystemNotesForCustomFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisableSystemNotesForCustomFields() {
        return disableSystemNotesForCustomFields;
    }

    /**
     * Sets the value of the disableSystemNotesForCustomFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisableSystemNotesForCustomFields(Boolean value) {
        this.disableSystemNotesForCustomFields = value;
    }

    /**
     * Gets the value of the ignoreReadOnlyFields property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreReadOnlyFields() {
        return ignoreReadOnlyFields;
    }

    /**
     * Sets the value of the ignoreReadOnlyFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreReadOnlyFields(Boolean value) {
        this.ignoreReadOnlyFields = value;
    }

    /**
     * Gets the value of the runServerSuiteScriptAndTriggerWorkflows property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRunServerSuiteScriptAndTriggerWorkflows() {
        return runServerSuiteScriptAndTriggerWorkflows;
    }

    /**
     * Sets the value of the runServerSuiteScriptAndTriggerWorkflows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRunServerSuiteScriptAndTriggerWorkflows(Boolean value) {
        this.runServerSuiteScriptAndTriggerWorkflows = value;
    }

}
