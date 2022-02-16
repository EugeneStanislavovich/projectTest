package Laba2; //пакет Java классов

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)
import javax.swing.event.MenuKeyEvent;

public class subversion {
	
	
	
	public static void main(String[] args) throws IOException { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/

		BufferedImage bufferedImage = ImageIO.read(new File("ugatu.png"));
		Image image = bufferedImage.getScaledInstance(300, 149, 0);
			
		JFrame main_GUI = new JFrame("subversion");	// создание графического окна
		main_GUI.setTitle ("Using subversion for developers");
		main_GUI.setBounds(500,400,800,600);
		main_GUI.setResizable(false); // фиксированный размер окна
		
		
		JPanel main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel);
		
		JLabel laba_info = new JLabel("Лабораторная работа №2"); // Отображение текста или изображения
		laba_info.setBounds(300,0,150,30);
		main_panel.add(laba_info);
		
		
		ImageIcon icon = new ImageIcon(image);
		JLabel pich = new JLabel();
		pich.setIcon(icon);
		pich.setBounds(200, 100, 300, 150);
		main_panel.add(pich);
		pich.setVisible(false);
		
		JButton button_exit = new JButton("Выход"); // добавляем кнопку
		button_exit.setBounds(675,450,100,40);
		ActionListener actionListener = new ListenerButton(); //создаем слушатель
		button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
		main_panel.add(button_exit);
		
		JButton information = new JButton("Информация");
	    information.setBounds(10,450,150,40);
	    ActionListener actionListener1 = new Information(); 
	    information.addActionListener(actionListener1); 
	    main_panel.add(information);
	    
	    JMenuBar menuBar = new JMenuBar();
	    JMenu setLogo = new JMenu("Изображение");
	    setLogo.setMnemonic(MenuKeyEvent.VK_F);
	    menuBar.add(setLogo);
	    JMenuItem LogoItem = new JMenuItem("Отобразить логотип УГАТУ");
	    setLogo.add(LogoItem);
	    JMenuItem Exit = new JMenuItem("Выход");
	    setLogo.add(Exit);
	    main_GUI.setJMenuBar(menuBar);
	    
	    class ShowLogo extends subversion implements ActionListener {

				// TODO Auto-generated constructor stub
				public void actionPerformed(ActionEvent e) {
		    		pich.setVisible(true);
		    		

		    	}	
	    }
	    
	    ActionListener actionListener2 = new ShowLogo();
	    LogoItem.addActionListener(actionListener2);
	    ActionListener actionListener3 = new ExitMenu();
	    Exit.addActionListener(actionListener3);
	    main_GUI.setVisible(true);
	    main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	}

}
