package Laba2;

public class Random {
	final int min = 50; // Минимальное число для диапазона
	final int max = 95; // Максимальное число для диапазона
	final int rnd = rnd(min, max);
	
	public static int rnd(int min, int max)
	{
		max -= min;
		return (int) (Math.random() * ++max) + min;
	}
	

}

