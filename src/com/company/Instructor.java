package com.company;

public class Instructor extends User {
    private int salary;

    public Instructor() {
    }

    public Instructor(String id, String firstName, String lastName, int salary) {
        super(id, firstName, lastName);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
