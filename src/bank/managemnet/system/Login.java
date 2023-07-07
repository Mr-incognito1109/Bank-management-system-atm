package bank.managemnet.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton signIn , clear , signUp;
    JTextField cardTextField;
    JPasswordField pinTextField;
    
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
        
        cardTextField = new JTextField();
        cardTextField.setBounds(250, 160, 250, 25);
        add(cardTextField);
        
        JLabel pin = new JLabel("Pin No : ");
        add(pin);
        pin.setFont(new Font("Sansserif",Font.BOLD,20));
        pin.setBounds(130,220,300,45);
        
        pinTextField = new JPasswordField();
        pinTextField.setBounds(250, 230, 250, 25);
        add(pinTextField);
        
        
        signIn = new JButton("SIGN IN");
        signIn.setBounds(250,300,100,30);
        signIn.setBackground(Color.BLACK);
        signIn.setForeground(Color.white);
        signIn.addActionListener(this);
        add(signIn);
        
        clear = new JButton("CLEAR");
        clear.setBounds(400,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);
        
        signUp = new JButton("SIGN UP");
        signUp.setBounds(250,350,250,30);
        signUp.setBackground(Color.BLACK);
        signUp.setForeground(Color.white);
        signUp.addActionListener(this);
        add(signUp);
        
        setSize(800,480);
        setVisible(true);
        setLocation(350,200);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()== clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }else if (ae.getSource()==signIn) {
            
        }else if (ae.getSource()==signUp) {
            
        }
    }
    
    public static void main(String[] args) {
        
        new Login();

    }
}
