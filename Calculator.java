package week3.day1;

public class Calculator {

	public void sub()
	{
		System.out.println("Inside Sub Without Arguments");
		
	}
	public void  mul(int a, int b) {
		
		System.out.println("Multiplication with Integers "+ a*b);
		
	}
	
public void  mul(String result, int a, float b, double c) {
		
		System.out.println("Multiplication with Integers "+ result + a*b*c);
		
	}
}
