package week3.day2assignments;

public class Automation extends MultipleLanguage{
	@Override
	public void ruby() 
	{
		System.out.println("Inside Automation class - Implemented MultipleLanguage Abstract class method Ruby()");
	}
    		
	public static void main(String[] args) {
		Automation auto = new Automation();
		auto.java();
		auto.selenium();
		auto.python();
		auto.ruby();
		
	}
   
}
