package bank.managemnet.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;

public class Signup0 extends JFrame {
    
    
    
    Signup0() {
        
        setLayout(null);
        Random ran = new Random();
        long randomnum = (Math.abs(ran.nextLong() % 9000L)) + 1000;
        
        
        JLabel formnum = new JLabel("Application Form No. "+ randomnum );
        formnum.setFont(new Font("Aerial",Font.BOLD,38));
        formnum.setBounds(150,20,500,40);
        add(formnum);
        
        JLabel personalinfo = new JLabel("Page 1 : Personal Details");
        personalinfo.setFont(new Font("Aerial",Font.BOLD,23));
        personalinfo.setBounds(250,90,300,40);
        add(personalinfo);
        
        JLabel name = new JLabel("Name : ");
        name.setFont(new Font("Aerial",Font.BOLD,17));
        name.setBounds(90,200,300,40);
        add(name);
        
        JTextField nameTextField = new JTextField();
        nameTextField.setFont(new Font("Aerial",Font.BOLD,14));
        nameTextField.setBounds(300,210,350,23);
        add(nameTextField);
        
        JLabel fname = new JLabel("Father's Name : ");
        fname.setFont(new Font("Aerial",Font.BOLD,17));
        fname.setBounds(90,250,300,40);
        add(fname);
        
        JTextField fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Aerial",Font.BOLD,14));
        fnameTextField.setBounds(300,260,350,23);
        add(fnameTextField);
        
        JLabel dob = new JLabel("Date Of Birth : ");
        dob.setFont(new Font("Aerial",Font.BOLD,17));
        dob.setBounds(90,300,300,40);
        add(dob);
        
        JDateChooser datechooser = new JDateChooser();
        datechooser.setBounds(300,310,300,40);
        
        
        JLabel gen = new JLabel("Gender : ");
        gen.setFont(new Font("Aerial",Font.BOLD,17));
        gen.setBounds(90,350,300,40);
        add(gen);
        
        JLabel email = new JLabel("Email : ");
        email.setFont(new Font("Aerial",Font.BOLD,17));
        email.setBounds(90,400,300,40);
        add(email);
        
        JTextField emailTextField = new JTextField();
        emailTextField.setFont(new Font("Aerial",Font.BOLD,14));
        emailTextField.setBounds(300,410,350,23);
        add(emailTextField);
        
        JLabel marital = new JLabel("Marital Status : ");
        marital.setFont(new Font("Aerial",Font.BOLD,17));
        marital.setBounds(90,450,300,40);
        add(marital);
        
        JLabel address = new JLabel("Address : ");
        address.setFont(new Font("Aerial",Font.BOLD,17));
        address.setBounds(90,500,300,40);
        add(address);
        
        JTextField addressTextField = new JTextField();
        addressTextField.setFont(new Font("Aerial",Font.BOLD,14));
        addressTextField.setBounds(300,510,350,23);
        add(addressTextField);
        
        JLabel city = new JLabel("City : ");
        city.setFont(new Font("Aerial",Font.BOLD,17));
        city.setBounds(90,550,300,40);
        add(city);
        
        JTextField cityTextField = new JTextField();
        cityTextField.setFont(new Font("Aerial",Font.BOLD,14));
        cityTextField.setBounds(300,560,350,23);
        add(cityTextField);
        
        JLabel pincode = new JLabel("Pin Code : ");
        pincode.setFont(new Font("Aerial",Font.BOLD,17));
        pincode.setBounds(90,600,300,40);
        add(pincode);
        
        JTextField pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Aerial",Font.BOLD,14));
        pincodeTextField.setBounds(300,610,350,23);
        add(pincodeTextField);
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    
    }
    
    public static void main(String[] args) {
        new Signup0();
    }
}
