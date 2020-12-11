package Assignment1;

import java.util.Scanner;

public class Assign6AreaofTriangle {
	

		int a, b, c;
		
		public int area (int a, int b, int c) {
			int area = a*b*c;
			return area;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			int l, m, n; 
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the lenght of side 1: ");
			l = s.nextInt();
			
			System.out.println("Enter the length of side 2: ");
			m = s.nextInt();
			
			System.out.println("Enter the length of side 3: ");
			n = s.nextInt();
			
			Assign6AreaofTriangle ar = new Assign6AreaofTriangle();
			
			System.out.println(ar.area(l, m, n));
			
		}
			
}
