package com.hillel.lesson11;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }


    private static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n );
        return result;
    }
}