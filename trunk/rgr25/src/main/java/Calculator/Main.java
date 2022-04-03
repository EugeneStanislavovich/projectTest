package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		
		JFrame Main_Frame = new JFrame("Frame");
		Main_Frame.setTitle("������ �����������");
		Main_Frame.setBounds(500, 400, 600, 400);
		Main_Frame.setResizable(false);
		
		JPanel Main_Panel = new JPanel();
		Main_Panel.setLayout(null);
		Main_Frame.add(Main_Panel);
		
		JLabel FirstLabel = new JLabel("����� ����� �������");
		Main_Panel.add(FirstLabel);
		FirstLabel.setBounds(20, 80, 260, 20);
		FirstLabel.setVisible(true);
		final JTextField FirstField = new JTextField();
		Main_Panel.add(FirstField);
		FirstField.setBounds(20, 100, 260, 20);
		FirstField.setVisible(true);
		JLabel SecondLabel = new JLabel("���� ������������ � �������");
		Main_Panel.add(SecondLabel);
		SecondLabel.setBounds(20, 120, 260, 20);
		SecondLabel.setVisible(true);
		final JTextField SecondField = new JTextField();
		Main_Panel.add(SecondField);
		SecondField.setBounds(20, 140, 260, 20);
		SecondField.setVisible(true);
		JLabel ThirdLabel = new JLabel("������� ������ �� �������");
		Main_Panel.add(ThirdLabel);
		ThirdLabel.setBounds(20, 160, 260, 20);
		ThirdLabel.setVisible(true);
		final JTextField ThirdField = new JTextField();
		Main_Panel.add(ThirdField);
		ThirdField.setBounds(20, 180, 260, 20);
		ThirdField.setVisible(true);
		JLabel FourthLabel = new JLabel("����������� ����� �� �������:");
		Main_Panel.add(FourthLabel);
		FourthLabel.setBounds(320, 100, 260, 20);
		FourthLabel.setVisible(true);
		final JLabel FifthLabel = new JLabel("");
		Main_Panel.add(FifthLabel);
		FifthLabel.setBounds(320, 120, 260, 20);
		FifthLabel.setVisible(false);
		JLabel SixthLabel = new JLabel("����� ����� ������� � ����������:");
		Main_Panel.add(SixthLabel);
		SixthLabel.setBounds(320, 140, 260, 20);
		SixthLabel.setVisible(true);
		final JLabel SeventhLabel = new JLabel("");
		Main_Panel.add(SeventhLabel);
		SeventhLabel.setBounds(320, 160, 260, 20);
		SeventhLabel.setVisible(false);
		
		JButton Information = new JButton("����������");
		Information.setBounds(20, 300, 120, 30);
		Main_Panel.add(Information);
		Information.setVisible(true);
		ActionListener InforListener = new Information();
		Information.addActionListener(InforListener);
		
		class Raschet extends Main implements ActionListener {

			private double A;

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String S_stroka = FirstField.getText();
				Integer S = Integer.parseInt(S_stroka);
				String M_stroka = SecondField.getText();
				Integer M = Integer.parseInt(M_stroka);
				String P_stroka = ThirdField.getText();
				float P = Integer.parseInt(P_stroka);
				 P = (float) P / 1200;
				 A = S * P / ( 1 - Math.pow(1 + P, -M));
				 A = Math.ceil(A);
				 double H = A * M;
				SeventhLabel.setText("" + H);
				FifthLabel.setText("" + A);
				FifthLabel.setVisible(true);
				SeventhLabel.setVisible(true);
				
			}
			
		}
		
		JButton Calculated = new JButton("���������");
		Calculated.setBounds(160, 300, 120, 30);
		Main_Panel.add(Calculated);
		Calculated.setVisible(true);
		ActionListener Calculat = new Raschet();
		Calculated.addActionListener(Calculat);
		
		JButton Exit = new JButton("�����");
		Exit.setBounds(460, 300, 100, 30);
		Main_Panel.add(Exit);
		Exit.setVisible(true);
		ActionListener ExitListener = new ExitButton();
		Exit.addActionListener(ExitListener);
		
		Main_Frame.setVisible(true);
		Main_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
