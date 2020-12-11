package Assignment1;

//Factorial of a number

import java.util.Scanner;

public class Assign1Factorial {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("Enter a number: ");
		num = s.nextInt();
	
		int fa = num;
		int i = num-1;
		//System.out.println("initial value of i:" +i);
		while (i>=1)
		{
			fa = fa*i;
			i--;
			
		}
		
		System.out.println("The factorial is:" +fa);
		
	}

}
