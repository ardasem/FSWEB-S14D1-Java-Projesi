package com.Workintech.company;

public class MidDeveloper extends Employee{

    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(42000);
        System.out.println(getName()+"mid has started working.");

    }
}

