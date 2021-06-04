package com.company;

public class StudentManager extends UserManager{
    public void addMember(Student student){
        System.out.println("Öğrenci eklendi: " + student.getFirstName()+ " " + student.getLastName()+ " " + student.getPayment());
    }
}
