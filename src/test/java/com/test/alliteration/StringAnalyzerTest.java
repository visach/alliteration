package com.test.alliteration;

import com.test.alliteration.objects.StringAnalyzer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAnalyzerTest {
    private StringAnalyzer stringAnalyzer;
    @BeforeEach
    void FirsOfAll() {
        stringAnalyzer = new StringAnalyzer();
        String example1 = "Mike made mellow music with his new microphone";
        stringAnalyzer.Initialize(example1);
        stringAnalyzer.Analyze();
    }
    @Test
    void GetStringReceived(){
        assertEquals("Mike made mellow music with his new microphone",stringAnalyzer.GetStringReceived());
    }
    @Test
    void GetNumberOfWords(){
        assertEquals(8,stringAnalyzer.GetNumberOfWords());
    }
    @Test
    void GetWordDistribution(){
        assertEquals("{w=1, h=1, m=5, n=1}",stringAnalyzer.GetQuantityOfEachWord().toString());
    }
    @Test
    void GetPercentagesOfEachWord(){
        assertEquals("{w=12.5, h=12.5, m=62.5, n=12.5}",stringAnalyzer.GetPercentagesOfEachWord().toString());
    }
}
