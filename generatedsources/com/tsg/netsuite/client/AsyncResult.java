
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncResult", namespace = "urn:messages_2022_1.platform.webservices.netsuite.com")
@XmlSeeAlso({
    AsyncAddListResult.class,
    AsyncUpdateListResult.class,
    AsyncUpsertListResult.class,
    AsyncDeleteListResult.class,
    AsyncGetListResult.class,
    AsyncInitializeListResult.class,
    AsyncSearchResult.class
})
public abstract class AsyncResult
    implements Serializable
{


}
