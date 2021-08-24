package com.bridgelabz.functionalprograms;

public class Distance {

	public static void main(String[] args) {
		
		int x=5,y=5;
		
		double distance = Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));
		
		System.out.println("Eucledian Distance of ("+x+","+y+") from (0,0) = "+distance+" units");

	}

}
