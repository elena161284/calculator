package com.example.calkulator.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ContactForm extends JFrame {
    Scanner scanner = new Scanner(System.in);
    ZnageniaServiceOSN serviceOSN = new ZnageniaServiceOSN();
    ZnageniaServiceUSN serviceUSN = new ZnageniaServiceUSN();
    ZnageniaServiceOOO serviceOOO = new ZnageniaServiceOOO();
    JTextField zakupka1_field, prodaja1_field;
    JRadioButton usn, osn, ooo;
    JCheckBox chec;
Znagenia znagenia=new Znagenia(scanner.nextDouble(),scanner.nextDouble());

    public ContactForm() {
        super("Калькулятор чистой прибыли");
        super.setBounds(200, 100, 400, 250);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = super.getContentPane();
        container.setLayout(new GridLayout(6, 2, 2, 5));

        JLabel zakupka = new JLabel("Введите сумму закупки");
        zakupka1_field = new JTextField("", 1);
        JLabel prodaja = new JLabel("Введите сумму продажи");
        prodaja1_field = new JTextField("", 1);

        container.add(zakupka);
        container.add(zakupka1_field);
        container.add(prodaja);
        container.add(prodaja1_field);

        usn = new JRadioButton("ИП на УСН");
        osn = new JRadioButton("ИП на ОСН");
        ooo = new JRadioButton("ООО");


        chec = new JCheckBox("Согласен", false);
        JButton send_button = new JButton("Отправить");

        osn.setSelected(true);
        container.add(osn);
        container.add(usn);
        container.add(ooo);

        ButtonGroup group = new ButtonGroup();
        group.add(osn);
        group.add(usn);
        group.add(ooo);

        container.add(chec);
        container.add(send_button);

        send_button.addActionListener(new CForm());
    }

    public final class CForm implements ActionListener {

        //public  void
        @Override
        public void actionPerformed(ActionEvent e) {

           // double znagenia2=new Double(zakupka1_field., prodaja1_field.getY());
          //  double n=scanner.nextDouble();
            String name;
            if (osn.isSelected()) {
                name = "ИП на OСН";
            } else if (ooo.isSelected()) {
                name = "ooo";
            } else {
                name = "ИП на УСН";
            }

            // checkBox = chec.isSelected();

            JOptionPane.showMessageDialog(null, " \nчистая прибыль: " +
                    serviceOSN.revenueR(znagenia), name, JOptionPane.PLAIN_MESSAGE);
        }
    }
}


