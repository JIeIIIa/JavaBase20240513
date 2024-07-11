package com.gmail.onishchenko.homework.lesson12;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employee = new Employee("John Carter",
                "freelancer",
                "john.carter@email.com",
                "+380631234567",
                42);

        System.out.println(employee);
        System.out.println("\nTransformation...\n");

        employee.setName("Bond");
        employee.setEmail("james.bond@mi6.uk");
        System.out.println(employee);
    }
}
