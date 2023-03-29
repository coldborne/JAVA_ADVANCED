package org.firstAndSecond;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Coldborne
 * @see #work(Scanner)
 * @see #findTheLongestWords(ArrayList)
 */
public class WorkerWithArray {
    public void work(Scanner scanner) {
        boolean isWork = true;
        System.out.println("Добро пожаловать в программу, позволяющую найти самое длинное слово в массиве");
        System.out.println("Если таких слов несколько, они выведутся все");

        while (isWork) {
            System.out.println("Введите количество слов");
            int wordsAmount = scanner.nextInt();

            ArrayList<String> words = new ArrayList<>();
            ArrayList<String> theLongestWords = new ArrayList<>();

            System.out.println("Вводите слова по одному");

            for (int i = 0; i < wordsAmount; i++) {
                words.add(scanner.next().trim());
            }

            theLongestWords = findTheLongestWords(words);

            for (String word :
                    theLongestWords) {
                System.out.print(word + " ");
            }

            System.out.println();

            System.out.println("Хотите повторить?");
            System.out.println("1 - Да, 2 - Нет");

            int selectedCommand = scanner.nextInt();

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
     * @param words an array of words in which to find the longest word
     * @return the ArrayList<String> of longest words
     */
    private ArrayList<String> findTheLongestWords(ArrayList<String> words) {
        ArrayList<String> theLongestWords = new ArrayList<>();
        int maxWordLength = words.get(0).length();

        for (String word : words) {
            if (word.length() > maxWordLength) {
                maxWordLength = word.length();
            }
        }

        for (String word : words) {
            if (word.length() == maxWordLength) {
                theLongestWords.add(word);
            }
        }

        return theLongestWords;
    }
}
