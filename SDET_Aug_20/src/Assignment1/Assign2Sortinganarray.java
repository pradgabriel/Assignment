package Assignment1;

public class Assign2Sortinganarray {

	public static void main(String[] args) {
	
		 {
				// TODO Auto-generated method stub
				 String str[] = {"Samuel","Jacob","Ken","Voilet","Allan"};
				 String temp;
				 System.out.println("Strings stored in sequence :");
				 for (int j=0;j<str.length;j++) 
				 {
					 for(int i=j+1;i<str.length;i++) 
					 {
				 		 	if (str[i].compareTo(str[j])<0) 
				 		 	{
				 		 		temp=str[j];
				 		 		str[j]=str[i];
				 		 		str[i]=temp;
				 		 	}
				 
					 }
					 System.out.println(str[j]);
				}
			}

	}

}
