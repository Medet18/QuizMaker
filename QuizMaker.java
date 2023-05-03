package com.company;
import java.io.*;
import java.util.*;
public class QuizMaker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        Quiz quiz = new Quiz(name);
        String load = sc.next();
        try {
            quiz.loadFromFile(load);
            quiz.start();
        } catch (FileNotFoundException e) {
            System.out.println("Such a file does not exist!");
            System.exit(0);
        }



    }

}
