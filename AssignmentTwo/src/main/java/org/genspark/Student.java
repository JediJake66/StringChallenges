package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Student
{
    private int id=66;
    private String name="Jacob Stout";
    @Autowired
    private List<Phone> ph;
    @Autowired
    private Address add;

    @Override
    public String toString() {
        return '\n' +"Student ID: " + id + '\n'+
                "Name: " + name + '\n' +
                "Phone Number: " + ph +
                add ;
    }

    public  void findStudent()
    {
        System.out.println("Student Found --> " + toString());
    }

}
