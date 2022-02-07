package infosys.demo.classandobject;

// Though we started with class but we 
// have not implemented much the concept of
// Object oriented programming
// Here in Java even main class needs to 
// be within a class. So in this example
// main is within Employee class and
// empId, name, designation , department and basic
// are the local variables of the Employee class


public class Employee {

	public static void main(String[] args) {
		int empId=1;
		String name="Ravi";
		String designation="Manager";
		String department="Sales";
		int basic=12000;
		System.out.println(empId);
		System.out.println(name);
        System.out.println(designation);
        System.out.println(department);
	    System.out.println(basic);
	}

}
