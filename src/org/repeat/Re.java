package org.repeat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Re {

	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<>();

		String s = "The World is full of cheaters";
		String[] split = s.split("");

		for (String string : split) {

			if (m.containsKey(string)) {
				Integer in = m.get(string);
				m.put(string, in+1);

			}

			else {

				m.put(string, 1);

			}

			System.out.println(string);

		}

		
		
		
	Set<Entry<String, Integer>> entry = m.entrySet();
	
	
	for (Entry<String, Integer> entry2 : entry) {
		
		System.out.println(entry2);
	}
	}
	
	
}