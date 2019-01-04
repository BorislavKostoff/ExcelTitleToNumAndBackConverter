package com.bk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ExcelConverter extends JFrame {


    Scanner sc = new Scanner(System.in);

    Converter conv = new Converter();

    private JPanel panel1;
    private JLabel labelName;
    private JTextField text_columnName;
    private JButton convertButtonColumnName;
    private JButton convertButtonNumberColumn;
    private JTextField text_numberColumn;
    private JLabel labelName1;
    private JLabel result_text_result;
    private JLabel result_label;
    private JLabel window_program_name;


    public ExcelConverter() {

        setLocationRelativeTo(this);
        setSize(520,250);
        setContentPane(panel1);




        convertButtonColumnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                result_text_result.setText(String.valueOf(conv.titleToNumber("ABC")));


            }
        });
        convertButtonNumberColumn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                result_text_result.setText(conv.numberToTitle(123));

            }
        });


    }
}
