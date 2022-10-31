
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesTaxItemSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesTaxItemSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}SalesTaxItemSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxTypeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TaxTypeSearchBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTaxItemSearch", propOrder = {
    "basic",
    "taxTypeJoin",
    "userJoin"
})
public class SalesTaxItemSearch
    extends SearchRecord
    implements Serializable
{

    protected SalesTaxItemSearchBasic basic;
    protected TaxTypeSearchBasic taxTypeJoin;
    protected EmployeeSearchBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public SalesTaxItemSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchBasic }
     *     
     */
    public void setBasic(SalesTaxItemSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the taxTypeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeSearchBasic }
     *     
     */
    public TaxTypeSearchBasic getTaxTypeJoin() {
        return taxTypeJoin;
    }

    /**
     * Sets the value of the taxTypeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeSearchBasic }
     *     
     */
    public void setTaxTypeJoin(TaxTypeSearchBasic value) {
        this.taxTypeJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

}
