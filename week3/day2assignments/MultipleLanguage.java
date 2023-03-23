package week3.day2assignments;

public abstract class MultipleLanguage implements Language, TestTool {
	
	public void python() {System.out.println("Inside MultipleLanguage Abstract Class - Implemented Python() method");}
	
	public abstract void ruby();
	
	
	public void java() {
		// TODO Auto-generated method stub
		{System.out.println("Inside MultipleLanguage Abstract Class - Override Interface Language method Java()");}
	}

	public void selenium() {
		// TODO Auto-generated method stub
		{System.out.println("Inside MultipleLanguage Abstract Clas - Override TestTool Interface  method Selenium()");}
	}

	
	
	
       
}
