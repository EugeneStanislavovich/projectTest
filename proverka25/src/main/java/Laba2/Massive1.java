package Laba2;

public class Massive1 {
	static Integer schet = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer min = 50; // Минимальное число для диапазона
		Integer max = 95; // Максимальное число для диапазона
		

		Integer[] Massive = new Integer[7];
		Integer i = 0;
		max -= min;
		while (i <= 6) {
			Massive[i] = (int) (Math.random() * ++max) + min;
			i++;
			schet++;
			
		}
		
		
		class Sorting extends Massive1 {


			public void sort() {
				for (int out = schet - 1; out >= 1; out--) {
					for (int in = 0; in < out; in++) {
						if (Massive[in] > Massive[in+1]) {
							Integer time = Massive[in];
							Massive[in] = Massive[in+1];
							Massive[in+1] = time;
						}
					}
				}
			
			}


		}
		Sorting sorting = new Sorting();
		sorting.sort();
		
		while(schet >=1 ) {     
			schet--;
			System.out.println(Massive[schet]);
		}


	}



}
