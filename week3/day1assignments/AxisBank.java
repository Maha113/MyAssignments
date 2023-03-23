package week3.day1assignments;

public class AxisBank extends BankInfo {
	
	public void  deposit() {
		System.out.println("Inside Axis Bank :  deposit() method");
	}

	
	public static void main(String[] args) {
		AxisBank axis =  new AxisBank();
		axis.saving();
		axis.fixed();
		axis.deposit();
	}

}
