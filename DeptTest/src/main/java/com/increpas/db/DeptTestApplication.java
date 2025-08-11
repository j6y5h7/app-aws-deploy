package com.increpas.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.increpas.db.dao")
public class DeptTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeptTestApplication.class, args);
	}
	
}
