package com.practice.two.pointers;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
/*
        Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.

                Write a function to return the indices of the two numbers (i.e. the pair) such that they add up to the given target.

                Example 1:

        Input: [1, 2, 3, 4, 6], target=6
        Output: [1, 3]
        Explanation: The number at index 1 and 3 add up to 6: 2+4=6*/


        int[] arr = {1,2,3,4,6};
        int target = 6;


        int[] indices = TargetSumInSortedArray.findIndices(arr, target);

        System.out.println("INDICES FOR TARGET SUM "+target+" IN "+ Arrays.toString(arr));
        System.out.println(Arrays.toString(indices));


/*
        Given an array of sorted numbers, remove all duplicates from it. You should not use any extra space; after removing the duplicates in-place return the new length of the array.

                Example 1:

        Input: [2, 3, 3, 3, 6, 9, 9]
        Output: 4
        Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
        Input: [2, 3, 3, 3, 6, 9, 9]
        Output: 4
        Explanation: The first four elements after removing the duplicates will be [2, 3, 6, 9].
*/

        arr = new int[]{2,3,3,3,6,9,9};
        System.out.println("LENGTH OF "+ Arrays.toString(arr)+" AFTER REMOVING DUPLICATES ");
        int length = RemoveDuplicatesOfSortedArrayInPlace.getLength(arr);
        System.out.println(length);
        System.out.println(Arrays.toString(arr));

/*
        Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array.

        Example :

        Input: [3, 2, 3, 6, 3, 10, 9, 3], Key=3
        Output: 4
        Explanation: The first four elements after removing every 'Key' will be [2, 6, 10, 9].
        Input: [3, 2, 3, 6, 3, 10, 9, 3], Key=3
        Output: 4
        Explanation: The first four elements after removing every 'Key' will be [2, 6, 10, 9].*/


        arr = new int[]{3, 2, 3, 6, 3, 10, 9, 3};
        target = 3;

        System.out.println("LENGTH OF "+Arrays.toString(arr)+" AFTER REMOVING ALL INSTANCES OF "+target);

        length = RemoveAllInstanceOfTargetInUnSortedArray.findLength(arr, target);

        System.out.println(Arrays.toString(arr));
        System.out.println(length);

/*
        Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order.

        Example 1:

        Input: [-2, -1, 0, 2, 3]
        Output: [0, 1, 4, 4, 9]*/


        arr = new int[]{0,1,2,3,4};

        int[] result = SortedArrayOfSquaresOfSortedArray.getSquaresArray(arr);

        System.out.println("SQUARE SORTED ARRAY OF "+ Arrays.toString(arr));
        System.out.println(Arrays.toString(result));


  /*    Given an array of unsorted numbers, find all unique triplets in it that add up to zero.

        Example 1:

        Input: [-3, 0, 1, 2, -1, 1, -2]
        Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
        Explanation: There are four unique triplets whose sum is equal to zero.
                Input: [-3, 0, 1, 2, -1, 1, -2]
        Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
        Explanation: There are four unique triplets whose sum is equal to zero.
*/

        arr = new int[]{-3, -3, 0, 1, 2, -1, 1, -2,6};
        List<int[]> tripletsList = UniqueTripletsAddUpToZero.getTriplets(arr);

        System.out.println("TRIPLETS IN "+ Arrays.toString(arr)+" THAT SUM TO ZERO");
        for(int[] triplet: tripletsList)
            System.out.println(Arrays.toString(triplet));
/*

        Given an array of unsorted numbers and a target number, find a triplet in the array whose sum is as close to the target number as possible.

        Example 1:

        Input: [-2, 0, 1, 2], target=2
        Output: 1
        Explanation: The triplet [-2, 1, 2] has the closest sum to the target.*/


        arr = new int[]{-2, 0, 1, 2};
        target=2;

        int diff = TripletFromUnsortedArrayWithClosestSumToTarget.closestSumDifference(arr, target);
        System.out.println("TRIPLETS IN "+ Arrays.toString(arr)+" THAT HAS CLOSEST SUM TO "+target);
        System.out.println(diff);
/*
        Given an array arr of unsorted numbers and a target sum, count all triplets in it such that arr[i] + arr[j] + arr[k] < target where i, j, and k are three different indices. Write a function to return the count of such triplets.

        Example 1:

        Input: [-1, 0, 2, 3], target=3
        Output: 2
        Explanation: There are two triplets whose sum is less than the target: [-1, 0, 3], [-1, 0, 2]*/

        arr = new int[]{-1, 4, 2, 1, 3};
        target=5;

        int count = CountOfTrippletWithSumLessThanTarget.findCount(arr, target);
        System.out.println("COUNT OF TRIPLETS WITH SUM LESS THAN "+ target +" IN "+Arrays.toString(arr));
        System.out.println(count);

/*
        Given an array with positive numbers and a target number, find all subarrays in it whose product is less than the target number.

        Example 1:

        Input: [2, 5, 3, 10], target=30
        Output: [2], [5], [2, 5], [3], [5, 3], [10]
        Explanation: There are six subarrays whose product is less than the target.*/

        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(8, 2, 6, 5));
        target=50;
        List<List<Integer>> list =AllSubArraysWithProductLessThanTarget.findSubArrays(arrList, target);
        System.out.println("SUBARRAY OF "+ arrList +" WITH PRODUCT LESS THAN "+target);
        System.out.println(list);
    }
}
