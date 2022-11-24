package com.simplon.java;

import java.util.Scanner;

public class exo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Phrase ? ");
	    String str = sc.nextLine();
	    int count = 0; 
	    
	    for(int i = 0; i < str.length(); i++) {    
            //Checks whether a character is a vowel    
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o') {    
                //Increments the vowel counter    
            	count++;    
            }    
              
        }    
	    
	    System.out.println("Nombre de a, e et o : " + count);

	}

}
