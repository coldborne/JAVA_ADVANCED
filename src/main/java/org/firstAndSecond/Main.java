package org.firstAndSecond;

import java.util.Scanner;

/**
 * @author Coldborne
 * @see #main(String[])
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в нашу программу!");
        System.out.println("Выберите нужную функцию:");
        System.out.println("1 - Калькулятор, 2 - Поиск максимального слова в массиве");

        Calculator calculator = new Calculator();
        WorkerWithArray workerWithArray = new WorkerWithArray();

        Scanner scanner = new Scanner(System.in);
        int selectedCommand = scanner.nextInt();

        switch (selectedCommand){
            case UserUtils.FIRSTCOMMAND:
                calculator.work(scanner);
                break;
            case UserUtils.SECONDCOMMAND:
                workerWithArray.work(scanner);
                break;
        }

        scanner.close();
    }
}