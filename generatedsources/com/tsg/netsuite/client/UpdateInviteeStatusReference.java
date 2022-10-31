
package com.tsg.netsuite.client;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateInviteeStatusReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInviteeStatusReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eventId" type="{urn:core_2022_1.platform.webservices.netsuite.com}RecordRef"/&gt;
 *         &lt;element name="responseCode" type="{urn:types.core_2022_1.platform.webservices.netsuite.com}CalendarEventAttendeeResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInviteeStatusReference", namespace = "urn:core_2022_1.platform.webservices.netsuite.com", propOrder = {
    "eventId",
    "responseCode"
})
public class UpdateInviteeStatusReference
    implements Serializable
{

    @XmlElement(required = true)
    protected RecordRef eventId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CalendarEventAttendeeResponse responseCode;

    /**
     * Gets the value of the eventId property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEventId() {
        return eventId;
    }

    /**
     * Sets the value of the eventId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEventId(RecordRef value) {
        this.eventId = value;
    }

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAttendeeResponse }
     *     
     */
    public CalendarEventAttendeeResponse getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAttendeeResponse }
     *     
     */
    public void setResponseCode(CalendarEventAttendeeResponse value) {
        this.responseCode = value;
    }

}
