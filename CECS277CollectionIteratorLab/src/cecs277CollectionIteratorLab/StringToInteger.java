package cecs277CollectionIteratorLab;

import java.util.HashMap;
import java.util.Map;

public class StringToInteger {
    private Map<String, Integer> map = new HashMap<String, Integer>();
    private int wordCounter = 0;
    public int StringToInt(String s) {
        Integer i = map.get(s);
        if(i == null) {
            map.put(s, wordCounter);
            i = wordCounter;
            ++wordCounter;
        }
        return i;
    }
    
}