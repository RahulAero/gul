package org.robo;

public class Prime {
	 
	static void  CheckingPrimeno() {
		int a=100;
		int b= 0;
		for (int i = 2; i < a; i++) {
			if (a%i == 0) 
			{
				b++;
				break;
				
			}
		}
			if (b==0) {
				System.out.println("Prime no"); 
				
				
			}else {
				System.out.println("Not a prime number"); 
						
			}
			
	}
			public static void main(String[] args) 
			{
				CheckingPrimeno();
				
//			//String CheckingPrimeno = CheckingPrime);
//			//stem.out.println(CheckingPrimeno);
//			
			
		}
		
		
		
		

	}


