package project1;
public class Employee {
	String name;
	String designation;
	int salary;
	int empId;

	void displayInfo() {
		System.out.println("Employee name is "+ name +"."+ " Employee Designation is "+ designation+"."+" Employee salary is "+salary+"."+" EmpID is "+empId+".");
		
	}
}

class Main{
	public static void main(String[] args) {
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		Employee e4=new Employee();
		 e1.name="Rani";
		 e1.designation="Business Analyst";
		 e1.salary= 2000;
		 e1.empId=101;
		 
		 e2.name="Raghav";
		 e2.designation="SDE";
		 e2.salary= 3000;
		 e2.empId=102;
		 
		 e3.name="parineeti";
		 e3.designation="sr. Developer";
		 e3.salary= 7000;
		 e3.empId=103;
		 
		 e4.name="Reena";
		 e4.designation="Business Analyst";
		 e4.salary= 2000;
		 e4.empId=104;
		 
		 e1.displayInfo();
		 e2.displayInfo();
		 e3.displayInfo();
		 e4.displayInfo();
		
	}
}