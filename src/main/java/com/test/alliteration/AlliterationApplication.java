package com.test.alliteration;

import com.test.alliteration.objects.Analyzer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlliterationApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlliterationApplication.class, args);

		System.out.println("Hello!");
		System.out.println("Welcome to Alliteration App");

		String easyTest = "Mike made mellow music with his new microphone";
		String hardTest = "Yarvis yanked his ankle at yoga, and Yolanda yelled out in surprise.";

		//Possible patterns
		//String splited[] = source_.split("\\W");
		//String splited[] = source_.split("[a-zA-Z]");
		//String spl_[] = easyStr_.split(" ");

		Analyzer analyzer = new Analyzer(easyTest);
		System.out.println(analyzer.toString());
		//Analyzer analyzer = new Analyzer(hardTest);

		//Hard one
		//String[] spl2 = Arrays.stream(hardTest.split("[^a-zA-Z]")).map(String::trim);
		/*for (String str2: spl2)
			System.out.println(str2);*/

		/*List<String> stringList = Pattern.compile(" ")
				.splitAsStream(easyTest)
				.map(String::trim)
				.collect(Collectors.toList());
		stringList.forEach(s -> System.out.println(s));

		Word word = new Word("prueba");
		char c = word.FirstChar();
		System.out.println(c);
		*/

		//easyStream.forEach(s-> System.out.println(s));

	}

}
