package skillMatrix;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter Employee Count:");
		 int size=scanner.nextInt();
	        Employee[] employees = new Employee[size];

	        for (int i = 0; i < size; i++) {
	            int id = scanner.nextInt();
	            scanner.nextLine(); 
	            System.out.println("Enter a Employee Name:");
	            String name = scanner.nextLine();
	            System.out.println("Enter a Branch");
	            String branch = scanner.nextLine();
	            System.out.println("Enter a Rating:");
	            double rating = scanner.nextDouble();
	            System.out.println("Is Employee using company transport?");
	            boolean transport = scanner.nextBoolean();
	            scanner.nextLine();  
	            employees[i] = new Employee(id, name, branch, rating, transport);
	        }
	        System.out.println("Entera Branch:");
	        String branch=scanner.nextLine();
	        int count = findCountOfEmployeesUsingCompTransport(employees, branch);
	        if (count > 0) {
	            System.out.println("The number of Employees using company transport is: "+count);
	        } else {
	            System.out.println("No Employees using company transport");
	        }
	        
	        
	        Employee secondHighestRatingEmployee = findEmployeeWithSecondHighestRating(employees);
	        if (secondHighestRatingEmployee != null) {
	            System.out.println(secondHighestRatingEmployee.getEmployeeId());
	            System.out.println(secondHighestRatingEmployee.getName());
	        } else {
	            System.out.println("All Employees using company transport");
	        }
	        
	}
	public static int findCountOfEmployeesUsingCompTransport(Employee[] employees, String branch) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getBranch().equals(branch) && employee.isCompanyTransport()) {
                count++;
            }
        }
        return count;
    }
	
	public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
	    Employee highestEmployee = null;
	    Employee secondHighestEmployee = null;

	    for (Employee employee : employees) {
	        if (!employee.isCompanyTransport()) {
	            if (highestEmployee == null || employee.getRating() > highestEmployee.getRating()) {
	                secondHighestEmployee = highestEmployee;
	                highestEmployee = employee;
	            } else if (secondHighestEmployee == null || employee.getRating() > secondHighestEmployee.getRating()) {
	                secondHighestEmployee = employee;
	            }
	        }
	    }

	    return secondHighestEmployee;
	}

}
