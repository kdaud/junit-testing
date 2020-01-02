package tests;


public class District {
	
	public static void main(String[] args) {
		Farmer obj = new Farmer("Kafeero", "Central", 30, "Peasant Farmer");
		
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.getClass().getName());
	}
	
}
