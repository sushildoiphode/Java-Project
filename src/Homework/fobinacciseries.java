import java.util.Scanner;
public class Fobinnacci {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. ");
		int d=sc.nextInt();
		
		int a=0;
		int b=1;
		 System.out.print(a+" "+b);
		 int num=0;
		while(num<d-2) 
		{
		 int c=a+b;
		 System.out.print(" "+c);
		a=b;
		b=c;
		num++;
		}
	}

}

