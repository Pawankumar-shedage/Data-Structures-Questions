package excelr_assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeID + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

class EmployeeManager {
    private ArrayList<Employee> employees;
    private Map<Integer, Employee> employeeMap;

    public EmployeeManager() {
        employees = new ArrayList<>();
        employeeMap = new HashMap<>();
    }

    public void addEmployee(int employeeID, String name, String department, double salary) {
        Employee employee = new Employee(employeeID, name, department, salary);
        employees.add(employee);
        employeeMap.put(employeeID, employee);
        System.out.println("Employee added successfully.");
    }

    public void updateEmployee(int employeeID, String name, String department, double salary) {
        if (employeeMap.containsKey(employeeID)) {
            Employee employee = employeeMap.get(employeeID);
            employee.setName(name);
            employee.setDepartment(department);
            employee.setSalary(salary);
            System.out.println("Employee updated successfully.");
        } else {
            System.out.println("Employee not found with ID: " + employeeID);
        }
    }

    public void deleteEmployee(int employeeID) {
        if (employeeMap.containsKey(employeeID)) {
            Employee employee = employeeMap.get(employeeID);
            employees.remove(employee);
            employeeMap.remove(employeeID);
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found with ID: " + employeeID);
        }
    }

    public void displayAllEmployees() {
        System.out.println("\nEmployee List:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public Employee searchEmployee(int employeeID) {
        if (employeeMap.containsKey(employeeID)) {
            Employee employee = employeeMap.get(employeeID);
            System.out.println("\nEmployee found:");
            System.out.println(employee);
            return employee;
        } else {
            System.out.println("\nEmployee not found with ID: " + employeeID);
            return null;
        }
    }
}



public class Java_Assg6 {

	public static void main(String[] args) {

        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Management System -> Menu:");
            System.out.println("1. Add New Employee");
            System.out.println("2. Update Employee Details");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Search for Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee ID: ");
                    int empID = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    manager.addEmployee(empID, name, department, salary);
                    break;

                case 2:
                    System.out.print("Enter Employee ID to update: ");
                    int updateEmpID = scanner.nextInt();
                    scanner.nextLine();  // Consume the newline character
                    System.out.print("Enter new Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new Department: ");
                    String newDepartment = scanner.nextLine();
                    System.out.print("Enter new Salary: ");
                    double newSalary = scanner.nextDouble();
                    manager.updateEmployee(updateEmpID, newName, newDepartment, newSalary);
                    break;

                case 3:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteEmpID = scanner.nextInt();
                    manager.deleteEmployee(deleteEmpID);
                    break;

                case 4:
                    manager.displayAllEmployees();
                    break;

                case 5:
                    System.out.print("Enter Employee ID to search: ");
                    int searchEmpID = scanner.nextInt();
                    manager.searchEmployee(searchEmpID);
                    break;

                case 6:
                    System.out.println("Exiting Employee Management System.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    
		
	}
}
