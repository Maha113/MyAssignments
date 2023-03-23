package week3.day1assignments;

public class Students {

	public int getStudentInfo(int id) {
		System.out.println("Passing only Int as arguments : " + id);
		return id;
	}
	
	public void  getStudentInfo(int id, String name) {
			System.out.println("Passing Int & String as argument : " + id);
			//return id;
	}
	
	public void getStudentInfo(String email, double phone) {
		System.out.println("Passing String  & Int as argument : " + "Email : " + email +" " + "Phone " + phone);
		
}
	public static void main(String[] args) {
		Students stud = new Students();
		stud.getStudentInfo(128929);
		stud.getStudentInfo(10001, "Raj");
		stud.getStudentInfo("Raj@gmail.com", 9876543210d);
	}
	 
}
