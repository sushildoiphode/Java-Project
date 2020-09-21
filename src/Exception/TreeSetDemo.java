package Exception;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		TreeSet t=new TreeSet();
		Student1 Sushil=new Student1("Sushil",97.8f,5);
		Student1 Deepak=new Student1("Deepak",82.6f,3);
		Student1 Vishal=new Student1("Vishal",87.3f,4);
		Student1 Ram=new Student1("Ram",91.9f,7);
		
		t.add(Sushil);
		t.add(Deepak);
		t.add(Vishal);
		t.add(Ram);
		
		Iterator<Student1> itr=t.iterator();
		System.out.println("Sorted Set by marks ");
		while(itr.hasNext()){
			System.out.println(itr.next().marks);
		}
	}	
}
	
