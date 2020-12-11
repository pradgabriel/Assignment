package Assignment1;
//first 10 fibonacciseries

import java.util.Scanner;

public class Assign2fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a = 0;
		int b = 1;
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 1; i<= 10; i++) {
	int fib = a+b;
	System.out.println(fib);	
	b=a;
	a=fib;		
			
		}
		
	
	}

}
