package com.example.calkulator.calculator2;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.print.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Calculator extends JFrame{
    private static JTextField textField;
    private static JButton button_system, zakypka, prodaga;
    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("калькулятор");
        JPanel panel= new JPanel(new GridLayout(5,6));
        textField=new JTextField();
        Font mainFont = new Font("Times New Roman", Font.BOLD, 20);
        textField.setFont(mainFont);
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setVisible(true);
        frame.getContentPane().add(BorderLayout.CENTER,textField);
        frame.getContentPane().add(panel);

        button_system=new JButton("?");// создание
        zakypka=new JButton("закупка");
        prodaga =new JButton("продажа");

        panel.add(button_system);//добавление
        panel.add(zakypka);
        panel.add(prodaga);
    }
}
