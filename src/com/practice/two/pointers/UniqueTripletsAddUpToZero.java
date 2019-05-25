package com.practice.two.pointers;

import java.util.*;

public class UniqueTripletsAddUpToZero {

    public static List<int[]> getTriplets(int[] arr){
        Arrays.sort(arr);

        List<int[]> tripletList = new ArrayList<>();
        for(int i=0; i<arr.length-2; i++){

            if(i>0 && arr[i]==arr[i-1])
                continue;

            searchNegative(arr, -arr[i], i+1, tripletList);

        }

        return tripletList;
    }

    private static void searchNegative(int[] arr, int targetSum, int left, List<int[]> tripletList) {

        int right = arr.length-1;

        while (left<right){

            int sum = arr[left]+arr[right];

            if(sum == targetSum){
                tripletList.add(new int[]{arr[left], arr[right], -targetSum});

                left++;
                right--;

                while (left<right && arr[left-1] == arr[left])
                    left++;
                while (left<right && arr[right+1] == arr[right])
                    right--;
            }
            else if(sum<targetSum){
                left++;

            }
            else {
                right--;
            }

        }

    }

}
