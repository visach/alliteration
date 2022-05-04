package com.test.alliteration;

import com.test.alliteration.objects.StringAnalyzer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlliterationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlliterationApplication.class, args);

		System.out.println("Hello!");
		System.out.println("Welcome to Alliteration App");

		StringAnalyzer stringAnalyzer = new StringAnalyzer();

		String example1 = "Mike made mellow music with his new microphone";
		System.out.println("Analyzing " + example1);
		stringAnalyzer.Initialize(example1);
		stringAnalyzer.Analyze();
		stringAnalyzer.PrintResults();

		String example2 = "Yarvis yanked his ankle at yoga, and Yolanda yelled out in surprise.";
		System.out.println("Analyzing " + example2);
		stringAnalyzer.Initialize(example2);
		stringAnalyzer.Analyze();
		stringAnalyzer.PrintResults();

		System.out.println("End of analysis. Bye.");
		System.exit(0);
	}

}
