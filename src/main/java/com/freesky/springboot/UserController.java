package com.freesky.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freesky.bean.User;

/**
 * return a JSON object
 * @author freesky
 *
 */
@RestController   // @RestController = @Controller + @ResponseBody
//@Controller
@RequestMapping("/api/users")
public class UserController {
	
//	@GetMapping("/getUser")
//	@RequestMapping("/getUser")
//	@ResponseBody
	@GetMapping
	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		
		User user = new User();
		user.setUid(1);
		user.setName("Max");
		user.setAge(28);		
		users.add(user);
		
		User user2 = new User();
		user2.setUid(2);
		user2.setName("Bill");
		user2.setAge(18);
		users.add(user2);
		
		return users;
	}

}
