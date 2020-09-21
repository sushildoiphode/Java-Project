package Homework;
import java.util.Scanner;
public class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		int num=1;
		int c=1;
			while(a>0) {
			int b=num*1;
			 c=b*c;
			num++;
			a--;
			}
			System.out.println(c);
		
		/*String s=new String("deepak");
		String s1=new String("deepak");
		
		System.out.print(s==s1);*/
		
			
		}
		
	}

