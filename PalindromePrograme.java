package com.java.program.modul1.practice;

import java.util.Scanner;



public class PalindromePrograme {
// it means the spelling is same from front to back / back to front 
// the output is coming in sting format by using [charAt(int ch);]
	
    static String input = "level";
    static String output = ""; 

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		for(int i=0; i<=3; i--)
		
		{
		System.out.println("Enter your input value in the  String");
		String  in = s.next();
		System.out.println("Enter second string ");
		String ou = "";
		System.out.println(ou); 
		
		   for(int j =in.length()-1; j>=0; j--)
		   {
			
			  char t = in.charAt(j);
			  ou =ou+t;
			
		   }
		
	
		System.out.println(ou);
		 if(in.equals(ou))
		 {
			 System.out.println("yes");
		 }
		 else 
		 {
			 System.out.println("No");
		 }
		}
		 
		 s.close();
	/*	for(int i =0; i<input.length(); i++)
		{
		    char out2 = input.charAt(i);
		//    System.out.println(out2);
		    output= output+out2;
		    System.out.println(output);
		    
		}
		System.out.println("My output is "+output);
		System.out.println("My input is "+input); */
	//	boolean  c = input.equals(output);
	//	if(c)
	//	if(input.equals(output)==true)
	//	if(c==true)
		
		
	/*	if(input.equals(output))
		{
			System.out.println("Yes, it's a palindrom");
		}
		else
		{
			System.out.println("No, it's not");
		} */

	}

}
