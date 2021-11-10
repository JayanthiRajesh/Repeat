package org.repeat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Prog {
	public static void main(String[] args) {

		Map<String, Integer> m = new HashMap<>();

		String s = "JAyanthi";
		String[] sp = s.split("");
		for (String st : sp) {

			if (m.containsKey(st)) {
				Integer in = m.get(st);
				m.put(st, in+1 );jm,

			}

			else {
				
				
				m.put(st, 1);
			}

		}

		Set<Entry<String, Integer>> es = m.entrySet();
		for (Entry<String, Integer> entry : es) {
			System.out.println(entry);
		}
	}

}
