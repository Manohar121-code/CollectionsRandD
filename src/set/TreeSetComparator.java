package set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator {
	public static void main(String[] args) 
	{ 

		// Creating an empty TreeSet 
		TreeSet<Integer> tree_set = new TreeSet<Integer>(); 

		// Adding elemetns to the set 
		tree_set.add(20); 
		tree_set.add(24); 
		tree_set.add(35); 
		tree_set.add(30); 
		tree_set.add(45); 
		tree_set.add(50); 

	System.out.println("Tree Set values are: "+ tree_set); 

	// Creating a comparator 
	Comparator comp = tree_set.comparator(); 
		
	// Displaying the comparator values 
	System.out.println("Since the Comparator value is: "+ comp); 
	System.out.println("it follows natural ordering"); 
} 
} 
