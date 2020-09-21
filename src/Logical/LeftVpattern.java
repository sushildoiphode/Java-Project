package Logical;

public class LeftVpattern {
	public static void main(String[] args)
	{
		for(int i=0;i<4;i++)
		{
			for(int j=i;j==i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		
			for(int k=0;k<=i;k++) {
				if(i<3) {
				System.out.print(" ");
				}
			}
		}
 

		for(int i=1;i<4;i++)
		{
			for(int j=3;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i;k==i;k++) {
				System.out.print("*");
			}	
			System.out.println();
		}
	}

}
