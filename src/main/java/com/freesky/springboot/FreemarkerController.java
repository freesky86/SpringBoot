package com.freesky.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.freesky.bean.Resource;
import com.freesky.bean.User;

@Controller
@RequestMapping("ftl")
public class FreemarkerController {

	@Autowired
	private Resource resource;
	
	@RequestMapping("/index")
    public String index(ModelMap map) {
        map.addAttribute("resource", resource);
        User user = new User();
        user.setName("Max");
        map.addAttribute("user", user);
        return "freemarker/index";
    }
	
	@RequestMapping("center")
    public String center() {
        return "freemarker/center/center";
    }

}