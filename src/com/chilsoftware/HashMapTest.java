package com.chilsoftware;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Character,Integer> hashData = new HashMap<>();
        String str = "hello";
        char[] charArray = str.toCharArray();

        for(Character ch: charArray){
            if(hashData.containsKey(ch)){
                hashData.put(ch,hashData.get(ch)+1);
            }else{
                hashData.put(ch,1);
            }
        }
        System.out.println(hashData.keySet());
        Set<Character> keys =hashData.keySet();
        for(Character ch: keys){
            if(hashData.get(ch)>1){
                System.out.println(ch + " is " + hashData.get(ch)+ " times");

            }
        }



    }
}
