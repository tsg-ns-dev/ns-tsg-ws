
package com.tsg.netsuite.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T14:58:00.447-07:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "invalidSessionFault", targetNamespace = "urn:faults_2022_1.platform.webservices.netsuite.com")
public class InvalidSessionFault_Exception extends Exception {
    
    private com.tsg.netsuite.client.InvalidSessionFault invalidSessionFault;

    public InvalidSessionFault_Exception() {
        super();
    }
    
    public InvalidSessionFault_Exception(String message) {
        super(message);
    }
    
    public InvalidSessionFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidSessionFault_Exception(String message, com.tsg.netsuite.client.InvalidSessionFault invalidSessionFault) {
        super(message);
        this.invalidSessionFault = invalidSessionFault;
    }

    public InvalidSessionFault_Exception(String message, com.tsg.netsuite.client.InvalidSessionFault invalidSessionFault, Throwable cause) {
        super(message, cause);
        this.invalidSessionFault = invalidSessionFault;
    }

    public com.tsg.netsuite.client.InvalidSessionFault getFaultInfo() {
        return this.invalidSessionFault;
    }
}
