package org.sample;

public class Maxoccuranc {
	
	public static void main(String[] args) {
		
//	
//	String s = "abc";
//	String s1 = "efg";
//	
//	s=s+s1;
//	s1= s.substring(0, s.length()-s1.length());
//	System.out.println(s);
//	System.out.println(s1);
//	
//	s= s.substring(s1.length());
//	System.out.println(s);
//	
		
		
		String s = "Kasthoori";
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (output.indexOf(c)==-1) {
				output = output+c;
				
				
			}
			System.out.println(output);
			}
		

//           int count = 0;
//			for(int i=2; i<=100; i++) {
//			if(i%2==0) {
//				count++;
//				System.out.println(i);
//			}
//				
//			}
//			System.out.println(count);
//		
//			
			
		}
		
		
				
	
	}
	
	
	
	
	
	
	
	
	


