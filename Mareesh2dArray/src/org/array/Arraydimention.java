package org.array;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Arraydimention {
	public static void main(String[] args) {
		List<String>m1=new ArrayList<String>();
		m1.add("raj");
		m1.add("muthu@gmail.com");
		m1.add("muthu@123");
		String string = m1.get(2);
		System.out.println(string);
		Map<String,String>mp=new LinkedHashMap<String,String>();
		mp.put("name", "Raja");
		mp.put("email", "Raj@gmail.com");
		mp.put("password","ravi123");
		String string2 = mp.get("name");
		System.out.println(string2);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
