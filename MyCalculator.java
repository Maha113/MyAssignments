package week3.day1;

public class MyCalculator {
   public static void main(String[] args) {
	  Calculator myCalc= new Calculator();
	  myCalc.sub();
	  myCalc.mul(60, 10);
	  myCalc.mul("Result ", 10, 10.2f, 234.230);
}
}
