package com.practice.two.pointers;

public class TargetSumInSortedArray {

    public static int[] findIndices(int[] arr, int target){

        int i=0, j=arr.length-1;
        int[] indices = {-1,-1};


        while(i<j){

            int sum = arr[i]+arr[j];
            if(sum == target){
                indices[0] = i;
                indices[1] =j;
                break;
            }

            if(sum>target){
                j--;
            }
            if(sum<target){
                i++;
            }
        }



        return indices;

    }
}
