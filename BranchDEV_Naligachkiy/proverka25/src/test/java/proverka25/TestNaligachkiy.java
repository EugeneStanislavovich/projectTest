package proverka25;

import static org.junit.Assert.*;

import org.junit.Test;

import Laba2.Random;

public class TestNaligachkiy {

	@Test
	public void test() {
		Integer RandomTest = Random.Rand();
		if (RandomTest > 50) {
			if (RandomTest < 95) {
				System.out.println("�� ���!");
				}
			else {fail("Not yet implemented");}
		}
		else {fail("Not yet implemented");}
		fail("Not yet implemented");
	}

}
