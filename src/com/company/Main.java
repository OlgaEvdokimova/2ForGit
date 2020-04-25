package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

    public static void main(String[] args) {
// existing text
        File file = new File("E:/JavaOlya/EpTasks/2REGEX/secret.txt");
        Text text = new Text(file);
        System.out.println("===============================");
        System.out.println(text.sentences);

// call 4 methods (tasks)
        text.replaceFirstWordAndTheLastWordInExclamatorySentences();
        text.findAndDeleteFirstLetter();
        text.deleteSubstring("a", "f");
        text.findNoRepeatedWordsInFirstSentenceOfText();

// text after correcting
        System.out.println("===============================");
        System.out.println(text.sentences);
        try {
            FileWriter writer = new FileWriter("E:/JavaOlya/EpTasks/2REGEX/test1wr.txt");
            for (Sentence s : text.sentences) {
                writer.write(String.valueOf(s));
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}


