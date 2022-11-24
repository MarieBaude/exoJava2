package com.simplon.java;

import java.util.Scanner;

public class exo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Phrase ? ");
	    String text = sc.nextLine();
	    
		String eChanging = text.replace("e", "3");
		String oChanging = eChanging.replace("o", "0");
		
		System.out.println(oChanging);

	}

}
