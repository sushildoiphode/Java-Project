package Homework;

import java.util.Scanner;

public class Array {
	public static void main(String[] args)
	{int x[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.");
		int num=sc.nextInt();
		int temp=num;
		int digit;
		int index=0;
		
				while(num>0) 
		{
			digit=num%10;
			x[index]=digit;
			num=num/10;
			index++;
		}
		for(int i=0;i<x.length;i++) 
		{
			if(x[i]==1)
			{
				System.out.print("One ");
			}
			if(x[i]==2)
			{
				System.out.print("Two ");
			}
			if(x[i]==3)
			{
				System.out.print("Three ");
			}
			if(x[i]==4)
			{
				System.out.print("Four ");
			}
			if(x[i]==5)
			{
				System.out.print("Five ");
			}
			if(x[i]==6)
			{
				System.out.print("Six ");
			}
			if(x[i]==7)
			{
				System.out.print("Seven ");
			}
			if(x[i]==8)
			{
				System.out.print("Eight ");
			}
			if(x[i]==9)
			{
				System.out.print("Nine ");
			}
			if(x[i]==0)
			{
				System.out.print("Zero ");
			}
		
		}

	}
	
}
