package Assignment2;

public class Assign5Number {

		 public static void main(String[] args) {
		      try {
		         new Assign5Number().intParsingMethod();
		      } catch (NumberFormatException e) {
		         System.out.println("We can catch the NumberFormatException");
		      }
		   }
		   public void intParsingMethod() throws NumberFormatException{
		      int x = Integer.parseInt("30k");
		      System.out.println(x);
		   }

	}

	
