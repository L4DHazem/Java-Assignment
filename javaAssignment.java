
package javaAssignment;

import java.util.Scanner;

public class javaAssignment {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {

            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.println("Please enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:

                    System.out.println("Please enter number:");

                    int number = scanner.nextInt();

                    String result = checkNumberType(number);

                    System.out.println(result);

                    break;

                case 4:

                    System.out.println("Please enter num 1:");

                    int num1 = scanner.nextInt();

                    System.out.println("Please enter num 2:");

                    int num2 = scanner.nextInt();

                    int sum = calculateSum(num1, num2);

                    System.out.println("Sum = " + sum);

                    break;

                case 5:

                    System.out.println("Thank you.");

                    break;

                default:

                    System.out.println("Invalid Choice");

                    break;
            }

        } while (choice != 5);

        scanner.close();
    }

    /**
     * Prints numbers from 10 down to 1.
     */
    public static void printNumbersDescending() {

        for (int i = 10; i >= 1; i--) {

            System.out.println(i);

        }
    }

    /**
     * Prints numbers from 1 to 10 and identifies even and odd numbers.
     */
    public static void printEvenOrOdd() {

        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {

                System.out.println("number is even " + i);

            } else {

                System.out.println("number is odd " + i);

            }

        }
    }

    /**
     * Checks whether a number is positive, negative, or zero.
     *
     * @param num the number entered by the user
     * @return the type of the number
     */
    public static String checkNumberType(int num) {

        if (num > 0) {

            return "positive";

        } else if (num < 0) {

            return "negative";

        } else {

            return "Zero";

        }
    }

    /**
     * Calculates the sum of two numbers.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @return the sum of the two numbers
     */
    public static int calculateSum(int num1, int num2) {

        return num1 + num2;

    }

}

