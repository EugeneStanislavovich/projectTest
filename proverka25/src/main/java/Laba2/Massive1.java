package Laba2;

public class Massive1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer min = 50; // ����������� ����� ��� ���������
		Integer max = 95; // ������������ ����� ��� ���������
		

		Integer[] Massive = new Integer[7];
		Integer i = 0;
		max -= min;
		while (i <= 6) {
			Massive[i] = (int) (Math.random() * ++max) + min;
			i++;
			
		}

	}

}
