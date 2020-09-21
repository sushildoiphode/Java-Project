
public class NumberInterchange{
	public static void main(String[] args) {
		int[][] c= {{2,3,4,5},{6,7,8,9}};
		for(int i=0;i<c.length-1;i++) {
			for(int j=0;j<=c[i].length-1;j++) {
			int temp=c[0][j];
				c[0][j]=c[1][c[i].length-1-j];
				c[1][c[i].length-1-j]=temp;
			}
			
		}
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<=c[i].length-1;j++) {
				System.out.print(c[i][j]);
			}
		}
			
	}

}
