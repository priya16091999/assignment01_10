/*
 Implement Multilevel Inheritance with Method Overriding
 Create a base class Person.Create a subclass Employee that extends Person, and includes the methods work() and
 getSalary().Create another subclass HRManager that extends Employee, overrides the work() method, and adds a new 
 method addEmployee() to simulate adding employees.
 */

package Assignment1_10_24;

public class TestPerson {

	public static void main(String[] args) {
		
	 Person person = new Person("Pratima", 22);
     person.displayInfo();
     person.work();  

     System.out.println("=================");

     Employee employee = new Employee("Sayali", 22, 60000);
     employee.displayInfo();
     employee.work();  
     System.out.println("Salary: " + employee.getSalary());

     System.out.println("==================");

     
     HRManager hrManager = new HRManager("Aditi", 22, 80000);
     hrManager.displayInfo();
     hrManager.work();  
     hrManager.addEmployee(); 
     System.out.println("Salary: " + hrManager.getSalary());
 }
}
