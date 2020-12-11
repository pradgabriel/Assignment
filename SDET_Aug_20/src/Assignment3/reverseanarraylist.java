package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class reverseanarraylist {

	public static void main(String[] args) 
    { 
        // Let us create a list of strings 
        List<String>  mylist = new ArrayList<String>(); 
        mylist.add("practice"); 
        mylist.add("code"); 
        mylist.add("quiz"); 
        mylist.add("geeksforgeeks"); 
  
        System.out.println("Original List : " + mylist); 
  
        // Here we are using reverse() method 
        // to reverse the element order of mylist 
        Collections.reverse(mylist); 
  
        System.out.println("Modified List: " + mylist); 
    } 
}
