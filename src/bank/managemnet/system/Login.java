package bank.managemnet.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    
    Login() {
        
        setLayout(null);
        setTitle("Automated Teller Machine");
                
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,30,100,100);
        add(label);
        
        JLabel text = new JLabel("Welcome to Atm");
        add(text);
        text.setFont(new Font("Sansserif",Font.BOLD,38));
        text.setBounds(200,50,400,50);
        getContentPane().setBackground(Color.white);
        
        JLabel Cardno = new JLabel("Card No : ");
        add(Cardno);
        Cardno.setFont(new Font("Sansserif",Font.BOLD,20));
        Cardno.setBounds(130,150,300,45);
        
        JTextField cardTextField = new JTextField();
        cardTextField.setBounds(250, 160, 250, 25);
        add(cardTextField);
        
        JLabel pin = new JLabel("Pin No : ");
        add(pin);
        pin.setFont(new Font("Sansserif",Font.BOLD,20));
        pin.setBounds(130,220,300,45);
        
        JTextField pinTextField = new JTextField();
        pinTextField.setBounds(250, 230, 250, 25);
        add(pinTextField);
        
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public static void main(String[] args) {
        
        new Login();

    }
}
