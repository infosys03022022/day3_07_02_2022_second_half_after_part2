package infosys.demo.classandobjectdemo2;

// empId, name, designation, department and basic
// are now not local variables they are 
// member variables of class Employee
public class Employee {
	int empId=1;
	String name="Ravi";
	String designation="Manager";
	String department="Sales";
	int basic=12000;
	
	// Compilation error because , we are
	// trying to access non static member from
	// static main function
	
	public static void main(String[] args) {
		
		System.out.println(empId);
		System.out.println(name);
        System.out.println(designation);
        System.out.println(department);
	    System.out.println(basic);
	}

}
