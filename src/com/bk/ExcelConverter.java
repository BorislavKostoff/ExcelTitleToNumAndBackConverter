package com.bk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcelConverter extends JFrame {

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
                for (int i = 0; i < text_columnName.getText().length(); i++) {
                    char letter = text_columnName.getText().charAt(i);

                    if (!Character.isLetter(letter)) {
                        result_text_result.setText("You must enter a valid letter!");
                        break;
                    } else if (text_columnName.getText().length() > 20) {
                        result_text_result.setText("You may enter 20 letters max!");
                    } else {
                        result_text_result.setText(String.valueOf(conv.titleToNumber(text_columnName.getText())));
                    }
                }



            }
        });
        convertButtonNumberColumn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                for (int i = 0; i < text_numberColumn.getText().length(); i++) {
                    char digit = text_numberColumn.getText().charAt(i);

                    if (!Character.isDigit(digit)) {
                        result_text_result.setText("You must enter a valid digit!");
                        break;
                    } else if (text_numberColumn.getText().length() > 20) {
                        result_text_result.setText("You may enter 20 digits max!");
                        break;
                    } else {
                        result_text_result.setText(conv.numberToTitle(text_numberColumn.getText()));
                    }

                }


            }
        });
    }
}
