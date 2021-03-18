package assignment;

// Testing Code
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		College Amity = new College("Amity", "Gwalior");
		
		Faculty f1 = new Faculty("Dr. Rajeev Goyal", 'M', "MP","PhD",5.5);
		Faculty HOI = new Faculty("Dr. MP Kaushik", 'M', "MP", "PhD",10);
		Department d1 = new Department("ASET",300,HOI);
		
		Student s1 = new Student("Ayush Jain", 'M', "MP");
		Student s2 = new Student("Anirudh K", 'M', "MP");
		Student s3 = new Student("Aayushi Chauhan", 'F', "Delhi");
		Student s4 = new Student("Sahil Jain", 'M', "MP");
		
		d1.addStudent(s1);
		d1.addStudent(s2);
		d1.addStudent(s3);
		
		System.out.println("No. of departments after adding " + d1.dname + " = " + Amity.addDepartmentUsingObject(d1));
		System.out.println("No. of departments after adding ABS = " + Amity.addDepartment("ABS", 200, f1));
		
		System.out.println("No of students in department " + d1.dname + " from MP is : " + d1.getStudentCountFromState("MP"));
		
		if(d1.upgradeFaculty("PhD", f1)) {
			System.out.println(f1.name + " is the new Faculty inCharge of " + d1.dname);
		}else {
			System.out.println("Faculty inCharge has not been updated");
		}
		
		System.out.println("Departments in Amity University:");
		for(var dept: Amity.cDepts) {
			System.out.println(dept.dname);
		}
		
		System.out.println("Students in ASET department are : ");
		System.out.println("Roll No. Name\t\t Department\t\t Gender");
		for(var stud: d1.dStudent) {
			System.out.println(stud.rollNo + "\t" + stud.name + "\t\t" + stud.dept + "\t\t" + stud.gender);
		}
		
		Amity.cDepts.get(1).addStudent(s4);  // to access ABS department which was added into Amity at line 24
		
		System.out.println("Students in ABS department are : ");
		System.out.println("Roll No. Name\t\t Department\t\t Gender");
		for(var stud: Amity.cDepts.get(1).dStudent) {
			System.out.println(stud.rollNo + "\t" + stud.name + "\t\t" + stud.dept + "\t\t" + stud.gender);
		}
	}

}
