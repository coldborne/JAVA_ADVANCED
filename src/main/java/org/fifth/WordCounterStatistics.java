package org.fifth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class WordCounterStatistics {
    private HashMap<String, Integer> mWordCountMap;

    public WordCounterStatistics(HashMap<String, Integer> wordCountMap) {
        mWordCountMap = wordCountMap;
    }

    public void printStatistics() {
        ArrayList<String> sortedWords = new ArrayList<>(mWordCountMap.keySet());
        Collections.sort(sortedWords);

        System.out.println("Статистика:");

        for (String word : sortedWords) {
            int count = mWordCountMap.get(word);
            System.out.println(word + ": " + count);
        }
    }
}
