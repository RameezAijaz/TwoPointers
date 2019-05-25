package com.practice.two.pointers;

public class RemoveAllInstanceOfTargetInUnSortedArray {

    public static int findLength(int[] arr, int target){
        int nextNonTarget = 0;

        for(int i=0; i<arr.length; i++){

            if(arr[i] != target){
                arr[nextNonTarget] = arr[i];
                nextNonTarget++;
            }

        }

        return nextNonTarget;
    }
}
