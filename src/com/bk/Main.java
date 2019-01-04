package com.bk;

import javax.swing.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        new ExcelConverter().setVisible(true);

        Scanner sc = new Scanner(System.in);

        Converter conv = new Converter();
        System.out.println(conv.titleToNumber("ABC"));
        System.out.println(conv.numberToTitle(123));

    }

}
