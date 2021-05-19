package com.freesky.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class MyController {
	
	/**
	 * http://localhost:8080/home/test
	 * http://localhost:8080/home/test/
	 * 
	 * @return the string value.
	 */
//	@RequestMapping("/")
//	@GetMapping
	@RequestMapping
	public String index() {
		return "This is the test home page. -- Request";
	}

	/**
	 * http://localhost:8080/home/test/my
	 * @return
	 */
	@RequestMapping("/my")
	public String say() {
		return "This is my controller.";
	}
	
	/**
	 * http://localhost:8080/home/test/mine
	 * @return
	 */
	@GetMapping("/mine") 
	public String mine() {
		return "This is another one of mine.";
	}
}
