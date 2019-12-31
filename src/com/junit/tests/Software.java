package com.junit.tests;


public class Software {
	
	public int count(String word) {
		int ff = 0;
		for (int j = 0; j < word.length(); j++) {
			if (word.charAt(j) == 'k' || word.charAt(j) == 'K') {
				ff++;
			}
		}
		return ff;
	}
}
