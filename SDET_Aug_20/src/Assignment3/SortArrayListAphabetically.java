package Assignment3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayListAphabetically {

	public static void main(String[] args) {
	
		List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");
		 
		//1. Natural order
		List<String> sortedNames = names                          
		                            .stream()
		                            .sorted(Comparator.comparing(String::toString))
		                            .collect(Collectors.toList());  
		 
		System.out.println(sortedNames);
		 
		//2. Reverse order
		List<String> reverseSortedNames = names                   
		                                .stream()
		                                .sorted(Comparator.comparing(String::toString).reversed())
		                                .collect(Collectors.toList());
		 
		System.out.println(reverseSortedNames);
	}

}
