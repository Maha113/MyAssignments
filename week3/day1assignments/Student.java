package week3.day1assignments;

public class Student extends Department{
	
	//studentName(),studentDept(),studentId()
	
	public void studentName() {
		System.out.println("Inside Student Class : Student Name - Raj");
		
	}
  public void studentDept() {
	  System.out.println("Inside Student Class : Student Dept - Mechanical");
	  
  }
  
  public void studentId() {
	  System.out.println("Inside Student Class : Student ID - MEC00123");
	  
  }
  
  public static void main(String[] args) {
	Student stu = new Student();
	stu.collegeName();
	stu.collegeCode();
	stu.collegeRank();
	stu.deptName();
	stu.studentName();
	stu.studentDept();
	stu.studentId();
}
}
