package bank.managemnet.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Signup0 extends JFrame {
    
    
    
    Signup0() {
        
        setLayout(null);
        Random ran = new Random();
        long randomnum = (Math.abs(ran.nextLong() % 9000L)) + 1000;
        
        
        JLabel formnum = new JLabel("Application form no. "+ randomnum );
        formnum.setFont(new Font("Aerial",Font.BOLD,38));
        formnum.setBounds(150,20,500,40);
        add(formnum);
        
        JLabel personalinfo = new JLabel("Page 1 : Personal Details");
        personalinfo.setFont(new Font("Aerial",Font.BOLD,23));
        personalinfo.setBounds(250,90,300,40);
        add(personalinfo);
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    }
    
    public static void main(String[] args) {
        new Signup0();
    }
}
