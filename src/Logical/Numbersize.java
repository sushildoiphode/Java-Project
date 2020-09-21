package Logical;

public class Numbersize {
	public static void main(String[] args)
	{
			int[] str= {88888,666,7777};
			
			 
			for(int i=0;i<3;i++)
			{ 
				int count=0;
				int num=str[i];
				while (num>0)
				{
				  int digit=num%10;
			
				 	num=num/10;
					count++;
				}
					System.out.println(count);
			}
	}
}
				







