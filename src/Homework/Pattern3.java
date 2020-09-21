package Homework;

import java.util.Scanner;

public class Pattern3 
{
	public void disp(int a) {
		int num=1;
		int c=1;
			while(a>0) {
			int b=num*1;
			 c=b*c;
			num++;
			a--;
			}
			System.out.println(c);
		
		
	}

	
}


