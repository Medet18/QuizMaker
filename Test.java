package com.company;

class Test extends Question{
    String[] options;
    String[] strings;
    int numOfOptions;
    java.util.ArrayList labels;
    public Test(String[] strings){
        super();
        labels = new java.util.ArrayList();
    }
    public Test(String[] options, String[] strings){
        this.options = options;
        this.numOfOptions = numOfOptions;
        this.strings = strings;
    }

    public Test() {

    }

    public void setOptions(String[] options){
        this.options = options;
    }
    public String getOptionsAt(int numOfOptions){
        return options[numOfOptions];
    }

    @Override
    public String toString() {
       labels.add("A");
       labels.add("B");
       labels.add("C");
       labels.add("D");
       String[] str = new String[options.length];
       int i = 0;
       String answer = "";
       for(String a : options){
           str[i] = labels.get(i) + ")" + a.replaceAll("{blank}" ,"__________");
           if(a == strings[0]){
               answer = labels.get(i) + ")" + a.replaceAll("{blank}" ,"__________");
           }
           i++;
       }
       this.answer = answer;
       return this.answer;
    }
}