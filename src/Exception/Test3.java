package Exception;

import java.sql.SQLException;
import java.text.NumberFormat;

class Test4{
	  public String m1()throws SQLException{
	System.out.println("Sushil");
		return "Sushildoiphode";
	}
}

public class Test3 extends Test4   {
		public String m1() throws NumberFormatException{
	
			return "Sushil";
		}
		 public static void main(String[] args) throws SQLException {
		 Test4 t=new Test4();
		 t.m1();
		
	}
}

