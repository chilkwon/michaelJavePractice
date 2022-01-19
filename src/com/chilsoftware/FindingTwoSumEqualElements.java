package com.chilsoftware;

import java.util.HashMap;
import java.util.Map;

public class FindingTwoSumEqualElements {
    public static void main(String[] args) {
        int[] data = {1,4,5,6,7,8};
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<data.length; i++){
            hm.put(data[i],i);
        }
        int target = 9;
        int[] result = new int[2];
        // firstNUmber = target - secondNumber

        for(int i=0; i<data.length; i++){
            int secondNumber = target-data[i];
            if(hm.containsKey(secondNumber) && hm.get(secondNumber) != i){
                result[0] = i;
                result[1] = hm.get(secondNumber);
                break;
            }
        }
        System.out.println(result[0] + ":"+ result[1]);


    }

}
