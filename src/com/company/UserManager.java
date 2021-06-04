package com.company;

public class UserManager{
    public void addMember(User user){
        System.out.println("Kullanıcı eklendi" + user.getId() + " " + user.getFirstName()+" "+user.getLastName());
    }


}
