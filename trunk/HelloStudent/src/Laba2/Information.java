package Laba2;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class Information implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "���������� �������\n";
        message += "������ �������\n";
        message += "������� �������\n";
        message += "������������ �������\n";
        
        JOptionPane.showMessageDialog(null, message , "���������" , JOptionPane.PLAIN_MESSAGE);
    }
}