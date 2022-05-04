package com.test.alliteration;

import com.test.alliteration.objects.StringAnalyzer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAnalyzerTest {
    private StringAnalyzer stringAnalyzer;
    private Map<String,Integer> qtyOfWords;

    @BeforeEach
    void StringAnalyzerTest(){
        stringAnalyzer = new StringAnalyzer();
        qtyOfWords = new HashMap<>();
        String example1 = "Mike made mellow music with his new microphone";
        stringAnalyzer.Initialize(example1);
    }
    @Test
    void GetWordDistribution(){
        assertEquals("{w=1, h=1, m=5, n=1}",stringAnalyzer.CalculateDistribution().toString());
    }
    @Test
    void GetPercentages(){
        assertEquals("{w=12.5, h=12.5, m=62.5, n=12.5}",stringAnalyzer.GetPercentages().toString());
    }


}
