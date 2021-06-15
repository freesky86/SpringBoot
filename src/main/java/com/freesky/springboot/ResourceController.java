/**
 * Refer to https://www.imooc.com/video/16718
 * 5-1 SpringBoot 资源文件属性配置
 * 
 * But there is an error when start application.
***************************
APPLICATION FAILED TO START
***************************

Description:

Field resource in com.freesky.springboot.ResourceController required a bean of type 'com.freesky.bean.Resource' that could not be found.

The injection point has the following annotations:
	- @org.springframework.beans.factory.annotation.Autowired(required=true)


Action:

Consider defining a bean of type 'com.freesky.bean.Resource' in your configuration.

 * After google, I found a solution from below
 * https://www.yawintutor.com/field-required-a-bean-of-type-that-could-not-be-found/
 * 
 * For this case, what we need to do is 
 * 1. remove @Configuration in Resource.java and add @Component instead
 * 2. add @ComponentScan("com.freesky.bean") in this ResourceController.java to scan the package com.freesky.bean.
 */

package com.freesky.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freesky.bean.Resource;

@RestController
@ComponentScan("com.freesky.bean")
public class ResourceController {

	@Autowired
	private Resource resource;

	@RequestMapping("/resource")
	public Resource findResource() {
//		return new Resource();
		return resource;
	}

}
