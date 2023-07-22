package com.example;

public class LeapYearsTest {
    public static void main(String[] args) {
        test(1898, 2046);
    }

    private static void test(int beginYear, int endYear) {
        int i;
        for (i = beginYear; i <= endYear; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}