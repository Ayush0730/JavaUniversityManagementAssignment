package assignment;

public class Person {
	String name;
	char gender;
	String state;
	
	Person(){
		
	}
	
	Person(String name, char gender, String state){
		setName(name);
		setGender(gender);
		setState(state);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
}
