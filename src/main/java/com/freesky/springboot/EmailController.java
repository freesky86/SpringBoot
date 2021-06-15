package com.freesky.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freesky.bean.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@Autowired
	private Environment env;

	@RequestMapping("/getEmail")
	public void getEmail() {
		emailService.sendEmail();
	}

	@RequestMapping("mail")
	public EmailService mail() {
		return emailService;
	}

	@GetMapping("/sendmail")
	public void sendMail() {
		System.out.println("values from application properties using Environment ");
		System.out.println("username =" + env.getProperty("email.username"));
		System.out.println("pwd =" + env.getProperty("email.pwd"));
	}
}
