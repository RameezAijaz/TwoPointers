package com.practice.two.pointers;

import java.util.Arrays;

public class CountOfTrippletWithSumLessThanTarget {

    public static int findCount(int[] arr, int target){
        Arrays.sort(arr);
        int count =0;
        for(int i=0; i<arr.length-2; i++){

            int left=i+1, right=arr.length-1, targetSum = target-arr[i];
            while (left<right){
                int diff = targetSum-arr[left];
                if(diff>arr[right]){
                    count+=right-left;
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return count;
    }
}
