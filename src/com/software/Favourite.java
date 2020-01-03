package com.software;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class Favourite {
	
	private void show() {
		Map<String, String> country = new Hashtable<>();
		country.put("Nairobi", "Kenya");
		country.put("Kampala", "Uganda");
		country.put("Kigali", "Rwanda");
		country.put("Accra", "Ghana");
		country.put("Khartum", "South Sudan");
		country.put("Bujumbura", "Burundi");
		
		Iterable<String> count = country.keySet();
		

		for (String ss : count) {
			System.out.println(ss + " --> " + country.get(ss));
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
