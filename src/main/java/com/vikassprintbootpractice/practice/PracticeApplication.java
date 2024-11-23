package com.vikassprintbootpractice.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;



@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PracticeApplication implements CommandLineRunner {
	@Autowired
	Apple apple1;

	@Autowired
	Apple apple2;

	@Autowired
	CakeBake cakeBake;

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		apple1.getAppleColour("Red");
		apple2.getAppleColour("Blue");

		cakeBake.bakecake();
	}
}
