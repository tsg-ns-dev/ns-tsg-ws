
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UsageSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UsageSearch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:core_2022_1.platform.webservices.netsuite.com}SearchRecord"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="basic" type="{urn:common_2022_1.platform.webservices.netsuite.com}UsageSearchBasic" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UsageSearch", namespace = "urn:sales_2022_1.transactions.webservices.netsuite.com", propOrder = {
    "basic"
})
public class UsageSearch
    extends SearchRecord
    implements Serializable
{

    protected UsageSearchBasic basic;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link UsageSearchBasic }
     *     
     */
    public UsageSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsageSearchBasic }
     *     
     */
    public void setBasic(UsageSearchBasic value) {
        this.basic = value;
    }

}
