package com.learning.filesio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterLearn {
    public static void main(String[] args) {
        String phrase = "BufferedWriter phrase";
        String absPath = "/home/joao/Workspaces/Java/learning/src/com/learning/filesio/mytest.txt";
        File file = new File(absPath);
        try (BufferedWriter bwriter = new BufferedWriter(new FileWriter(file, true))){
            bwriter.write(phrase);
            bwriter.newLine();
            bwriter.flush();
            System.out.println("Successfully written on BufferedWriter!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
