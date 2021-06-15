package com.freesky.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/html")
	public String html() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>").append("<head>").append("	<title>HTML5</title>").append("</head>");
		sb.append("<body>").append("<p>this is the content line.</p>").append("</body>").append("</html>");

		return sb.toString();
	}

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@RequestMapping("/world")
	public String world() {
		return "Hello World!";
	}

}