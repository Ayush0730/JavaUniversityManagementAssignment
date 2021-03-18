package assignment;

public class Faculty extends Person{
	String qualification;
	double experience;
	
	Faculty(String name, char gender, String state ,String qual, double exp){
		super(name, gender, state);
		setQualification(qual);
		setExperience(exp);
	}
	
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	
}
