package midterm.luka_khelashvili_2.task4;

import java.util.HashSet;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordStat {
    public static void main(String[] args) {
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        Set<String> uniqueWords = extractUniqueWords(fantasyFormatData);

        Map<Integer, Integer> wordLengthCount = countWordLength(uniqueWords);

        System.out.println("Unique words: " + uniqueWords);

        System.out.println("Word length count:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            System.out.println("Length: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        try (FileWriter writer = new FileWriter("task4.txt", true)) {
            writer.write("\n\nUnique words: " + uniqueWords + "\n");
            writer.write("Word length count:\n");
            for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
                writer.write("Length: " + entry.getKey() + ", Count: " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Set<String> extractUniqueWords(List<String> data) {
        Set<String> uniqueWords = new HashSet<>();
        for (String line : data) {
            String[] words = line.split("\\s+");
            uniqueWords.addAll(Arrays.asList(words));
        }
        return uniqueWords;
    }

    private static Map<Integer, Integer> countWordLength(Set<String> words) {
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : words) {
            int length = word.length();
            if (wordLengthCount.containsKey(length)) {
                wordLengthCount.put(length, wordLengthCount.get(length) + 1);
            } else {
                wordLengthCount.put(length, 1);
            }
        }
        return wordLengthCount;
    }
    
}

