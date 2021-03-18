package assignment;

public class Student extends Person{
	int rollNo;
	String dept;
	
	Student(String name, char gender, String state){
		super(name, gender, state);
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
