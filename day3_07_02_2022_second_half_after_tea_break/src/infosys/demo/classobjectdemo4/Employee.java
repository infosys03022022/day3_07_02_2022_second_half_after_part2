package infosys.demo.classobjectdemo4;

/*
 *   We are not going to initialise the member
 *   variables at the place of declaration 
 *   and we are going to take the help of setData
 *   to store or initialise the member variables
 *    
 */
/* 
 * Why so many methods 
 * We should write highly cohesive code
 * which means at a time a method do a single
 * specific task
 */

public class Employee {
	 int empId;
	 String name;
	 String designation;
	 String department;
	 int basic;
	
	public void setData() {
		empId=1;
		name="Ravi";
		designation="Manager";
		department="Sales";
		basic=12000;
		
	}
	
	public void dispData()
	{
		System.out.println(empId);
		System.out.println(name);
        System.out.println(designation);
        System.out.println(department);
	    System.out.println(basic);
	}
	
	
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.dispData(); // by mistake instead of 
		// calling setData we called dispData 
		// after object creation
		/*
		 * 0
           null
           null
           null
           0
           How we are getting this default values
           for member variables.
           Ans: We have the concept of default
           constructor which is provided during
           the compilation and currently I am not
           writing any constructor from my side
		 */
		emp.setData();
		emp.dispData();
		
	}

}
