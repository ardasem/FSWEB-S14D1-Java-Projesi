package com.Workintech.company;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    public HRManager(long id, String name, JuniorDeveloper[] junior,MidDeveloper[] mid,SeniorDeveloper[] senior) {
        super(id, name);
        this.juniorDevelopers=junior;
        this.midDevelopers=mid;
        this.seniorDevelopers=senior;
    }

    @Override
    public void work() {
        setSalary(60000);
        System.out.println(getName()+"hr manager has started working.");

    }

    public void setJuniorDevelopers(JuniorDeveloper[] juniorDevelopers) {
        this.juniorDevelopers = juniorDevelopers;
    }

    public void setMidDevelopers(MidDeveloper[] midDevelopers) {
        this.midDevelopers = midDevelopers;
    }

    public void setSeniorDevelopers(SeniorDeveloper[] seniorDevelopers) {
        this.seniorDevelopers = seniorDevelopers;
    }

    public void addEmployee(int index, JuniorDeveloper junior){
        try{
            if(juniorDevelopers[index] == null){
                juniorDevelopers[index]= junior;
            }else{
                System.out.println("Index is full.");
            }
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found:" + index);

        }

    }

    public void addEmployee(int index, MidDeveloper mid){
        try{
            if(midDevelopers[index] == null){
                midDevelopers[index]= mid;
            }else{
                System.out.println("Index is full.");
            }
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found:" + index);

        }

    }

    public void addEmployee(int index, SeniorDeveloper senior){
        try{
            if(seniorDevelopers[index] == null){
                seniorDevelopers[index]= senior;
            }else{
                System.out.println("Index is full.");
            }
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
            System.out.println("Index not found:" + index);

        }

    }
}
