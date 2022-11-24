package com.simplon.java;

// exo 4

class Contact {

    private String firstName;
    private String lastName;
    private int age;
    
    Contact(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public void initials () {
    	char a = firstName.charAt(0);
    	char b = lastName.charAt(0);
    	System.out.println(a+b);
    }
    
}
