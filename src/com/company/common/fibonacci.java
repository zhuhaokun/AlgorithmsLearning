package com.company.common;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }

    public static long fibonacci(long number) {
        if (number == 0 || number == 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
