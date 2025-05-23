package GUI;

import Controller.Controller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class loginUtente {
    private JPanel panel1;
    private JButton loginButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private Controller controller;


    public loginUtente(Controller controller) {
        this.controller = new Controller();
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.loginUtente(textField1.getText(), Arrays.toString(passwordField1.getPassword()));

            }
        });


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("loginUtente");
        frame.setContentPane(new loginUtente().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
