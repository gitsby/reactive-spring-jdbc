package com.github.gitsby.reactivespringjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactiveSpringJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpringJdbcApplication.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
	}

}
