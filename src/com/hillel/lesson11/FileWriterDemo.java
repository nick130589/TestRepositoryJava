package com.hillel.lesson11;

import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) {
        String fileName = "test2.txt";
//        fileWriter(fileName);
        fileReader(fileName);
    }

    private static void fileWriter(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("asdf\n123\nsomething");
        } catch (IOException e) {
            System.out.println("File is not created");
        }
    }

    public static void fileReader(String fileName)
    {
        try(BufferedReader reader = new BufferedReader(new
                FileReader(fileName))) {
            String currentLine;
            while ((currentLine = reader.readLine()) != null)
            {
                System.out.println(currentLine);
            }
        } catch (IOException e) {
            System.out.println("File is not created");
        }
    }
}
