package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.List;

public class AllSubArraysWithProductLessThanTarget {

    public static List<List<Integer>> findSubArrays(ArrayList<Integer> arr, int target){

        List<List<Integer>> listOfSubArray = new ArrayList<>();
        int left=0, right=1;
        int product = arr.get(left);
        while (right<arr.size()){

            if(product>=target){
                product/=arr.get(left);
                left++;
            }
            for(int i=left; i<right; i++)
             listOfSubArray.add(new ArrayList<>(arr.subList(i,right)));
            product *= arr.get(right);
            right++;
        }

        return listOfSubArray;

    }
}
