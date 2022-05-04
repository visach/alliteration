package com.test.alliteration.objects;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringAnalyzer {
    private String _stringReceived;
    private List<String> _stringList;
    private Long _numberOfWords;
    private Map<String,Integer> _qtyOfEachWord; // = new HashMap<>();
    private Map<String,Float> _percentageOfEachWord;// = new HashMap<>();

    public String GetStringReceived (){return _stringReceived;}
    public Map<String,Integer> GetQuantityOfEachWord() {return _qtyOfEachWord;}
    public Map<String,Float> GetPercentagesOfEachWord(){return _percentageOfEachWord;}
    public Long GetNumberOfWords (){return _numberOfWords;}

    public StringAnalyzer(){
    }
    public void Initialize(String stringReceived){
        _stringReceived = stringReceived;
        _numberOfWords = Stream.of(stringReceived.split(" ")).count();
        //(?<=\s|^)[a-zA-Z]*(?=[.,;:]?\s|$)
        //_stringList = Pattern.compile(" ")
        _stringList = Pattern.compile(" ")
                .splitAsStream(stringReceived)
                .collect(Collectors.toList());
        _qtyOfEachWord = new HashMap<>();
        _percentageOfEachWord = new HashMap<>();

    }
    public void Analyze(){
        if (_numberOfWords != 0){
            CalculateDistribution();
            CalculatePercentages();
        }
    }
    public void CalculateDistribution(){
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
    }
    public void CalculatePercentages(){
        Float percentage;
        String character;
        Map.Entry<String,Integer> pair;

        Iterator<Map.Entry<String,Integer>> iterator = _qtyOfEachWord.entrySet().iterator();

        while (iterator.hasNext()){
            pair = iterator.next();
            character = pair.getKey();
            percentage = (pair.getValue().floatValue()*100F)/_numberOfWords.floatValue();
            _percentageOfEachWord.put(character,percentage);
        }
    }
    public void PrintResults(){
        System.out.println("Character appearance: " + GetQuantityOfEachWord().toString());
        System.out.println("Character appearance percentages: " + GetPercentagesOfEachWord());
    }
}
