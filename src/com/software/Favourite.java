package com.software;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Favourite {
	
	private void show() {
		Map<String, String> country = new HashMap<>();
		country.put("Nairobi", "Kenya");
		country.put("Kampala", "Uganda");
		country.put("Kigali", "Rwanda");
		country.put("Khartum", "South Sudan");
		for (int i = 0; i < country.size(); i++) {
			System.out.println(i + " -> " + country.get(i));
			
		}
		for (String ss : country.keySet()) {
			System.out.println(ss + " --> ");
		}
	}
	
	public void accessprivate() {
		this.show();
	}
	
	public void run() {
		Random r = new Random();
		for (int i = 0; i <= 15; i++) {
			System.out.print(r.nextInt(20) + " ");
		}
	}
	
	

}
