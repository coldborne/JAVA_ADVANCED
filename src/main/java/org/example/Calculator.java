package org.example;

import java.util.Scanner;

/**
 * @author Coldborne
 * @see #work(Scanner)
 * @see #sum(double, double)
 * @see #multiply(double, double)
 * @see #divide(double, double)
 * @see #subtract(double, double)
 */
public class Calculator {

    public void work(Scanner scanner){
        boolean isWork = true;
        System.out.println("Добро пожаловать в калькулятор");

        while (isWork){
            System.out.println("Выберите нужную комманду:");
            System.out.println("1 - сложить числа, 2 - отнять от первого числа второе");
            System.out.println("3 - умножить числа, 4 - разделить первое число на второе");
            System.out.println("5 - выход из калькулятора");
            int selectedCommand = scanner.nextInt();

            System.out.println("Введите первое число:");
            double firstNumber = scanner.nextDouble();
            System.out.println("Введите второе число:");
            double secondNumber = scanner.nextDouble();

            double result = 0;

            switch (selectedCommand){
                case UserUtils.FIRSTCOMMAND:
                    result = sum(firstNumber, secondNumber);
                    break;
                case UserUtils.SECONDCOMMAND:
                    result = subtract(firstNumber, secondNumber);
                    break;
                case UserUtils.THIRDCOMMAND:
                    result = multiply(firstNumber, secondNumber);
                    break;
                case UserUtils.FOURTHCOMMAND:
                    result = divide(firstNumber, secondNumber);
                    break;
            }

            System.out.printf("Результат - %.4f", result);

            System.out.println("Хотите повторить?");
            System.out.println("1 - Да, 2 - Нет");

            selectedCommand = scanner.nextInt();

            switch (selectedCommand) {
                case UserUtils.FIRSTCOMMAND:
                    break;
                case UserUtils.SECONDCOMMAND:
                    isWork = false;
                    break;
            }
        }
    }

    /**
     * @param firstNumber  first numerator
     * @param secondNumber second numerator
     * @return the sum of firstNumber and secondNumber
     */
    private double sum(double firstNumber, double secondNumber){
        return firstNumber + secondNumber;
    }

    /**
     * @param subtractiveNumber a minuend
     * @param subtractedNumber a subtrahend
     * @return the number difference
     */
    private double subtract(double subtractiveNumber, double subtractedNumber){
        return subtractiveNumber - subtractedNumber;
    }

    /**
     * @param firstNumber first multiplier
     * @param secondNumber second multiplier
     * @return the multiplication of firstNumber and secondNumber
     */
    private double multiply(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

    /**
     * @param divisible a divisible
     * @param divider a divider
     * @return the result of dividing numbers
     */
    private double divide(double divisible, double divider){
        return divisible / divider;
    }
}
