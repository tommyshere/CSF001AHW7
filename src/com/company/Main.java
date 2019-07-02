package com.company;

// Main class has 5 methods that will determine smallest, largest, and average of 3 doubles and determine if 3 doubles are all the same or all different
public class Main {
    // This method takes 3 doubles and returns the smallest double.
    private static double smallest(double val1, double val2, double val3) {
        return Math.min(Math.min(val1, val2), val3);
    }

    // This method takes 3 doubles and returns the largest double.
    private static double largest(double val1, double val2, double val3) {
        return Math.max(Math.max(val1, val2), val3);
    }

    // This method takes 3 doubles and returns the average.
    private static double average(double val1, double val2, double val3) {
        double sum = val1 + val2 + val3;
        return sum / 3;
    }

    // This method takes 3 doubles and returns true if all three values are equal.
    private static boolean allTheSame(double val1, double val2, double val3) {
        return val1 == val2 && val1 == val3;
    }

    // This method takes 3 doubles and returns true if all three vales are different
    private static boolean allDifferent(double val1, double val2, double val3) {
        return val1 != val2 && val1 != val3;
    }

    public static void main(String[] args) {
        System.out.println("Print the smallest number:");
        System.out.println(smallest(3.5, 6.7, -8.5));
        System.out.println();

        System.out.println("Print the largest number:");
        System.out.println(largest(3.5, 6.7, -8.5));
        System.out.println();

        System.out.println("Print the average of the three numbers:");
        System.out.println(average(3.5, 6.7, -8.5));
        System.out.println();

        System.out.println("Determine if all three numbers are the same:");
        System.out.println(allTheSame(3.5, 6.7, -8.5));
        System.out.println(allTheSame(1.0, 1.0, 1.0));
        System.out.println(allTheSame(1.0, 2.0, 1.0));
        System.out.println(allTheSame(1.0, 1.0, 2.0));
        System.out.println();

        System.out.println("Determine if all three numbers are different:");
        System.out.println(allDifferent(3.5, 6.7, -8.5));
        System.out.println(allDifferent(1.0, 1.0, 1.0));
        System.out.println(allDifferent(1.0, 2.0, 1.0));
        System.out.println(allDifferent(1.0, 1.0, 2.0));
    }
    /* OUTPUT
        "C:\Program Files\Java\jdk-11.0.1\bin\java.exe" "-javaagent:Z:\Program Files\JetBrains\IntelliJ IDEA 2019.1.2\lib\idea_rt.jar=51714:Z:\Program Files\JetBrains\IntelliJ IDEA 2019.1.2\bin" -Dfile.encoding=UTF-8 -classpath D:\Code\CSF001A\HW7\out\production\HW7 Main
        Print the smallest number:
        -8.5

        Print the largest number:
        6.7

        Print the average of the three numbers:
        0.5666666666666664

        Determine if all three numbers are the same:
        false
        true
        false
        false

        Determine if all three numbers are different:
        true
        false
        false
        false

        Process finished with exit code 0
    */
}



