package ru.otus.java.basic.homeworks.homework9.otus.employee;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private final String name;
    private final int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> extractEmployeeNames(List<Employee> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<String> names = new ArrayList<>(list.size());
        for (Employee employee : list) {
            names.add(employee.getName());
        }
        return names;
    }

    public List<Employee> filterEmployeesByAge(List<Employee> list, Integer minAge) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        List<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : list) {
            if (employee.getAge() >= minAge) {
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

    public boolean isAverageAgeAbove(List<Employee> list, Integer minAverageAge) {
        if (list == null || list.isEmpty()) {
            return false;
        }

        int averageAge = 0;
        for (Employee employee : list) {
            averageAge += employee.getAge();
        }
        averageAge = (int) averageAge / list.size();
        return averageAge > minAverageAge;
    }

    public Employee findYoungestEmployee(List<Employee> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }

        Employee employee = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (employee.getAge() > list.get(i).getAge()) {
                employee = list.get(i);
            }
        }
        return employee;
    }
}
