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

		System.out.println("Extra TESTS");
		String extra = "ab ac ad ae af, ax. A, j39i40 3";
		System.out.println("Analyzing " + extra);
		stringAnalyzer.Initialize(extra);
		stringAnalyzer.Analyze();
		stringAnalyzer.PrintResults();
		//only one character by 'word'
		extra = "a b c d e f g h i";
		System.out.println("Analyzing " + extra);
		stringAnalyzer.Initialize(extra);
		stringAnalyzer.Analyze();
		stringAnalyzer.PrintResults();

		//no azAZ characters at all
		extra = "1 2 3 4 5";
		System.out.println("Analyzing " + extra);
		stringAnalyzer.Initialize(extra);
		stringAnalyzer.Analyze();
		stringAnalyzer.PrintResults();

		//empty string
		extra = "";
		System.out.println("Analyzing " + extra);
		stringAnalyzer.Initialize(extra);
		stringAnalyzer.Analyze();
		stringAnalyzer.PrintResults();
		//only one word
		extra = "house";
		System.out.println("Analyzing " + extra);
		stringAnalyzer.Initialize(extra);
		stringAnalyzer.Analyze();
		stringAnalyzer.PrintResults();
	}

}
