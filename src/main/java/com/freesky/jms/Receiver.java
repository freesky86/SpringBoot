/**
 * 
 */
package com.freesky.jms;

import org.springframework.jms.annotation.JmsListener;

/**
 * Receiver is a message-driven POJO.
 * 
 * @author freesky
 */
// @Component
public class Receiver {

    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage(Email email) {
        System.out.println("Received <" + email + ">");
    }

}
