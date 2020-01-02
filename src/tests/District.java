package tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class District {
	
	public static void main(String[] args) {
		Farmer obj = new Farmer("Kafeero", "Central", 30, "Peasant Farmer");
		
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass().getName());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your age:");
		try {
			Integer.parseInt(br.readLine());
		}
		catch (NumberFormatException | IOException e) {
			
			System.err.println("Error");
		}
		
		finally {
			System.out.println("Congratualation");
		}
	}
	
}
