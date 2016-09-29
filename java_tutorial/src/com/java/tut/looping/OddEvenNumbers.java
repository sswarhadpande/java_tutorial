package com.java.tut.looping;

public class OddEvenNumbers {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 100; i++){
			
			if ((i%2 == 1)){
				
				System.out.print(i+ " is odd number. \t");
				
			}else{
				
				System.out.println(i+ " is even number.");
			}
			
		}

	}

}
