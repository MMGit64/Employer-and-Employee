import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeAge implements Comparator<Employee>{
		
	public int compare(Employee employee1, Employee employee2){
			
		return employee1.getAge() - employee2.getAge();
	}
	
	public static void main(String[] args){
		
		List<Employee> listEmp = new ArrayList<Employee>();
		
		listEmp.add(new Employee("Tom", 25, 100000, 'Male', 'White'));
		listEmp.add(new Employee("Jane", 23,100001, 'Female', 'White')); 
		listEmp.add(new Employee("Alex", 36, 100005, 'Male', 'Black'));
		listEmp.add(new Employee("Mahalia", 32, 100003, 'Female', 'Asian'));
		listEmp.add(new Employee("Ahmed", 30, 100006, 'Male', 'Arab'));
		listEmpl.add(new Employee("Satyajit", 28, 100004, 'Male', 'Indian'));
		
		System.out.println("Beforesorting:" + listEmp);
		
		Collections.sort(listEmp, new EmployeeAge());
		
		System.out.println("After sorting:" + listEmp);
		
	}

}
