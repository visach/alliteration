package com.test.alliteration.objects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnalyzer {
    private String _stringReceived;
    private List<String> _stringList;
    private Long _numberOfWords;
    private Map<String,Integer> _qtyOfEachWord = new HashMap<>();

    public String GetStringReceived (){return _stringReceived;}

    public StringAnalyzer(){

    }
    public void Initialize(String stringReceived){
        _stringReceived = stringReceived;
        _numberOfWords = Stream.of(stringReceived.split(" ")).count();
        _stringList = Pattern.compile(" ")
                .splitAsStream(stringReceived)
                .map(String::trim)
                .collect(Collectors.toList());
    }
    public void Analyze(){
        String s;
        Integer counter;
        Float percentage;
        //Map<String,Integer> qtyOfEachWord = new HashMap<>();
        Map<String,Float> percentageOfEachWord = new HashMap<>();

        System.out.println("empieza el análisis");

        for (String str: _stringList){
            s = Character.toString(str.charAt(0)).toLowerCase();
            //System.out.println(s);
            if (_qtyOfEachWord.containsKey(s)){
                counter = _qtyOfEachWord.get(s);
                _qtyOfEachWord.put(s,counter+1);
                percentage = ((counter.floatValue()+1.0F)*100.0F)/_numberOfWords.floatValue();
                percentageOfEachWord.put(s,percentage);
            }
            else {
                _qtyOfEachWord.put(s,1);
                percentage = (100.0F)/_numberOfWords.floatValue();
                percentageOfEachWord.put(s,percentage);
            }
        }
        System.out.println(_qtyOfEachWord.toString());
        System.out.println(percentageOfEachWord.toString());
    }

    public Map<String,Integer> CalculateDistribution(){
        String s;
        for (String str: _stringList){
            s = Character.toString(str.charAt(0)).toLowerCase();
            if (_qtyOfEachWord.containsKey(s)){
                _qtyOfEachWord.put(s,_qtyOfEachWord.get(s)+1);
            }
            else {
                _qtyOfEachWord.put(s,1);
            }
        }
        return _qtyOfEachWord;
    }

    public Map<String,Float> GetPercentages(){
        return null;
    }
}
