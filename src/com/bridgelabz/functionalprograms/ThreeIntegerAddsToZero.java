package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class ThreeIntegerAddsToZero {

	public static void main(String args[]) {
		
		int numberOfTerms, i, j, k;
		int arr[] = new int[10];
		
		Scanner scan = new Scanner(System.in);
		   
        System.out.print("Enter the number of terms: ");
        numberOfTerms = scan.nextInt();
        
        System.out.println("Enter " +numberOfTerms+ " Array Elements : ");
        for(i=0; i<numberOfTerms; i++) {
            arr[i] = scan.nextInt();
        }
        
        for(i=0; i<numberOfTerms; i++) {
        	for(j=0; j<numberOfTerms; j++) {
        		for(k=0; k<numberOfTerms; k++) {
        			if ((arr[i]+arr[j]+arr[k])==0) {
        				System.out.println(arr[i]+"+ "+arr[j]+"+ "+arr[k]+"=0");
        			}
        		}
        	}
        }
        
	
	}
	
}
