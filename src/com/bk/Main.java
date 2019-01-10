package com.bk;

public class Main {
    public static void main(String[] args) {

        new ExcelConverter().setVisible(true);

        Converter conv = new Converter();
        System.out.println(conv.titleToNumber("abc"));
        System.out.println(conv.numberToTitle("731"));

    }

}
