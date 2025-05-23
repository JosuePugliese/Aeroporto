package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class areaAmministratore {
    private JPanel panel1;
    private JButton MODIFICAButton;
    private JButton PRENOTAButton;
    private JTextField VOLO2TextField;
    private JButton MODIFICAButton1;
    private JButton PRENOTAButton1;

    public areaAmministratore() {
        ActionListener modificaVoloListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        MODIFICAButton.addActionListener(modificaVoloListener);
        MODIFICAButton1.addActionListener(modificaVoloListener);


        ActionListener prenotaPerUtenteListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };
        PRENOTAButton.addActionListener(prenotaPerUtenteListener);
        PRENOTAButton1.addActionListener(prenotaPerUtenteListener);
    }
}
