package Assignment2;

public class Assign4Convert {

	public static void main(String[] args) {
		char ch[];
		String m = "MAT";
		System.out.println(m);
		
		ch = m.toCharArray();
		for (char output: ch) {
			System.out.println(output);
			}
		
		char [] ch1 = new char [] {'a','b'};
		String conv = ch1.toString();
		System.out.println(conv);
	}
	
	
}