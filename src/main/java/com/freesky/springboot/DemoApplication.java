package com.freesky.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
//        SpringApplication.run(DemoConfiguration.class, args);
		
		// extend startup behaviour
//		SpringApplication bootstrap = new SpringApplication(DemoConfiguration.class);
		SpringApplication bootstrap = new SpringApplication(DemoApplication.class);
		bootstrap.setBanner(new ResourceBanner(new ClassPathResource("test.txt")));
		bootstrap.setBannerMode(Banner.Mode.CONSOLE);
        // 其他定制设置...
        bootstrap.run(args);
        
    }
}
