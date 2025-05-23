package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class areaClienti {
    private JPanel panel1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;

    public areaClienti() {


        ActionListener prenota = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        button1.addActionListener(prenota);
        button2.addActionListener(prenota);
        button3.addActionListener(prenota);
        button4.addActionListener(prenota);
        button5.addActionListener(prenota);
    }
}
