package Laba2;

public class Random {
	final int min = 50; // ����������� ����� ��� ���������
	final int max = 95; // ������������ ����� ��� ���������
	final int rnd = rnd(min, max);
	
	public static int rnd(int min, int max)
	{
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}
	

}

