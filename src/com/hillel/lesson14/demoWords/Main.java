package com.hillel.lesson14.demoWords;

import javax.imageio.IIOException;
import java.io.*;
import java.util.*;

public class Main {
    private static List<String> arrayStrins = new ArrayList<>();

    public static void main(String[] args) {
        readFile();
        StringBuilder sb = new StringBuilder();
        System.out.println(arrayStrins);

        for (String line : arrayStrins)
        {
            sb.append(line);
        }

        String text = sb.toString().toLowerCase();
        String[] words = text.split("\\W+");

        System.out.println("Count words: " + words.length);

        Set<String> set = new TreeSet<>();

        Collections.addAll(set, words);

        System.out.println("Unique word count: " + set.size());

        writeToFile(set);
    }

    private static void writeToFile(Set<String> set) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")))
        {
            for(String word : set)
            {
                bw.write(word + "\n");
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void readFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                    arrayStrins.add(currentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
