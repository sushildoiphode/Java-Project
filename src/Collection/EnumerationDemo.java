package Collection;

import java.util.Enumeration;
import java.util.*;

public class EnumerationDemo {
	public static void main(String[] args) {
		Vector v=new Vector();
		Enumeration e=v.elements();
		Iterator s=v.iterator();
		ListIterator a=v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(s.getClass().getName());
		System.out.println(a.getClass().getName());
		
	}

}
