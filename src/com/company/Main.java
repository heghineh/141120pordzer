package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter operation: ");
        String operation = scanner.nextLine();
        System.out.println("Please enter your numbers: ");
        int[] numbersFromConsole = getNumbersFromConsole();
        doNumbersCalculation(numbersFromConsole, operation);
    }

    public static void doNumbersCalculation(int[] numbers, String operation) {
        boolean repeat = true;
        do {
           // repeat = true;
            switch (operation) {
                case "+":
                    int sum = calculateTheSum(numbers);
                    System.out.println(sum);
                    break;
                case "-":
                    int subtract = calculateTheSubtract(numbers);
                    System.out.println(subtract);
                    break;
                case "*":
                    int product = calculateTheProduct(numbers);
                    System.out.println(product);
                    break;
                case "/":
                    int quotient = calculateTheQuotient(numbers);
                    System.out.println(quotient);
                    break;
                default:
                    repeat = false;
                    break;
            }
        } while (!repeat);
    }

    public static int[] getNumbersFromConsole() {
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int[] array = {number1, number2};
        return array;
    }

    public static int calculateTheSum(int[] array) {
        return array[0] + array[1];
    }

    public static int calculateTheProduct(int[] array) {
        return array[0] * array[1];
    }

    public static int calculateTheQuotient(int[] array) {
        int quotient = Integer.MIN_VALUE;
        if (array[1] != 0) {
            quotient = array[0] / array[1];
        } else {
            System.out.println("Second number cannot be 0");
        }
        return quotient;
    }

    public static int calculateTheSubtract(int[] array) {
        return array[0] - array[1];
    }
}
