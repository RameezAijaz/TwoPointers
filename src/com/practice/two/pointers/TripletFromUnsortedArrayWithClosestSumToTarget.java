package com.practice.two.pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletFromUnsortedArrayWithClosestSumToTarget {

    public static int closestSumDifference(int[] arr, int target){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<arr.length-2; i++){

            int left =i+1;
            int right = arr.length-1;

            while (left<right){

                int sum = arr[left]+arr[right]+arr[i];
                int diff = target-sum;

                if(diff ==0)
                    return target;

                if(Math.abs(diff)<Math.abs(minDiff))
                    minDiff=diff;

                if(sum<target){
                    left++;
                }
                else {
                    right--;
                }

            }


        }

        return target-minDiff;

    }

}
