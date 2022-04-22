package com.ltts.playerproj.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class player {
	@Id
	private int playernumber;
	private String playernname;
	private int runs;
	private String Skill;
	private int teamno;
	public player() {
		super();
		// TODO Auto-generated constructor stub
	}
	public player(int playernumber, String playernname, int runs, String skill, int teamno) {
		super();
		this.playernumber = playernumber;
		this.playernname = playernname;
		this.runs = runs;
		this.Skill = skill;
		this.teamno = teamno;
	}
	public int getPlayernumber() {
		return playernumber;
	}
	public void setPlayernumber(int playernumber) {
		this.playernumber = playernumber;
	}
	public String getPlayernname() {
		return playernname;
	}
	public void setPlayernname(String playernname) {
		this.playernname = playernname;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public String getSkill() {
		return Skill;
	}
	public void setSkill(String skill) {
		Skill = skill;
	}
	public int getTeamno() {
		return teamno;
	}
	public void setTeamno(int teamno) {
		this.teamno = teamno;
	}

	@Override
	public String toString() {
		return "player [playernumber=" + playernumber + ", playernname=" + playernname + ", runs=" + runs + ", Skill="
				+ Skill + ", teamno=" + teamno +"]";
	}
	
}