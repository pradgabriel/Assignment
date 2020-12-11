package Assignment2;

public class Assign6ThrowsArithmetic {
	 public static void main(String[] args) {
	      try {
	         new Assign6ThrowsArithmetic().divbyzero();
	      } catch (ArithmeticException e) {
	         System.out.println("We can catch the ArithmeticExcpetion");
	      }
	   }
	   public void divbyzero() throws ArithmeticException{
	      int x = 7/0;
	      System.out.println(x);
	   }
}
