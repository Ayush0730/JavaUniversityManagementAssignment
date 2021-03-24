package assignment;

import java.util.ArrayList;
import java.util.List;
// Small change
public class College {
	String cName;
	String cCity;
	List<Department> cDepts = new ArrayList<Department>();
	
	College(String name, String city){
		setcName(name);
		setcCity(city);
	}
	
	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcCity() {
		return cCity;
	}

	public void setcCity(String cCity) {
		this.cCity = cCity;
	}

	public int addDepartment(String dname, int cap, Faculty inCharge) {
		Department d = new Department(dname, cap, inCharge);
		this.cDepts.add(d);
		return this.cDepts.size();
	}
	
	public int addDepartmentUsingObject(Department d) {
		this.cDepts.add(d);
		return this.cDepts.size();
	}
}
