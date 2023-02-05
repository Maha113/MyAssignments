/*Home Assignment 2: Print if the given number is prime
Goal: To understand the problem solving, looping and conditional statement
a) Create a class by name: IsPrime
b) Create a main method using shortcut
c) Write a logic to find if the given number is prime or not
d) Print if it is prime or not
Hint  Iterate through all numbers from 2 to n-1 (input) and 
for every number check if it divides n (input). 
If we find any number that divides, print prime.
If nothing divides, then print non-prime
*/


package week1.day2;

public class IsPrime {
	
	public static void main(String[] args) {
		int input = 103;
		boolean notPrimeFlag = false;
		for (int i = 2; i<=(input-1); i++)
		{
			if((input%i) == 0)
			{
			  notPrimeFlag = true;
			}
		}
		if (notPrimeFlag == false)
		 {
			 System.out.println("Input " + input + " is prime");
		 }
		 else
		 {
			 System.out.println("Input " + input + " is not prime");
		 }

		}
	
		
	}
