package assignment;

import java.util.ArrayList;
import java.util.List;

public class Department {
	String dname;
	int dCapacity;
	int roll=1;
	Faculty dFaculty;
	List<Student> dStudent = new ArrayList<Student>();
	Department(String name, int cap, Faculty inCharge){
		this.setDname(name);
		this.setdCapacity(cap);
		this.setdFaculty(inCharge);
	}
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public int getdCapacity() {
		return dCapacity;
	}

	public void setdCapacity(int dCapacity) {
		this.dCapacity = dCapacity;
	}

	public Faculty getdFaculty() {
		return dFaculty;
	}

	public void setdFaculty(Faculty dFaculty) {
		this.dFaculty = dFaculty;
	}
	
	public int addStudent(Student stud) {
		stud.setDept(this.dname);
		stud.setRollNo(roll++);
		this.dStudent.add(stud);
		return this.dStudent.size();
	}
	
	public boolean upgradeFaculty(String qual, Faculty fac) {
		if(fac.qualification.equals(qual)) {
			if(fac.experience > this.dFaculty.experience) {
				this.dFaculty = fac;
				return true;
			}
		}
		return false;
	}
	
	public int getStudentCountFromState(String state) {
		int count = 0;
		for(var x: dStudent) {
			if(x.state.equals(state)) {
				count++;
			}
		}
		return count;
	}
}

