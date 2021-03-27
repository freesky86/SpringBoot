package com.freesky.springboot;

import org.springframework.boot.CommandLineRunner;

@org.springframework.core.annotation.Order
public class DemoCommandLineRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.err.println("**************************");
		for (String arg : args) {
			System.out.println(arg);
		}
		
		System.err.println("**************************");
	}

}
