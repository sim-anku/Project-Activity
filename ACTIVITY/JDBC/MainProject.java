package com.ltts.movieproject.main;
import java.util.List;
import java.util.Scanner;
import com.ltts.movieproject.bo.Moviebo;

import com.ltts.movieproject.model.Movie;
public class MainProject {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("1. Insert");

		System.out.println("2. View Movies");

		//System.out.println("3. View Movie by type");

		System.out.println("3. Update Player");

		System.out.println("4. Delete Player");

		Moviebo mo=new Moviebo();

		int n=sc.nextInt();

		switch(n) {

		case 1:

			System.out.println("INSERT Movie INFO");

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

			//Write the DB logic

			Movie m1=new Movie(Movieid,Moviename,cast1,cast2,Releaseddate,Language,Length,Movietype,Productionid);

			boolean b=mo.insertMovie(m1);

			if(b==false) {

				System.out.println("Value inserted...");

			}
			break;

		case 2:

			System.out.println("Movies are");

			List<Movie> li=mo.getAllMovie();

			for(Movie m2:li) {

				System.out.println(m2);

			}

			break;

		case 3:
			Movie m3=new Movie();
			System.out.println("Update Movies");
            boolean bb=mo.updateMovie(m3);
            if(bb==false)
            {
            	System.out.println("Updated");
            }
			//DB Logic3
          

			break;

		case 4:

			System.out.println("Delete Movies");
			Movie m4=new Movie();
            boolean bbb=mo.deleteMovie(m4);
            if(bbb==false)
            {
            	System.out.println("Deleted");
            }

			//DB Logic

			break;

			

		}

		
	}

}
