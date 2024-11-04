package Mainn;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Login extends JFrame implements ActionListener {

    JButton rules, back;
    JTextField tfname, tfusername;
    JPasswordField tfpassword;

    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon("C:\\Users\\ASUS\\Downloads\\login.jpeg");
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);

        JLabel nameLabel = new JLabel("Enter your name");
        nameLabel.setBounds(810, 150, 300, 20);
        nameLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        nameLabel.setForeground(new Color(30, 144, 254));
        add(nameLabel);

        tfname = new JTextField();
        tfname.setBounds(735, 180, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);

        JLabel usernameLabel = new JLabel("Enter your username");
        usernameLabel.setBounds(810, 220, 300, 20);
        usernameLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        usernameLabel.setForeground(new Color(30, 144, 254));
        add(usernameLabel);

        tfusername = new JTextField();
        tfusername.setBounds(735, 250, 300, 25);
        tfusername.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfusername);

        JLabel passwordLabel = new JLabel("Enter your password");
        passwordLabel.setBounds(810, 290, 300, 20);
        passwordLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        passwordLabel.setForeground(new Color(30, 144, 254));
        add(passwordLabel);

        tfpassword = new JPasswordField();
        tfpassword.setBounds(735, 320, 300, 25);
        tfpassword.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfpassword);

        rules = new JButton("Login");
        rules.setBounds(735, 370, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);

        back = new JButton("Back");
        back.setBounds(915, 370, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            String username = tfusername.getText();
            String password = new String(tfpassword.getPassword());

            if (name.isEmpty() || username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please fill in all fields");
            } else {
                // Save user details to the database
                if (saveUser(name, username, password)) {
                    JOptionPane.showMessageDialog(this, "User registered successfully!");
                    setVisible(false);
                    new Rules(name);
                } else {
                    JOptionPane.showMessageDialog(this, "Username already exists or database error.");
                }
            }
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    // Database save method, now using the DBConnection class
    private boolean saveUser(String name, String username, String password) {
        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO Users (name, username, password) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, password);
            int rowsAffected = ps.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
