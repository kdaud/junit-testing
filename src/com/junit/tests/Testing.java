package com.junit.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Testing {
	
	public static void main(String[] args) throws IOException {
		Beginners obj = new Beginners();
		String name = obj.concatinate("Magari", "Godfrey");
		System.out.println(name);
		System.out.println(obj.concatinate("Aidah", "Nassali"));
		System.out.println(obj.multiply(4, 3, 2));
		System.out.println("--------------------");
		
		System.out.println(count());
		
	}
	
	public static int count() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name");
		String myname = br.readLine();
		int i = 0;
		for (int j = 0; j < myname.length(); j++) {
			i++;
			
		}
		
		return i;
		
	}
	
}
