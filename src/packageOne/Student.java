package packageOne;

import java.util.Comparator;

public class Student implements Comparator{
	String name;
	int Salary;
	

	Student(String name,int Salary){
	this.name=name;
	this.Salary=Salary;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.Salary<s2.Salary){
			return 0;
		}else if(s1.Salary>s2.Salary) {
				return +1;
			}else {
				return 0;
			}
		}
		
	}
	


