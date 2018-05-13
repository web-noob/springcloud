package com.wqn.zikao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java09 {

    JFrame frame;
    JPanel panel;
    JTextField text1;
    JTextField text2;
    int num1=0;
    int num2=0;

    public static void main(String[] args){
        Java09 main=new Java09();
        main.init();
    }

    public void init(){
        frame = new JFrame("平均值域最大值");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLocation(300,100);
        //panel
        panel=new JPanel(new GridLayout(3,1));
        JPanel topPanel = new JPanel();
        JPanel middlePanel=new JPanel();
        JPanel bottomPanel = new JPanel();
        frame.setContentPane(panel);
        panel.add(topPanel);
        panel.add(middlePanel);
        panel.add(bottomPanel);
        //TextField
        text1=new JTextField("0",20);
        text2=new JTextField("0",20);
        topPanel.add(text1);
        topPanel.add(text2);
        //button
        JButton button1=new JButton("平均值");
        JButton button2=new JButton("最大值");
        middlePanel.add(button1);
        middlePanel.add(button2);
        //label
        final JLabel label = new JLabel("结果");
        bottomPanel.add(label);
        //action
        button1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(getAverage());
            }
        });
        button2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(getMax());
            }
        });
        frame.setVisible(true);
    }

    public void getNum(){
        try {
            num1=Integer.valueOf(text1.getText().trim()).intValue();
            num2=Integer.valueOf(text2.getText().trim()).intValue();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(frame,"请输入整数");
        }
    }
    public String getAverage(){
        getNum();
        double average = (num1+num2)/2.0;
        String result=String.valueOf(average);
        return result;
    }

    public String getMax(){
        getNum();
        int max=num1;
        if(num1<num2){
            max=num2;
        }
        String result=String.valueOf(max);
        return result;
    }
}
