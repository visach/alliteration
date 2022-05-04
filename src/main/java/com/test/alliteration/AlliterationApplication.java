package com.test.alliteration;

import com.test.alliteration.objects.Analyzer;
import com.test.alliteration.objects.StringAnalyzer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlliterationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlliterationApplication.class, args);

		System.out.println("Hello!");
		System.out.println("Welcome to Alliteration App");


		String easyTest = "Mike made mellow music with his new microphone";
		String example1 = "Mike made mellow music with his new microphone";

		String hardTest = "Yarvis yanked his ankle at yoga, and Yolanda yelled out in surprise.";
		String example2 = "Yarvis yanked his ankle at yoga, and Yolanda yelled out in surprise.";

		/*Analyzer analyzer = new Analyzer(easyTest);
		System.out.println(analyzer.toString());*/
		//Analyzer analyzer = new Analyzer(hardTest);

		/*Analyzer analyzer2 = new Analyzer();
		analyzer2.SetStringToAnalyze(easyTest);
		analyzer2.PerformAnalysis();
		String results = analyzer2.toString();
		System.out.println(results);*/

		StringAnalyzer stringAnalyzer = new StringAnalyzer();
		stringAnalyzer.Initialize(example1);
		stringAnalyzer.Analyze();

		stringAnalyzer.Initialize(example2);
		stringAnalyzer.Analyze();
	}

}
