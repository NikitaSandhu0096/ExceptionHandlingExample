package com.lambton;

public class Person {

    int salary;
    void setName(String name) throws NullPointerException{
        if(name == null){
            throw new NullPointerException("name cannot be null");
        }
        System.out.println("Name length : "+name.length());
    }

    // Not allowed to set the salary in <1_000
    public void setSalary(int Salary){
        this.salary = salary;
    }
}
