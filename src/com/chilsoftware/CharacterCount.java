package com.chilsoftware;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "aaabbbccc";
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character ch: charArray){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        System.out.println(map.entrySet());
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            sb.append(entry.getValue()).append(entry.getKey());
        }

        System.out.println(sb.toString());
    }
}
