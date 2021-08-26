package com.learning.filesio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class FileWriterLearn {
    public static void main(String[] args){
        String phrase = "FileWriter phrase";
        String absPath = "/home/joao/Workspaces/Java/learning/src/com/learning/filesio/mytest.txt";
        try (FileWriter fwriter = new FileWriter(absPath, true)) {
            fwriter.write(phrase);
            fwriter.write('\n');
            fwriter.flush();
            System.out.println("Successfully written on FileWriter!");
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
