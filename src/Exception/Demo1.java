package Exception;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Demo1 {
	public static void main(String[] args)
	{
		SortedSet h=new TreeSet();
		h.push("Sushil");
		h.add("Rajesh");
		h.add("Pratik");
		h.add("Parag");
		h.add("Rajesh");
		h.add("Balu");
		h.add("Shiv");
		h.add("Neeraj");			
		System.out.println(h);
}
}
