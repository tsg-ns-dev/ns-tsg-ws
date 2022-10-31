
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesTaxItemSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesTaxItemSearchRow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRow"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}SalesTaxItemSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="taxTypeJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}TaxTypeSearchRowBasic" minOccurs="0"/&gt;
 *         &lt;element name="userJoin" type="{urn:common_2022_1.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTaxItemSearchRow", propOrder = {
    "basic",
    "taxTypeJoin",
    "userJoin"
})
public class SalesTaxItemSearchRow
    extends SearchRow
    implements Serializable
{

    protected SalesTaxItemSearchRowBasic basic;
    protected TaxTypeSearchRowBasic taxTypeJoin;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public SalesTaxItemSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesTaxItemSearchRowBasic }
     *     
     */
    public void setBasic(SalesTaxItemSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the taxTypeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeSearchRowBasic }
     *     
     */
    public TaxTypeSearchRowBasic getTaxTypeJoin() {
        return taxTypeJoin;
    }

    /**
     * Sets the value of the taxTypeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeSearchRowBasic }
     *     
     */
    public void setTaxTypeJoin(TaxTypeSearchRowBasic value) {
        this.taxTypeJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

}
