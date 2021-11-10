package org.repeat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Once {
	public static void main(String[] args) {
		
		Map<String,Integer> m= new HashMap<>();
		
		String s= "Chithra Devi Jayanthi";
		
		String[] sp= s.split("");
		
		
		for (String st : sp) {
			
		 if(m.containsKey(st))
		 {
			 Integer i = m.get(st);
			 
			 m.put(st,i+1);
		 }
		 
		 else
		 {
			 
			 m.put(st,1);		 
		 
		}
		
		
		System.out.println(st);
		
		
		}
		 Set<Entry<String, Integer>> set = m.entrySet();
		 
		 for (Entry<String, Integer> string : set) {
			
			 
			 System.out.println(string);
		}
		 
		 
		 
		 		}
		
		
		
	}


