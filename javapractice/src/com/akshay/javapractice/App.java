package com.akshay.javapractice;

/**
 * @auther Akshay
 * This project only for practicing the java code
 */
public class App {
    /**
     * Given an array of size N and integer 'target'. Find the indices(i,j) of two
     * numbers such that their sum is equal to target. (i != j )
     * You can assume that their will be exactly one solution.
     * <p>
     * Sample input
     * N = 5
     * arr = {7,6,3,8,2}
     * target = 14
     * Sample output
     * 1 , 3
     */
    public static void main(String[] args) {
        int target = 14;
        int[] arr = new int[]{7, 6, 3, 8, 2};
        int[] indices = twoSum(target, arr);
    }

    public static int[] twoSum(int target, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == target - arr[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
