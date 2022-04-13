package applet_56418043;

import java.applet.Applet;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bola1 extends Applet implements Runnable, ActionListener {
    
    Button button1;
    Button button2;
    int x, arahX;
    int y, arahY;
    public void init() {
        
        button1 = new Button("^");
        button1.setBounds(300, 40, 80, 30);
        button1.addActionListener(this);
        
        button2 = new Button("<>");
        button2.setBounds(300, 80, 80, 30);
        button2.addActionListener(this);
        
        add(button1);
        add(button2);
        
        x = 50;
        y = 20;
        arahX = 2;
        arahY =2;
        
        Thread t = new Thread(this);
        setLayout(null);
        t.start();
    }

    public void paint (Graphics g) {
        g.clearRect(0, 0, 300, 300);
        g.setColor(Color.blue);
        g.drawRect(5, 5, 240, 240);
        g.setColor(Color.red);
        g.fillOval(x, y, 20, 20);
    }
    
    public void run() {
        while (true) {
            try{
                cekBola();
                Thread.sleep(5);
                repaint();
            } catch (Exception e) {}
        }
    }
    
    public void cekBola(){
        if (y > 240 || y < 0) {
            arahY = -arahY;
        }
        if (x > 240 || x < 0) {
            arahX = -arahX;
        }
        y = y + arahY;
        x = x + arahX;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == button1){
            arahY = 2;
            arahY = -arahY;
            arahX = 0;
        }
        else  {
            arahX = 2;
            arahX = -arahX;
            arahY = 0;
        }
    }
}