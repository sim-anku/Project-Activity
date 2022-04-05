package com.ltts.movieproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Movie {
@Id
@GeneratedValue
private int movieid;
private String moviename;
private String movietype;
public int getMovieid() {
	return movieid;
}
public void setMovieid(int movieid) {
	this.movieid = movieid;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String moviename) {
	this.moviename = moviename;
}
public String getMovietype() {
	return movietype;
}
public void setMovietype(String movietype) {
	this.movietype = movietype;
}
@Override
public String toString()
{
	return super.toString();
}
public void save() {
	// TODO Auto-generated method stub
	
}
}
