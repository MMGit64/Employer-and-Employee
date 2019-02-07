import java.util.*;
public class EmployeeName implements Comparator<Employee>{
	
	public int compare(Employee employee1, Employee employee2) {
		return employee1.getName().compareTo(employee2.getName());
	}
	
	public static void main(String[] args) {
		
		List<Employee> listEmp2 = new ArrayList<>();
		
		listEmp2.add(new Employee("Yuki", 29, 100004, "Female", "East Asian"));
		listEmp2.add(new Employee("Esteban", 29, 100004, "Male", "Hispanic"));
		listEmp2.add(new Employee("Daniel", 29, 100004, "Male", "White"));
		listEmp2.add(new Employee("Olivia", 29, 100004, "Female", "Mixed Black"));
		
		System.out.println("Before the list is sorted:" + listEmp2);
		
		Collections.sort(listEmp2, new EmployeeName());
		
		System.out.println("After the list is sorted:" + listEmp2);
	
	}

}
