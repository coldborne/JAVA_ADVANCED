package org.firstAndSecond;

import java.util.Scanner;

public class WorkerWithCalculator {
    public void work(Scanner scanner){
        Calculator calculator = new Calculator();

        boolean isWork = true;
        System.out.println("Добро пожаловать в калькулятор");

        while (isWork){
            System.out.println("Выберите нужную комманду:");
            System.out.println("1 - сложить числа, 2 - отнять от первого числа второе");
            System.out.println("3 - умножить числа, 4 - разделить первое число на второе");
            System.out.println("5 - выход из калькулятора");
            int selectedCommand = scanner.nextInt();

            System.out.println("Введите первое число:");
            calculator.setmFirstNumber(getNumberFromUser(scanner));
            System.out.println("Введите второе число:");
            calculator.setmSecondNumber(getNumberFromUser(scanner));

            double result = switch (selectedCommand) {
                case UserUtils.FIRSTCOMMAND -> calculator.sum();
                case UserUtils.SECONDCOMMAND -> calculator.subtract();
                case UserUtils.THIRDCOMMAND -> calculator.multiply();
                case UserUtils.FOURTHCOMMAND -> calculator.divide();
                default -> 0;
            };

            System.out.printf("Результат - %.4f", result);
            System.out.println();

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

    private double getNumberFromUser(Scanner scanner){
        double number = 0.0;
        boolean isDouble = false;

        while (isDouble == false) {
            System.out.println("Введите число типа double. В таком формате *,*, где * - это число. Либо в формате *, где * - это число");

            if (scanner.hasNextDouble()) {
                number = scanner.nextDouble();
                isDouble = true;
            } else {
                System.out.println("Вы ввели не число типа double");
                scanner.next();
            }
        }

        return number;
    }
}
