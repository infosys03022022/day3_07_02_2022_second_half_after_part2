package infosys.demo.classandobjectdemo2;

// empId, name, designation, department and basic
// are now not local variables they are 
// member variables of class Employee
public class Employee2 {
	static int empId=1;
	static String name="Ravi";
	static String designation="Manager";
	static String department="Sales";
	static int basic=12000;
	
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
