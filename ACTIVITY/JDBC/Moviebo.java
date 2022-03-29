package com.ltts.movieproject.bo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ltts.movieproject.model.Movie;
public class Moviebo {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
        public boolean insertMovie(Movie m)throws Exception
        {
        	//DB logic
        	return false;
        }
        public List<Movie> getAllMovie()throws Exception
        {
        	List<Movie> a=new ArrayList<Movie>();
        	//DB logic
        	//class.forName()
        	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","0404@Birthday");
    		PreparedStatement ps=c.prepareStatement("select * from movie");
    		ResultSet rs=ps.executeQuery();
    		while(rs.next())
    		{
    			a.add(new Movie(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8),rs.getInt(9)));
    		}
    		c.close();
        	return a;
        }
         public boolean updateMovie(Movie m)throws Exception
        {
        	 String sql="update Movie set Movieid=? where Moviename=?" ;
        	 Scanner sc=new Scanner(System.in);
        	 int Movieid=sc.nextInt();
        	 System.out.println("Enter movie id");
        	 String Moviename=sc.next();
        	 System.out.println("Enter movie name");
         	try(
         	Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","0404@Birthday");
      		PreparedStatement ps=c.prepareStatement(sql);){
         		ps.setInt(1,214);
         		ps.setString(2, "RRR");
      		ps.executeUpdate();}
         	catch(SQLException e)
         	{
         		e.printStackTrace();
         	}
         	return false;
        }
     	public boolean deleteMovie(Movie m)throws Exception
     	{
     		String sql="delete from movie where Movieid=?";
     	    Scanner sc=new Scanner(System.in);
     	    System.out.println("Enter Movieid");
     	    int  Movieid=sc.nextInt();
     		try (
     				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","0404@Birthday");
     				PreparedStatement psDel = c.prepareStatement(
     			    "DELETE FROM movie WHERE Movieid = ?")
     			) {
     			    psDel.setInt(1, Movieid);

     			    if (psDel.executeUpdate() > 0)
     			        System.out.println("Record deleted successfully.");
     			    else
     			        System.out.println("Record not found.");
     			}
     		 return false;
     	}
      
	}
        
 

