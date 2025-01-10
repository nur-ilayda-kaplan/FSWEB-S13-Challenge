// Main Class
package org.example;

import org.example.enums.plan;

public class Main {
    public static void main(String[] args) {
        execute();
    }

    public static void execute() {
        Healthplan healthplan = new Healthplan(1, "Standard Health Plan", plan.BASIC);
        System.out.println(healthplan);

        Employee employee = new Employee(1, "John Doe", "john.doe@example.com", "password123", new String[5]);
        employee.addHealthPlan(0, "Basic Health Plan");
        employee.addHealthPlan(1, "Premium Health Plan");
        System.out.println(employee);

        Company company = new Company(1, "TechCorp", 1000000.0, new String[5]);
        company.addEmployee(0, "Alice");
        company.addEmployee(1, "Bob");
        System.out.println(company);
    }
}
