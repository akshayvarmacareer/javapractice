package com.akshay.javapractice;

public class palindrome {
    //here we are solving the problem for Palindrome Number

    /**
     * Given an integer x, return true if x is a
     * palindrome,
     * and false otherwise.
     * <p>
     * Input: x = 121
     * Output: true
     * Explanation: 121 reads as 121 from left to right and from right to left.
     */

    public static void main(String[] args) {
        int x = 123;
        System.out.println("Is it palindrome :- " + isPalindrome(x));
    }

    //this function will return true or false and it will use Math class
    public static boolean isPalindrome(int x) {
        int reverse = 0;
        int ogNumber = Math.abs(x);
        while (x != 0) {
            int reminder = x % 10;
            System.out.println(reminder);
            reverse = reverse * 10 + reminder;
            x /= 10;
        }
        return Math.abs(ogNumber) == reverse;
    }
}
