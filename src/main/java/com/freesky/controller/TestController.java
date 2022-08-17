package com.freesky.controller;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test Controller
 *
 * @author Max
 */
@RestController
@RequestMapping("/other")
public class TestController {

	@RequestMapping("/check")
	public String index() {
		return "test is ok!";
	}
	
//	@Scheduled(fixedRate = 3000)
	public void monitor() {
		System.out.println(new Date());
	}
}
