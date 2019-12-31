package com.junit.tests;


public class Testing {
	
	public static void main(String[] args) {
		Beginners obj = new Beginners();
		String name = obj.concatinate("Magari", "Godfrey");
		System.out.println(name);
		System.out.println(obj.concatinate("Aidah", "Nassali"));
		System.out.println(obj.multiply(4, 3, 2));
	}
	
}
