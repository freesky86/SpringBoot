package com.freesky.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource(value = "classpath:resource.properties")
public class EmailService {

	@Autowired
	private EmailConfig emailConfig;

	@Value("${email.pwd}")
	private String pwd;

	@Value("${email.username}")
	private String username;

	/**
	 * @return the emailConfig
	 */
	public EmailConfig getEmailConfig() {
		return emailConfig;
	}

	/**
	 * @return the pwd
	 */
	public String getPwd() {
		return pwd;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	public void sendEmail() {
		System.out.println("reading value from propertes file using @value annotation");
		System.out.println("username =" + username);
		System.out.println("pwd =" + pwd);
		System.out.println("   reading value from EmailConfig");
		System.out.println("   emailConfig.username =" + emailConfig.getUsername());
		System.out.println("   emailConfig.pwd =" + emailConfig.getPwd());
	}

	/**
	 * @param emailConfig the emailConfig to set
	 */
	public void setEmailConfig(EmailConfig emailConfig) {
		this.emailConfig = emailConfig;
	}

	/**
	 * @param pwd the pwd to set
	 */
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

}
