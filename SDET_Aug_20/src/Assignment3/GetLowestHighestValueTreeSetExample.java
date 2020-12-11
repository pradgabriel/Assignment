package Assignment3;


import java.util.TreeSet;
 
public class GetLowestHighestValueTreeSetExample {
 
  public static void main(String[] args) {
 
    //create TreeSet object
    TreeSet tSet = new TreeSet();
   
    //add elements to TreeSet
    tSet.add("1");
    tSet.add("3");
    tSet.add("2");
    tSet.add("5");
    tSet.add("4");
   
    /*
      To get the lowest value currently stored in Java TreeSet use,
      Object first() method of TreeSet class.
     
      This method returns the first or lowest value currently stored in the
      TreeSet object.     
    */
   
    System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());
   
    /*
      To get the highest value currently stored in Java TreeSet use,
      Object last() method of TreeSet class.
     
      This method returns the last or highest value currently stored in the
      TreeSet object.
    */
   
    System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());
 
  }
}