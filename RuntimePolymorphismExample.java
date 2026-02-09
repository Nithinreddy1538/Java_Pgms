// Superclass: Employee 
class Employee {
	String name = "Unknown";
	void displayDetails() {
	System.out.println("Employee Name: " + name);

	}

}

// Subclass: Manager (inherits Employee) 
class Manager extends Employee {

	  String department = "IT";

	// Overriding the displayDetails() method @Override

	void displayDetails() 
	{ System.out.println("Employee Name: " + name); 
	  System.out.println("Department: " + department);

	}
}


// Main Class

public class RuntimePolymorphismExample 
{ 
public static void main(String[] args) {

// Parent class reference holding child class object (Runtime Polymorphism)

Employee emp = new Manager();

emp.name = "John Smith"; // Assigning name dynamically


// Calls overridden method in Manager class 
	emp.displayDetails();

}

}
