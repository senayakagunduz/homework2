package com.company;

public class Main {

    public static void main(String[] args) {
        Student student=new Student("1","Ali","Gümüş",1000);
        System.out.println("Ogrenci:" + student.getFirstName()+" "+student.getLastName() +" --> Ödemesi: " + student.getPayment());

        Instructor instructor1=new Instructor();
        instructor1.setFirstName("Seval");
        instructor1.setLastName("Demir");
        instructor1.setSalary(5000);
        instructor1.setId("1");

        InstructorManager instructorManager=new InstructorManager();
        instructorManager.addMember(instructor1);

        StudentManager studentManager=new StudentManager();
        studentManager.addMember(student);
        
    }
}
