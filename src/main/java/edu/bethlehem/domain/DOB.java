package edu.bethlehem.domain;

public class DOB {
	private int year;
	private int day;
	private int month;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public DOB(int year, int day, int month) {
		super();
		this.year = year;
		this.day = day;
		this.month = month;
	}
}
