package com.simplon.java;

import java.util.Scanner;

public class exo2 {
	
	public static String capitalizeWord(String str){  
	    String words[]=str.split("\\s");  
	    String capitalizeWord="";  
	    for(String w:words){  
	        String first=w.substring(0,1);  
	        String afterfirst=w.substring(1);  
	        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
	    }  
	    return capitalizeWord.trim();  
	}  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.print("Phrase ? ");
	    String text = sc.nextLine();
	    String result = capitalizeWord(text);
	    
	    System.out.println(result);

	}

}
