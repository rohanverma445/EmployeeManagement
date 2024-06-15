package com.sj.empmanagmentapplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    private List<Employee> employeeList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addEmp() {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Employee Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();
        
        Employee emp = new Employee(id, name, department, salary);
        employeeList.add(emp);
        System.out.println("Employee added successfully!");
    }

    public void viewEmp() {
        System.out.print("Enter Employee ID to view: ");
        int id = scanner.nextInt();
        
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.println(emp);
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void updateEmployee() {
        System.out.print("Enter Employee ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over
        
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                System.out.print("Enter new name: ");
                String name = scanner.nextLine();
                System.out.print("Enter new department: ");
                String department = scanner.nextLine();
                System.out.print("Enter new salary: ");
                double salary = scanner.nextDouble();
                
                emp.setName(name);
                emp.setDepartment(department);
                emp.setSalary(salary);
                System.out.println("Employee updated successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void deleteEmp() {
        System.out.print("Enter Employee ID to delete: ");
        int id = scanner.nextInt();
        
        for (Employee emp : employeeList) {
            if (emp.getId() == id) {
                employeeList.remove(emp);
                System.out.println("Employee deleted successfully!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void viewAllEmps() {
        if (employeeList.isEmpty()) {
            System.out.println("No employees found!");
        } else {
            for (Employee emp : employeeList) {
                System.out.println(emp);
            }
        }
    }
}
