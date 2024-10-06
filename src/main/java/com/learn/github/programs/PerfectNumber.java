package com.learn.github.programs;

public class PerfectNumber {

    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0)
                sum = sum + i;
        }
        return num == sum;
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPerfectNumber(i))
                System.out.print(i + ", ");
        }
    }
}
