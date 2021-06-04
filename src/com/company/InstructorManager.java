package com.company;

public class InstructorManager extends UserManager{
    public void addMember(Instructor instructor){
        System.out.println("Öğretmen eklendi: " + instructor.getFirstName()+" "+instructor.getLastName()+" -->Maaşı:"+ instructor.getSalary() );
    }

}
