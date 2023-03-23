package week3.day1assignments;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Inside Desktop Class - Desktop Siza is 21 inch");
	}

	public static void main(String[] args) {
		Desktop desktopObj = new Desktop();
		desktopObj.computerModel();
		desktopObj.desktopSize();
	}
	
}


