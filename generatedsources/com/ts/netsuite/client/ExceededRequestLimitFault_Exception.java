
package com.tsg.netsuite.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.2.1
 * 2017-12-18T14:58:00.465-07:00
 * Generated source version: 3.2.1
 */

@WebFault(name = "exceededRequestLimitFault", targetNamespace = "urn:faults_2022_1.platform.webservices.netsuite.com")
public class ExceededRequestLimitFault_Exception extends Exception {
    
    private com.tsg.netsuite.client.ExceededRequestLimitFault exceededRequestLimitFault;

    public ExceededRequestLimitFault_Exception() {
        super();
    }
    
    public ExceededRequestLimitFault_Exception(String message) {
        super(message);
    }
    
    public ExceededRequestLimitFault_Exception(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceededRequestLimitFault_Exception(String message, com.tsg.netsuite.client.ExceededRequestLimitFault exceededRequestLimitFault) {
        super(message);
        this.exceededRequestLimitFault = exceededRequestLimitFault;
    }

    public ExceededRequestLimitFault_Exception(String message, com.tsg.netsuite.client.ExceededRequestLimitFault exceededRequestLimitFault, Throwable cause) {
        super(message, cause);
        this.exceededRequestLimitFault = exceededRequestLimitFault;
    }

    public com.tsg.netsuite.client.ExceededRequestLimitFault getFaultInfo() {
        return this.exceededRequestLimitFault;
    }
}