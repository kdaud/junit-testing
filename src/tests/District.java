package tests;


public class District {
	
	public static void main(String[] args) {
		Farmer obj = new Farmer("Kafeero", "Central", 30, "Peasant Farmer");
		System.out.println(obj.getAge());
		System.out.println("Name: " + obj.getName());
		System.out.println("Central: " + obj.getRegion());
	}
	
}
