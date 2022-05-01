package com.test.alliteration.objects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Math.round;

public class Analyzer {
    private String _stringToAnalyze;
    private List<String> _stringList;
    private Long _counter;
    private Map<String,Integer> _data = new HashMap<>();
    private Map<String,Float> _result = new HashMap<>();
    public Analyzer()
    {
    }
    public Analyzer(String stringToAnalyze)
    {
        char c;
        String s;
        Float _percent;

        Stream<String> stringStream = Stream.of(stringToAnalyze.split(" "));
        _counter = stringStream.count();

        this._stringList = Pattern.compile(" ")
                .splitAsStream(stringToAnalyze)
                .map(String::trim)
                .collect(Collectors.toList());

        //stringList.forEach(a -> System.out.println(a));

        for (String str2: this._stringList)
        {
            c = str2.charAt(0);
            s = Character.toString(c).toLowerCase();

            //System.out.println(str2);
            //System.out.println(c);
            if (_data.containsKey(s))
            {
                Integer _value = _data.get(s);
                _data.put(s,_value +1);
                _percent = ((_value.floatValue()+1.0F)*100.0F)/_counter.floatValue();
                //System.out.println(_percent);
                //System.out.println(_percent);
                _result.put(s,_percent);
            }
            else
            {
                _data.put(s,1);
                _percent = (100.0F)/_counter.floatValue();
                //System.out.println(_percent);
                _result.put(s,_percent);
            }
        }
        //System.out.println(_data.toString());
        //System.out.println(_result.toString());
    }

    public void SetStringToAnalyze(String str)
    {
        this._stringToAnalyze = str;
    }
    public String GetStringToAnalyze()
    {
        return this._stringToAnalyze;
    }

    @Override
    public String toString() {
        return _result.toString();
    }

    private Long WordCounter(String str)
    {
        return _counter = Stream.of(str.split(" ")).count();
    }
}
