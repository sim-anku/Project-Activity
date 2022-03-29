package demoinsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.*;
public class DemoInsert {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie id");
		int Movieid=sc.nextInt();
		System.out.println("Enter Movie name");
		String Moviename=sc.next();
		System.out.println("Enter actor name");
		String cast1=sc.next();
		System.out.println("Enter actress name");
		String cast2=sc.next();
		System.out.println("Enter Date");
		String Releaseddate=sc.next();
		System.out.println("Enter the language");
		String Language=sc.next();
		System.out.println("Enter the length");
		int Length=sc.nextInt();
		System.out.println("Enter Movie type");
		String Movietype=sc.next();
		System.out.println("Enter ProductionId");
		int Productionid=sc.nextInt();
		//Other code
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","0404@Birthday");
		Statement s=c.createStatement();
		s.execute("insert into movie values("+Movieid+",'"+Moviename+"','"+cast1+"','"+cast2+"',"+Releaseddate+",'"+Language+"',"+Length+",'"+Movietype+"',"+Productionid+")");
		System.out.println("Inserted successfully..");
		c.close();
		}

}
