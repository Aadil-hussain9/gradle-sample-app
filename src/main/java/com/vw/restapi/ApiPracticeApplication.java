package com.vw.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan({"com.vw.restapi.controller","com.vw.restapi.service","com.vw.restapi.ServiceImpl"})
@EnableJpaRepositories("com.vw.restapi.repository")
@EntityScan("com.vw.restapi.model")
@EnableTransactionManagement
public class ApiPracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPracticeApplication.class, args);


	}


}
