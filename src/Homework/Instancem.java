package Homework;

public class Instancem {
	int []x= {1,2,30,4,5,66,775,8,9};
	
	void disp(int a) {
		int b=2;
		for(int i=0;i<x.length;i++)
		{
			if (a==x[i]){
				b--;
			}
		}
			if(b==1)		
		{
			System.out.println("Number is present in Array");
			
		}else
		{
			System.out.println("Number is not present in Array");
		}
		
	}
}



