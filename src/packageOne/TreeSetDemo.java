package packageOne;

import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetDemo {
	 public static void main(String[] args) {
		Student Sonal=new Student("Sonal",6000);
		Student Ramesh=new Student("Ramesh",5000);
		Student Radhika=new Student("Radhika",10000);
		Student Raju=new Student("Raju",1000);
		
		 TreeSet t=new TreeSet(new Student(null, 0));
		 t.add(Sonal);
		t.add(Radhika);
		t.add(Ramesh);	
		t.add(Raju);
		
		Iterator<Student> itr=t.iterator();
		while(itr.hasNext()) {
			Student s=(Student) itr.next();
			System.out.println(s.name+" "+ s.Salary);
		}
		
		
	}
}
