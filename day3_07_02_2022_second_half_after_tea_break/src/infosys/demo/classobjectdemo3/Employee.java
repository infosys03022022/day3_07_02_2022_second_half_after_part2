package infosys.demo.classobjectdemo3;

// empId, name, designation, department and basic
// are now not local variables they are 
// member variables of class Employee
// We have intialised the members at the place
// of declaration which means we have done
// the declaration and initialisation in a single
// step
public class Employee {
	 int empId=1;
	 String name="Ravi";
	 String designation="Manager";
	 String department="Sales";
	 int basic=12000;
	
	/* If we want to access a non static 
	 * member from static method like main, 
	 * we need to create an object of the class 
	 * Employee and with the object we can
	 * access the non static members like empId,name,
	 * designation, department and basic
	 */
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		System.out.println(emp.empId);
		System.out.println(emp.name);
        System.out.println(emp.designation);
        System.out.println(emp.department);
	    System.out.println(emp.basic);
	}

}
