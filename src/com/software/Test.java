package com.software;


public class Test {
	static {
		System.out.println("My Journey as a Software Engineer");
	}
	
	public static void main(String[] args) {
		Favourite obj = new Favourite();
		System.out.println("---------------------------------");
		obj.run();
		System.out.println("\n++++++++++++++++++++++++++++++++");
		obj.accessprivate();
		System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
		new Mapping() {
			
			@Override
			public void myPhone() {
				System.out.println("HELLO PROGRAMMER");
				
			}
		}.myPhone();
		
	}
	
}
