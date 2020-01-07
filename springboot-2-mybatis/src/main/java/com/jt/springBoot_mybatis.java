package com.jt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jt.mapper")
//abcd+123
public class springBoot_mybatis {
	public static void main(String[] args) {
		SpringApplication.run(springBoot_mybatis.class, args);
	}
}
