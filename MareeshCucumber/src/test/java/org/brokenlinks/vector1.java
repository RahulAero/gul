package org.brokenlinks;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class vector1 {
	public static void main(String[] args) {
		Vector<String> v=new Vector<>();
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("d");
		v.add("e");
		System.out.println(v);
		
//		//Enumeration
//		Enumeration<String> elements = v.elements();
//		while(elements.hasMoreElements()) {
//			String string = elements.nextElement();
//			
//			System.out.println(string);
//			
//			
		//Iteration
			
			Iterator<String> iterator = v.iterator();
			while(iterator.hasNext()) {
				String next = iterator.next();
				if(next.equals("e")) {
					iterator.remove();
				}
				}
				
				System.out.println(v);
				
				
				
				
	//List Iterator
				
			ListIterator<String> listIterator = v.listIterator();
				while(listIterator.hasNext())
				{
					String next = listIterator.next();
					if(String.equals("A"))
							{
						listIterator.add("java");
						
							}
					else if(String.equals("B"))
					{
						listIterator.remove();
						
					}
					else if(String.equals("c"))
					{
						listIterator.add("hai");
					}
								
				}
	}
				System.out.println(v);
				
				
				
				
				
				
			}
}
	}
