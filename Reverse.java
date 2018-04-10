/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Reverse {

	public static String reverseString(String str) {  

	  StringBuilder sb=new StringBuilder(str);  

	    sb.reverse();  

	    return sb.toString();  


	   

	}

	

	public static void main(String[] args) {  


		Scanner keyboard = new Scanner(System.in);    

	    System.out.print("Enter an input to reverse! ");

	    String input = keyboard.nextLine();

	    System.out.println(Reverse.reverseString(input));

	}


}

