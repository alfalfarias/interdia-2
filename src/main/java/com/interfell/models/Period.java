package com.interfell.models;

public class Period {
	public int hours;
	public int minutes;
	public int seconds;
	
	public Period() {
		this.hours = 0;
		this.minutes = 0;
		this.seconds = 0;
	}
	
	public Period(int hours, int minutes, int seconds) {
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
	}
	
	public String toString() {
		return this.hours + ":" + this.minutes + ":" + this.seconds;
	}
	
	public void addHours(int hours) {
		this.hours += hours;
	}
}
