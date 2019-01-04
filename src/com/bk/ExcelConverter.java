package com.bk;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcelConverter {
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
        convertButtonColumnName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {


            }
        });
        convertButtonNumberColumn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

    }
}
