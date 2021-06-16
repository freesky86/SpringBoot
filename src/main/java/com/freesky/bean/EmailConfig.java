package com.freesky.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("email")
@PropertySource(value = "classpath:resource.properties")
public class EmailConfig {

	private String pwd;

	private String username;

	public String getPwd() {
		return pwd;
	}

	public String getUsername() {
		return username;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "EmailConfig [username=" + username + ", pwd=" + pwd + "]";
	}

}
