package com.company;

public class Student extends National {
    private int cours;
    private Gender gender;

    public Student(String name, int age,String national,String instruments,int cours,Gender gender) {
        super(name, age,national,instruments);
        //super.getNational();
        this.cours=cours;
        this.gender=gender;
    }

    public int getCours() {
        return cours;
    }

    public Gender getGender() {
        return gender;
    }


    @Override
    public String getInfo() {
      return   super.getInfo()+ " "+getNational()+" "+getInstruments()+" "+getCours()+"й курс "+getGender();
    }
}
