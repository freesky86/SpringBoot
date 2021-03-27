package com.freesky.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.core.io.ClassPathResource;

public class DemoApplication {
	public static void main(String[] args) {
//        SpringApplication.run(DemoConfiguration.class, args);
		
		// extend startup behaviour
		SpringApplication bootstrap = new SpringApplication(DemoConfiguration.class);
		bootstrap.setBanner(new ResourceBanner(new ClassPathResource("banner.txt")));
		bootstrap.setBannerMode(Banner.Mode.CONSOLE);
        // 其他定制设置...
        bootstrap.run(args);
        
    }
}
