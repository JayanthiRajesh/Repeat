package org.repeat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Word_Prog {
	public static void main(String[] args) {
		
	Map<String,Integer> m = new HashMap<String,Integer>();
	String s="jayanthi is a good girl";
	String[] sp= s.split("");
	for (String st : sp) {
		if(m.containsKey(st))
		{
		Integer in = m.get(st);
		  m.put(st,in+1);
		}
		else
		{
			m.put(st,1);
		}
		
		System.out.println(st);
		
	}
	
	 Set<Entry<String, Integer>> se = m.entrySet();
		
	 for (Entry<String, Integer> entry : se) {
		 
		System.out.println(entry);
	}
	
		
	}

}
