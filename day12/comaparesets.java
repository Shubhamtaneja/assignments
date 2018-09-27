import java.util.*;
class Comparesets {
	public static void main(String args[]) {
		Set<String> s1=new HashSet<String>();
		s1.add("monday");
		s1.add("tuesday");
		s1.add("wednesday");
		s1.add("thrusday");
		Set<String> s2=new HashSet<String>();
		s2.add("monday");
		s2.add("wednesday");
		s2.add("friday");
		s1.retainAll(s2);
		System.out.println("common elements are\n"+s1);
	}
}