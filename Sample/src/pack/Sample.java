package pack ;

import java.sql.*;

class Sample {
	public static void main (String [] args ) throws Exception
	{
	Another a = new Another ();	
	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	}
}

class Another

{
	
	public Another()
	{
		System.out.println("inside constructor block");	
	}
	
	 {
			System.out.println("inside instance block");
		}
	
	static {
		System.out.println("inside static");
	}
	
	
}