package com.interfell.requests;

public class TimeRequest {
	public String dato1;
	public int dato2;

	public String toString() {
		return "\n" +
				"dato1: " + this.dato1 + 
				"\n" + 
				"dato2: " + this.dato2;
	}
	
	public int getHours() {
		String data = this.dato1.substring(0, 2);
		return Integer.parseInt(data);
	}
	
	public int getMinutes() {
		String data = this.dato1.substring(3, 5);
		return Integer.parseInt(data);
	}
	
	public int getSeconds() {
		String data = this.dato1.substring(6, 8);
		return Integer.parseInt(data);
	}
}
