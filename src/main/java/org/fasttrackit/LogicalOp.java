package org.fasttrackit;

public class LogicalOp {

    public static void countToOneHundred(int x) {
        int counter = 100;
        if (x <= 100) {

            for (int i = x; i <= counter; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= 100; i--)
                System.out.println(i);
        }
    }

    public static void countToMinusOneHundred(int x) {
        int counter = -100;
        if (x <= -100) {
            for (int i = x; i <= -100; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = x; i >= -100; i--) {
                System.out.println(i);
            }
        }
    }

    public static void countFromXtoY1(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public static void countFromXtoY(int x, int y) {
        if (x <= y) {
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        }
    }

    public static void showEvenNumbers() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void showOddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);


            }
        }
    }

    public static int computeSumToOneHundred(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public static double computeAverage(int x) {
        int sum = 0;
        int counter = 0;
        for (int i = x; i <= 100; i++) {
            sum = sum + i;
            counter++;
        }

        double average = ((double) sum) / counter;
        return average;
    }

    public static void showAsterisks() {
        for (int i = 7; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
