package com.company;

public class Student extends User {
    private int payment;

    public Student(String id, String firstName, String lastName, int payment) {
        super(id, firstName, lastName);
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
