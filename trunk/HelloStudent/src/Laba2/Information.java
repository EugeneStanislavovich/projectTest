package Laba2;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class Information implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String message = "";
        message += "Налигацкий Евгений\n";
        message += "Аминев Алексей\n";
        message += "Вяхирев Алексей\n";
        message += "Масленникова Ванесса\n";
        
        JOptionPane.showMessageDialog(null, message , "Сообщение" , JOptionPane.PLAIN_MESSAGE);
    }
}