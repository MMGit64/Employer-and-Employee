import java.util.*;

public class Employee {
	private String name; 
	private int id = 0;
	private int age; 
	private String gender;
	private String ethBackground;
	
	public Employee(String emp_name, int emp_age, int emp_id, String emp_gender, String emp_eth_Background){
		
		name = emp_name; 
		age = emp_age;
		id = emp_id;
		gender = emp_gender;
		ethBackground = emp_eth_Background
	}
	
	public int getAge(){
		return age;
	
	}

	public int getId() {
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getGender(){
		return gender;
	}	
	
	public String getEthBackground(){
		return ethBackground;
	}

	
	public String toString(){
		return String.format("(%s, %d, %d)", name, age, id, gender, ethBackground);
	}
}	
	

	
	

