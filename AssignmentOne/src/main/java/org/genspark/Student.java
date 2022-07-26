package org.genspark;

import java.util.List;

public class Student {

    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;

    public Student(int id, String name, List<Phone> ph, Address add) {
        this.id = id;
        this.name = name;
        this.ph = ph;
        this.add = add;
    }

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




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public void setAdd(Address add) {
        this.add = add;
    }
}
