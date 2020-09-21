package StringAssignment;

public class pattrn2 {
	public static void main(String[] args)
	{
		int num=1;
		for (int i = 1; i < 20; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
			}
				System.out.println();
				num=num+3;
				if (num%2==1) {
					num=num-4;
				}
		}
	}
}

