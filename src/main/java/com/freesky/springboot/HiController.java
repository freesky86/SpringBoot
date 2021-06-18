package com.freesky.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Refer to https://spring.io/guides/gs/serving-web-content/
 *    default example is greeting.html and GreetingController.java
 *    Google search "spring boot greeting.html"
 * Here is another example, the steps are as below:
  1. add thymeleaf dependency as below
  <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-thymeleaf</artifactId>
		</dependency>
   2. create a folder named 'templates' under src/main/resources
   3. create a page hi.html
   4. create this controller, the return value is the page name without suffix '.html'
 * 
 * Note: No need to add configuration in application.properties.
 * 
 * @author maxzhang
 *
 */
@Controller
public class HiController {
	
	@GetMapping("/hi")
	public String sayHi(String name, Model model) {
		if (null == name) {
			name = "world";
		}
		model.addAttribute("name", name);
		return "hi";  // hi.html
	}

}
