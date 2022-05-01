package com.test.alliteration;

import com.test.alliteration.objects.Analyzer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class AnalyzerTest {
    /*private Analyzer analyzer;

    @BeforeEach
    private void testSetter()
    {
        this.analyzer = new Analyzer();
    }*/

    @Test
    void ConstructorTest(){
        Analyzer _analyzer = new Analyzer("Mike made mellow music with his new microphone");
        String test = _analyzer.toString();
        assertEquals("{w=12.5, h=12.5, m=62.5, n=12.5}"
                ,test);
    }
/*
    @Test
     void ConstructorTest2(){
        Analyzer _analyzer = new Analyzer("Yarvis yanked his ankle at yoga, and Yolanda yelled out in surprise.");
        String test = _analyzer.toString();
        assertEquals("{a=25.0, s=8.333333, h=8.333333, y=41.666668, i=8.333333, o=8.333333}"
                ,test);

    }*/


}
