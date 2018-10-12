package com.company;

/**
 * Created by al5091 on 10/9/18.
 */
public class Square {

    private int luckyNumber;
    private String name;

    public Square(String person) {
        name = person;
        int r  = (int)(Math.random() * 100);
        luckyNumber = r * r;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return luckyNumber;
    }

}
