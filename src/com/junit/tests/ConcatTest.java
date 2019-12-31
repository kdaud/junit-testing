package com.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class ConcatTest {
	
	Beginners obj = new Beginners();
	
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
	
}
