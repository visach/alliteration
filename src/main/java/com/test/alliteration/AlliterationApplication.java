package com.test.alliteration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.Stream;

@SpringBootApplication
public class AlliterationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlliterationApplication.class, args);

		System.out.println("Hello!");
		System.out.println("Welcome to Alliteration App");

		String easyTest = "Mike made mellow music with his new microphone";
		String hardTest = "Mike! ,made$ %mellow/music wi(th his new ,microphone.";

		//Possible patterns
		//String splited[] = source_.split("\\W");
		//String splited[] = source_.split("[a-zA-Z]");
		//String spl_[] = easyStr_.split(" ");

		//Easy one
		Stream<String> easyStream = Stream.of(easyTest.split(" "));

		long counter = easyStream.count();
		System.out.println("Total words: " + counter);

		//easyStream.forEach(s-> System.out.println(s));

	}

}
