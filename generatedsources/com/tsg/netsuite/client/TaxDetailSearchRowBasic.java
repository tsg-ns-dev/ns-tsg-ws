
package com.tsg.netsuite.client;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxDetailSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailSearchRowBasic"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRowBasic"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="account" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="calcDetail" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lineNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxAmount" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxBasis" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxCode" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxRate" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="taxType" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tranNumber" type="{urn:core_2022_1.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailSearchRowBasic", namespace = "urn:common_2022_1.platform.webservices.netsuite.com", propOrder = {
    "account",
    "calcDetail",
    "lineNumber",
    "taxAmount",
    "taxBasis",
    "taxCode",
    "taxRate",
    "taxType",
    "tranNumber"
})
public class TaxDetailSearchRowBasic
    extends SearchRowBasic
    implements Serializable
{

    protected List<SearchColumnStringField> account;
    protected List<SearchColumnStringField> calcDetail;
    protected List<SearchColumnLongField> lineNumber;
    protected List<SearchColumnDoubleField> taxAmount;
    protected List<SearchColumnDoubleField> taxBasis;
    protected List<SearchColumnSelectField> taxCode;
    protected List<SearchColumnDoubleField> taxRate;
    protected List<SearchColumnSelectField> taxType;
    protected List<SearchColumnLongField> tranNumber;

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAccount() {
        if (account == null) {
            account = new ArrayList<SearchColumnStringField>();
        }
        return this.account;
    }

    /**
     * Gets the value of the calcDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calcDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalcDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCalcDetail() {
        if (calcDetail == null) {
            calcDetail = new ArrayList<SearchColumnStringField>();
        }
        return this.calcDetail;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLineNumber() {
        if (lineNumber == null) {
            lineNumber = new ArrayList<SearchColumnLongField>();
        }
        return this.lineNumber;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTaxAmount() {
        if (taxAmount == null) {
            taxAmount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.taxAmount;
    }

    /**
     * Gets the value of the taxBasis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxBasis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxBasis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTaxBasis() {
        if (taxBasis == null) {
            taxBasis = new ArrayList<SearchColumnDoubleField>();
        }
        return this.taxBasis;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTaxCode() {
        if (taxCode == null) {
            taxCode = new ArrayList<SearchColumnSelectField>();
        }
        return this.taxCode;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTaxRate() {
        if (taxRate == null) {
            taxRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.taxRate;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTaxType() {
        if (taxType == null) {
            taxType = new ArrayList<SearchColumnSelectField>();
        }
        return this.taxType;
    }

    /**
     * Gets the value of the tranNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tranNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getTranNumber() {
        if (tranNumber == null) {
            tranNumber = new ArrayList<SearchColumnLongField>();
        }
        return this.tranNumber;
    }

}
