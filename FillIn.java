package com.company;

public class FillIn extends Question{

    public FillIn() {
        super();

    }
    public String toString() {
        return description.replaceAll("{blank}", "____");
    }

}
