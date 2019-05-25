package com.practice.two.pointers;

public class SortedArrayOfSquaresOfSortedArray {

    public static int[] getSquaresArray(int[] arr){

        int left =0, right = arr.length-1;
        int[] result = new int[arr.length];
        int ind = result.length-1;

        while (left<right){

            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if(rightSq>leftSq){
                result[ind] = rightSq;
                right--;
            }
            else {
                result[ind] = leftSq;
                left++;
            }
            ind--;
        }

        return result;

    }
}
