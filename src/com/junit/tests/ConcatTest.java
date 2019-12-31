package com.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class ConcatTest {
	
	Beginners obj = new Beginners();
	
	Software obb = new Software();
	
	@Test
	public void test() {
		String result = obj.concatinate("Ivan", "Senda");
		assertEquals("Ivan Senda", result);
		
	}
	
	@Test
	public void myTest() {
		int myres = obj.multiply(2, 2, 3);
		assertEquals(12, myres);
	}
	
	@Test
	public void mySquare() {
		int ress = obj.square(4);
		assertEquals(16, ress);
	}
	
	@Test
	public void myWord() {
		int sess = obb.count("Kakumirizi");
		assertEquals(2, sess);
	}
	
	@Test
	public void tests() {
		boolean myres = obj.itsHot();
		assertEquals(true, myres);
	}
	
}
