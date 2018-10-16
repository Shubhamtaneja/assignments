import java.util.*; 
import java.lang.*; 
import java.io.*; 


class SortComparator
{ 
	int age; 
	String name; 

	
	public SortComparator(int age, String name) 
	{ 
		this.age = age; 
		this.name = name; 
	} 

	public String toString() 
	{ 
		return this.age + " " + this.name + " "; 
	} 
} 

class Sortbyage implements Comparator<SortComparator> 
{ 
	
	public int compare(SortComparator a, SortComparator b) 
	{ 
		return a.age - b.age; 
	} 
} 


class Main  
{ 
	public static void main (String[] args) 
	{ 
		ArrayList<SortComparator> ar = new ArrayList<SortComparator>(); 
		ar.add(new SortComparator(1, "shub")); 
		ar.add(new SortComparator(8, "mandy")); 
		ar.add(new SortComparator(5, "anu")); 

		System.out.println("Unsorted"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 

		Collections.sort(ar, new Sortbyage()); 

		System.out.println("\nSorted by age"); 
		for (int i=0; i<ar.size(); i++) 
			System.out.println(ar.get(i)); 
	} 
} 
