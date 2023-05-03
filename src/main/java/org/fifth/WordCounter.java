package org.fifth;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordCounter {
    private File mInputFile;
    private HashMap<String, Integer> mWordCountMap;

    public WordCounter(File inputFile) {
        mInputFile = inputFile;
        mWordCountMap = new HashMap<>();
    }

    public void run() throws FileNotFoundException {
        CalculateTheNumberOfRepetitions();

        // Выводим статистику на консоль
        WordCounterStatistics statistics = new WordCounterStatistics(mWordCountMap);
        statistics.printStatistics();

        // Находим слово с максимальным количеством повторений
        findMaxCountWord();
    }

    private void CalculateTheNumberOfRepetitions() throws FileNotFoundException {
        Scanner scanner = new Scanner(mInputFile);

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();

            // удаляем знаки препинания и другие символы из слова
            word = word.replaceAll("[^a-zA-Zа-яА-Я0-9]", "");

            if (!word.isEmpty()) {
                if (mWordCountMap.containsKey(word)) {
                    mWordCountMap.put(word, mWordCountMap.get(word) + 1);
                } else {
                    mWordCountMap.put(word, 1);
                }
            }
        }

        scanner.close();
    }

    private void findMaxCountWord() {
        String maxCountWord = "";
        int maxCount = 0;

        for (String word : mWordCountMap.keySet()) {
            int count = mWordCountMap.get(word);

            if (count > maxCount) {
                maxCount = count;
                maxCountWord = word;
            }
        }

        System.out.println("Слово с максимальным количеством повторений: " + maxCountWord + ", " +
                "Число повторений: " + maxCount);
    }
}
