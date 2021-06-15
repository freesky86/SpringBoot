package com.freesky.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/other")
public class TestController {

	@RequestMapping("/check")
	public String index() {
		return "test is ok!";
	}
}
