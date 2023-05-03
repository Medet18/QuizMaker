package com.company;

import java.lang.reflect.Array;
import java.util.*;
import java.io.*;



public class Quiz extends Question  {
    String name;
    ArrayList questions;

    public Quiz() {

        questions = new ArrayList();
    }

    public Quiz(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String question = "";
    private String answer = "";
    private String s = "";
    private ArrayList<String> ds = new ArrayList<String>();
    private ArrayList<String> fun = new ArrayList<>();
    public void loadFromFile(String load) throws FileNotFoundException {
        File file = new File(load);
        Scanner scan = new Scanner(file);
        while(scan.hasNext()){
             question += scan.nextLine() + "\n";
            description = question ;
        }
        String[] str = description.split("\n\n");
        for(String t: str) {
            ds.add(t);
        }
        Collections.shuffle(ds);
        for(String f : ds){
            String[] strings = f.split("\n");
            if(strings.length == 2){
                s = strings[0].replace("{blank}" , "____");

            }else{
                for(int i = 1;i<strings.length;i++){
                  fun.add(strings[i]);
                }
                Collections.shuffle(fun);
                for(String cs :fun) {
                    String[] str1 = cs.split("\n");

                }
            }
        }
    }

    public String toString() {
        return "Quiz " + "name='" + name + '\'' +
                ", questions "+ '\n' + questions;
    }

    public void start(){
        System.out.println("===============================" );
        System.out.println();
        System.out.println("WELCOME TO " + name + " QUIZ!");
        System.out.println();
        System.out.println("-------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println(ds);
        String s = sc.next();
        boolean a = true;
        do{
            if(s == answer){
                System.out.println("Incorrect !");
                a = true;
            }else{
                System.out.println("Invalid choice! Try again (Ex: A, B, ...) :");
                a = false;
                s = sc.next();
            }
        }while(a == false);

        }

}





