package com.bridgelabz.functionalprograms;

public class WindChill {

	public static void main(String[] args) {
		
		int v=5, t=34;
		
		double effectiveTemperature;
		
		effectiveTemperature = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v,0.16);
		
		System.out.println("Effective Temperature: "+effectiveTemperature);

	}

}
