
package com.chilsoftware;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContainDuplicate {
    public static void main(String[] args) {
        int nums[] ={0,4,5,0,3,6};
        int k = 2;
     //   System.out.println(containNearbyDuplicate(nums,k));
//Given an integer array nums and an integer k,
// return true if there are two distinct
// indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k
        System.out.println(containDupliateValue(nums));

    }
    public static boolean containNearbyDuplicate(int[] nums, int k){
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            List<Integer> indices = map.getOrDefault(nums[i], new ArrayList<>());
            for(int j: indices){
                if(Math.abs(i-j) <= k){
                    return true;
                }
            }
            indices.add(i);
            map.put(nums[i],indices);
        }
        return false;
    }
    public static boolean containDupliateValue(int[] nums){

            Map<Integer,Integer> hm= new HashMap<>();
            boolean flag= false;

            for(int i:nums){
                if(hm.containsKey(i)) {
                    hm.put(i,hm.get(i)+1);
                    flag = true;
                    break;
                }else{
                    hm.put(i,1);
                    flag = false;
                }
            }

            return flag;
        }
}

