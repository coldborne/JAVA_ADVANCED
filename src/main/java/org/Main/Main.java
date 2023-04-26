package org.Main;

import org.firstAndSecond.Calculator;
import org.firstAndSecond.UserUtils;
import org.firstAndSecond.WorkerWithArray;
import org.third.ArrayHandler;
import org.third.Present;
import org.third.PresentBuilder;
import java.util.Scanner;

/**
 * @author Coldborne
 * @see #main(String[])
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //First task
        System.out.println("Добро пожаловать в нашу программу!");
        System.out.println("Выберите нужную функцию:");
        System.out.println("1 - Калькулятор, 2 - Поиск максимального слова в массиве");

        Calculator calculator = new Calculator();
        WorkerWithArray workerWithArray = new WorkerWithArray();

        int selectedCommand = scanner.nextInt();

        switch (selectedCommand) {
            case UserUtils.FIRSTCOMMAND -> calculator.work(scanner);
            case UserUtils.SECONDCOMMAND -> workerWithArray.work(scanner);
        }

        //Third task, thirst part
        ArrayHandler arrayHandler = new ArrayHandler();

        arrayHandler.work();

        //Third task, second part
        PresentBuilder presentBuilder = new PresentBuilder();
        Present present = presentBuilder.create();

        System.out.println("Цена подарка: " + present.getPrice() + " рублей");
        System.out.println("Вес подарка: " + present.getWeight() + " грамм");
        System.out.println("Информация о подарке:");
        present.showInfo();

        scanner.close();
    }
}