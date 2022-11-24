package com.simplon.java;

import java.util.Scanner;

public class exo7 {
	// voir class BankLine
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Valeur 1 ? ");
	    int value1 = sc.nextInt();
	    
	    Scanner sc2 = new Scanner(System.in);
	    System.out.print("Valeur 2 ? ");
	    int value2 = sc2.nextInt();
	    
	    Scanner sc3 = new Scanner(System.in);
	    System.out.print("Valeur 3 ? ");
	    int value3 = sc3.nextInt();
	    
	    Scanner sc4 = new Scanner(System.in);
	    System.out.print("Valeur 4 ? ");
	    int value4 = sc4.nextInt();
	    
	    Scanner sc5 = new Scanner(System.in);
	    System.out.print("Valeur 5 ? ");
	    int value5 = sc5.nextInt();
	    
	    BankLine a1 = new BankLine(value1, value2, value3, value4, value5);
	    
	    a1.calculateBalance();
	    
	    
	}

}
