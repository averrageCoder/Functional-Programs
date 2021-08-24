package com.bridgelabz.functionalprograms;

public class Quadratic {

	public static void main(String[] args) {
		
		int a=2,b=3,c=1;
		double delta, root1, root2;
		
		//delta = b*b - 4*a*c
		delta = Math.pow(b, 2) - (4*a*c);
		
		//Root 1 of x = (-b + sqrt(delta))/(2*a)
		root1 = (-b + Math.sqrt(delta))/(2*a);
		//Root 2 of x = (-b - sqrt(delta))/(2*a)
		root2 = (-b - Math.sqrt(delta))/(2*a);
		
		System.out.println("Root 1: "+root1);
		System.out.println("Root 2: "+root2);

	}

}
