package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;




class Frame extends JFrame implements ActionListener {
    String numberStr= "";
    Double term1;
    Double term2;
    Double result;
    String operator;


    JLabel ecran1 = new JLabel();
    JPanel ecran = new JPanel();

    JButton one = new JButton();
    JButton two = new JButton();
    JButton three = new JButton();
    JButton four = new JButton();
    JButton five = new JButton();
    JButton six = new JButton();
    JButton seven = new JButton();
    JButton eight = new JButton();
    JButton nine = new JButton();
    JButton zero = new JButton();
    JButton plus = new JButton();
    JButton minus = new JButton();
    JButton divide = new JButton();
    JButton multiply = new JButton();
    JButton equals = new JButton();
    JButton point = new JButton();
    JButton empty = new JButton();

    Frame() {



        one.setText("1");
        two.setText("2");
        three.setText("3");
        four.setText("4");
        five.setText("5");
        six.setText("6");
        seven.setText("7");
        eight.setText("8");
        nine.setText("9");
        zero.setText("0");
        plus.setText("+");
        minus.setText("-");
        divide.setText("/");
        equals.setText("=");
        point.setText(".");




        ecran.setBounds(0, 0, 174, 50);
        ecran.add(ecran1);
        ecran1.setBounds(0, 0, 174, 50);
       // ecran1.setLayout(null);
        //ecran.add(new JButton());
        //ecran.setLayout(null);
       // ecran.setBackground(Color.CYAN);
       // ecran1.setBackground(Color.red);
        //ecran1.setVisible(true);

        JPanel calculator = new JPanel();
        calculator.add(one);
        calculator.add(two);
        calculator.add(three);
        calculator.add(four);
        calculator.add(five);
        calculator.add(six);
        calculator.add(seven);
        calculator.add(eight);
        calculator.add(nine);
        calculator.add(zero);
        calculator.add(plus);
        calculator.add(minus);
        calculator.add(multiply);
        calculator.add(equals);
        calculator.add(divide);
        calculator.add(point);
        calculator.add(empty);
        calculator.setLayout(null);
        calculator.setBounds(0, 50, 174, 164);

        one.setBounds(0, 0, 40, 40);
        two.setBounds(41, 0, 40, 40);
        three.setBounds(82, 0, 40, 40);
        four.setBounds(0, 41, 40, 40);
        five.setBounds(41, 41, 40, 40);
        six.setBounds(82, 41, 40, 40);
        seven.setBounds(0, 82, 40, 40);
        eight.setBounds(41, 82, 40, 40);
        nine.setBounds(82, 82, 40, 40);
        empty.setBounds(0, 123, 40, 40);
        zero.setBounds(41, 123, 40, 40);
        point.setBounds(82, 123, 40, 40);
        plus.setBounds(123, 0, 50, 40);
        divide.setBounds(123, 82, 50, 40);
        minus.setBounds(123, 41, 50, 40);
        equals.setBounds(123, 123, 50, 40);

        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        zero.addActionListener(this);
        point.addActionListener(this);
        equals.addActionListener(this);
        plus.addActionListener(this);
        divide.addActionListener(this);
        multiply.addActionListener(this);
        minus.addActionListener(this);





        this.setSize(195, 255);
        this.setLayout(null);
        this.add(ecran);
        this.add(calculator);
        this.setVisible(true);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

//JButton[] numbers = new JButton[]{one, two,three,four,five,six,seven,eight,nine,zero,point};
//JButton [] operations = new JButton[]{plus,minus,divide,multiply};
//
//@Override
//public  String toString(){
//    if ( this.getType()==JButton){
//
//    }
//    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == one) {
            numberStr = numberStr + "1";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == two) {
            numberStr = numberStr + "2";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == three) {
            numberStr = numberStr + "3";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == four) {
            numberStr = numberStr + "4";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == five) {
            numberStr = numberStr + "5";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == six) {
            numberStr = numberStr + "6";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == seven) {
            numberStr = numberStr + "7";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == eight) {
            numberStr = numberStr + "8";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == nine) {
            numberStr = numberStr + "9";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == zero) {
            numberStr = numberStr + "0";
            ecran1.setText(numberStr);
        }
        if (e.getSource() == point) {
            numberStr = numberStr + ".";
            ecran1.setText(numberStr);
        }

        if (e.getSource()==plus){
            term1=Double.parseDouble(numberStr);
            numberStr="";
            operator="+";
        }
        if (e.getSource()==minus){
            term1=Double.parseDouble(numberStr);
            numberStr="";
            operator="-";
        }
        if (e.getSource()==divide){
            term1=Double.parseDouble(numberStr);
            numberStr="";
            operator="/";
        }
        if (e.getSource()==multiply){
            term1=Double.parseDouble(numberStr);
            numberStr="";
            operator="*";
        }

        if(e.getSource()==equals){
            term2=Double.parseDouble(numberStr);
            numberStr="";
            if (operator=="+"){
                result=term1+term2;
            }
            if (operator=="-"){
                result=term1-term2;
            }
            if (operator=="*"){
                result=term1*term2;
            }
            if (operator=="/"){
                result=term1/term2;
            }
            ecran1.setText(result.toString());
        }
    }
}

    public class Main {

        public static void main(String[] args) {

            new Frame();
        }
    }
