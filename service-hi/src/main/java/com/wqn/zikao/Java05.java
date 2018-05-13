package com.wqn.zikao;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Java05 extends Applet implements ActionListener {

    TextField t1,t2;
    Label label1,label2;
    Button b1,b2;

    public void init() {
        t1=new TextField(20);
        t2=new TextField(20);
        b1=new Button("确定");
        b2=new Button("清除");
        label1=new Label("请输入一个字符串");
        label2=new Label("字符串逆序结果:");
        t2.setEditable(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(label1);
        add(t1);
        add(b1);
        add(b2);
        add(label2);
        add(t2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            StringBuffer str=new StringBuffer(t1.getText());
            str=str.reverse();
            t2.setText(null);
            t2.setText(str.toString());
        }
        if(e.getSource()==b2){
            t1.setText(null);
            t2.setText(null);
        }
    }
}
