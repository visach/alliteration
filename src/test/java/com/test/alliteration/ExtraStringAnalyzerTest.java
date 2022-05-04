package com.test.alliteration;

import com.test.alliteration.objects.StringAnalyzer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExtraStringAnalyzerTest {

    @Test
    void SecondExample(){
        StringAnalyzer strAnalyzer = new StringAnalyzer();
        String stringToTest = "Yarvis yanked his ankle at yoga, and Yolanda yelled out in surprise.";
        strAnalyzer.Initialize(stringToTest);
        strAnalyzer.Analyze();
        assertEquals("{a=25.0, s=8.333333, h=8.333333, y=41.666668, i=8.333333, o=8.333333}"
                ,strAnalyzer.GetPercentagesOfEachWord().toString());
    }
    @Test
    void OnlyOneCharacterPerWord(){
        StringAnalyzer strAnalyzer = new StringAnalyzer();
        String stringToTest = "a b c d e f g h i";
        strAnalyzer.Initialize(stringToTest);
        strAnalyzer.Analyze();
        assertEquals("{a=11.111111, b=11.111111, c=11.111111, d=11.111111, e=11.111111, f=11.111111, g=11.111111, h=11.111111, i=11.111111}"
                ,strAnalyzer.GetPercentagesOfEachWord().toString());
    }
    @Test
    void OnlyNumbers(){
        StringAnalyzer strAnalyzer = new StringAnalyzer();
        String stringToTest = "143 2789 3543 46542 5890";
        strAnalyzer.Initialize(stringToTest);
        strAnalyzer.Analyze();
        assertEquals("{1=20.0, 2=20.0, 3=20.0, 4=20.0, 5=20.0}"
                ,strAnalyzer.GetPercentagesOfEachWord().toString());
    }
    @Test
    void EmptyString(){
        StringAnalyzer strAnalyzer = new StringAnalyzer();
        String stringToTest = "";
        strAnalyzer.Initialize(stringToTest);
        strAnalyzer.Analyze();
        assertEquals("{received empty string=0.0}"
                ,strAnalyzer.GetPercentagesOfEachWord().toString());
    }
    @Test
    void OnlyOneWord(){
        StringAnalyzer strAnalyzer = new StringAnalyzer();
        String stringToTest = "house";
        strAnalyzer.Initialize(stringToTest);
        strAnalyzer.Analyze();
        assertEquals("{h=100.0}"
                ,strAnalyzer.GetPercentagesOfEachWord().toString());
    }
    @Test
    void MessyString()
    {
        StringAnalyzer strAnalyzer = new StringAnalyzer();
        String stringToTest = "jñldfj forijew, o3ejl. Aelkjd oencvkar, añreabg! areñlkv. erñlkja";
        strAnalyzer.Initialize(stringToTest);
        strAnalyzer.Analyze();
        assertEquals("{a=37.5, e=12.5, f=12.5, j=12.5, o=25.0}"
                ,strAnalyzer.GetPercentagesOfEachWord().toString());
    }
}
