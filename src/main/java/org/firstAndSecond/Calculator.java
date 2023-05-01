package org.firstAndSecond;

import java.util.Scanner;

/**
 * @author Coldborne
 * @see #work(Scanner)
 * @see #sum()
 * @see #multiply()
 * @see #divide()
 * @see #subtract()
 */
public class Calculator {
    private double mFirstNumber;
    private double mSecondNumber;

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
            mFirstNumber = getNumberFromUser(scanner);
            System.out.println("Введите второе число:");
            mSecondNumber = getNumberFromUser(scanner);

            double result = 0;

            switch (selectedCommand){
                case UserUtils.FIRSTCOMMAND:
                    result = sum();
                    break;
                case UserUtils.SECONDCOMMAND:
                    result = subtract();
                    break;
                case UserUtils.THIRDCOMMAND:
                    result = multiply();
                    break;
                case UserUtils.FOURTHCOMMAND:
                    result = divide();
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
     * @return the sum of firstNumber and secondNumber
     */
    private double sum(){
        return mFirstNumber + mSecondNumber;
    }

    /**
     * @return the number difference
     */
    private double subtract(){
        return mFirstNumber - mSecondNumber;
    }

    /**
     * @return the multiplication of firstNumber and secondNumber
     */
    private double multiply(){
        return mFirstNumber * mSecondNumber;
    }

    /**
     * @return the result of dividing numbers
     */
    private double divide(){
        if (mSecondNumber == 0) {
            System.out.println("Ошибка. Деление на нуль");
            return 0.0;
        } else {
            return mFirstNumber / mSecondNumber;
        }
    }

    private double getNumberFromUser(Scanner scanner){
        double number = 0.0;
        boolean isDouble = false;

        while (isDouble == false) {
            System.out.println("Введите число типа double. В таком формате *,*, где * - это число. Либо в формате *, где * - это число");

            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                break;
            } else {
                System.out.println("Вы ввели не число типа double");
                scanner.next();
            }
        }

        return number;
    }
}
