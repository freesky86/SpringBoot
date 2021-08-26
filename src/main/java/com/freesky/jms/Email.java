/**
 * Refer to https://spring.io/guides/gs/messaging-jms/
 */
package com.freesky.jms;

/**
 * @author freesky
 */
public class Email {

    private String body;

    private String to;

    public Email() {

    }

    public Email(String to, String body) {
        this.to = to;
        this.body = body;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @return the to
     */
    public String getTo() {
        return to;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @param to the to to set
     */
    public void setTo(String to) {
        this.to = to;
    }

    @Override
    public String toString() {
        return String.format("Email {to=%s, body=%s}", to, body);
    }
}
