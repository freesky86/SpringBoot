package com.freesky.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.freesky.bean.User;

/**
 * return a JSON object
 * @author freesky
 *
 */
@RestController   // @RestController = @Controller + @ResponseBody
//@Controller
@RequestMapping("/user")
public class UserController {
	
//	@GetMapping("/getUser")
	@RequestMapping("/getUser")
//	@ResponseBody
	public User getUser() {
		User user = new User();
		user.setName("Max");
		user.setAge(28);
		
		return user;
	}

}
