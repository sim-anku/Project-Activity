package com.ltts.movieproject.model;

public class Movie {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		private int Movieid;
		private String Moviename;
		private String cast1;
		private String cast2;
		private String Releaseddate;
		private String Language;
		private int Length;
		private String Movietype;
		private int Productionid;
		
		public Movie() {
			super();
		}
		public Movie(int Movieid, String Moviename, String cast1, String cast2, String Releaseddate,String Language,int Length,String Movietype,int Productionid) 
		{
			super();
			this.Movieid= Movieid;
			this.Moviename = Moviename;
			this.cast1 = cast1;
			this.cast2 = cast2;
			this.Releaseddate = Releaseddate;
			this.Language=Language;
			this.Length=Length;
			this.Movietype=Movietype;
			this.Productionid=Productionid;
		}
		public int getMovieid() {
			return Movieid;
		}
		public void setMovieid(int movieid) {
			Movieid = movieid;
		}
		public String getMoviename() {
			return Moviename;
		}
		public void setMoviename(String moviename) {
			Moviename = moviename;
		}
		public String getCast1() {
			return cast1;
		}
		public void setCast1(String cast1) {
			this.cast1 = cast1;
		}
		public String getCast2() {
			return cast2;
		}
		public void setCast2(String cast2) {
			this.cast2 = cast2;
		}
		public String getReleaseddate() {
			return Releaseddate;
		}
		public void setReleaseddate(String releaseddate) {
			Releaseddate = releaseddate;
		}
		public String getLanguage() {
			return Language;
		}
		public void setLanguage(String language) {
			Language = language;
		}
		public int getLength() {
			return Length;
		}
		public void setLength(int length) {
			Length = length;
		}
		public String getMovietype() {
			return Movietype;
		}
		public void setMovietype(String movietype) {
			Movietype = movietype;
		}
		public int getProductionid() {
			return Productionid;
		}
		public void setProductionid(int productionid) {
			Productionid = productionid;
		}
		
		@Override

		public String toString() {

			return "Movie [Movieid=" + Movieid + ", Moviename=" + Moviename +", cast1="+cast1+",cast2="+cast2+",Releaseddate="+Releaseddate+",Language="+Language+",Length="+Length+",Movietype="+Movietype+",Productionid="+Productionid+"]";

		}

	}


