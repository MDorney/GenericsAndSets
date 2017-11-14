/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author L117student
 */
public class Lab2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Smith", "John", "123-45-7890");
        Employee e2 = new Employee("Brown", "James", "098-65-4321");
        Employee e3 = new Employee("Alfredo", "Fettucine", "456-78-9012");
        Employee e4 = new Employee("Duplicate", "Employee", "456-78-9012");
        List employeeList = new ArrayList();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        System.out.println("List");
        for (int i = 0; i < employeeList.size(); i++) {
            Employee current = (Employee)employeeList.get(i);
            System.out.println("Last name: " + current.getLastName());
        }

        Set employeeSet = new HashSet(employeeList);
        System.out.println("After Set (should remove last name: Duplicate)");
        employeeList = new ArrayList(employeeSet);
        for (int i = 0; i < employeeList.size(); i++) {
            Employee current = (Employee)employeeList.get(i);
            System.out.println("Last name: " + current.getLastName());
        }
    }
}
