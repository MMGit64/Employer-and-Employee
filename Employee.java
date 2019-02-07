import java.util.*;

public class Employee {
	private String name; 
	private int id = 0;
	private int age; 
	
	public Employee(String emp_name, int emp_age, int emp_id){
		
		name = emp_name; 
		age = emp_age;
		id = emp_id;
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
	
	//public void setFirstName(String fn){
		//name = fn;
	//}
	
	public String toString(){
		return String.format("(%s, %d, %d)", name, age, id);
	}
}	
	

	
	

