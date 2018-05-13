package com.wqn.zikao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java03 extends JFrame implements ActionListener{
    private JLabel label1,label2;
    private JTextField field1,field2;
    private JButton button1,button2,button3;

    public Java03(){
        super("求一个数的绝对值");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        setSize(300,150);
        setVisible(true);
        label1=new JLabel("输入一个数:");
        label2 = new JLabel("该数的绝对值是:");
        field1=new JTextField(10);
        field2=new JTextField(10);
        button1=new JButton("求绝对值");
        button2=new JButton("退出");
        button3=new JButton("清除");
        field2.setEditable(false);
        container.add(label1);container.add(field1);
        container.add(label2);container.add(field2);
        container.add(button1);container.add(button2);
        container.add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
    }

    public static void main(String args[]){
        Java03 java03=new Java03();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button2)
            System.exit(0);
        else if(e.getSource()==button1){
            int a=Integer.parseInt(field1.getText());
            if(a>=0){
                String result=String.valueOf(a);
                field2.setText(result);
            }else{
                String result=String.valueOf(-a);
                field2.setText(result);
            }
        }else if(e.getSource()==button3){
            field1.setText(null);
            field2.setText(null);
        }
    }
}
