/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author Sarah
 */
public class Primes {

	 

	 

	  public static void main(String[] args) {

		 

	    int num, count, i;

	    num=1;

	    count=0;

	 

	    while (count < 1000){

	      num=num+1;

	      for (i = 2; i <= num; i++){

	        if (num % i == 0) {

	          break;

	        }

	      }

	      if ( i == num){

	        count = count+1;

	      }

	    }

	    System.out.println("Value of 1000th prime: " + num);

	  }

	}

