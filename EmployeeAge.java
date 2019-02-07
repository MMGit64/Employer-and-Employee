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
		
		listEmp.add(new Employee("Tom", 25, 100000));
		listEmp.add(new Employee("Jane",23,100001)); 
		listEmp.add(new Employee("Alex",36,100005));
		listEmp.add(new Employee("Sally",32,100003));
		
		System.out.println("Beforesorting:" + listEmp);
		
		Collections.sort(listEmp, new EmployeeAge());
		
		System.out.println("After sorting:" + listEmp);
		
	}

}
