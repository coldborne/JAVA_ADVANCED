package org.Main;

import org.fifth.FileSearcher;
import org.fifth.WordCounter;
import org.firstAndSecond.Calculator;
import org.firstAndSecond.UserUtils;
import org.firstAndSecond.WorkerWithArray;
import org.third.ArrayHandler;
import org.third.Present;
import org.third.PresentBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

/**
 * @author Coldborne
 * @see #main(String[])
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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

        //The Fifth task
        FileSearcher fileSearcher = new FileSearcher();
        List<File> foundFiles = fileSearcher.searchFiles("words.txt");

        /*Вообще, можно сделать цикл, при котором пользователю будет даваться ещё попытка забросить файл на рабочий
        стол, либо он может завершить программу преждевременно, но я решил упростить, и здесь будет только один раз
        подобная проверка*/
        if (foundFiles.size() == 0){
            System.out.println("Файл не найден");
        } else if (foundFiles.size() > 1) {
            System.out.println("Найден несколько файлов, нужно оставить только один");
        } else {
            File inputFile = foundFiles.get(0);

            WordCounter app = new WordCounter(inputFile);
            app.run();
        }
    }
}