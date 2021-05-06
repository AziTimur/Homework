package com.company;

public class Main {

    public static void main(String[] args) {


        National national=new National("Azamat",24,"турк","саз");
        System.out.println(national.getInfo());
        System.out.println("-----------------------------------------------------------------------");
        Student student=new Student("АЗАМАТ",20,"КЫРГЫЗ","КОМУЗ ",2,Gender.MALE);
        System.out.println(student.getInfo()+"(женщина)");
        student.playMusic();
        System.out.println("-----------------------------------------------------------------------");

        Expert expert= new Expert("Janna",21,"немка","гитара",4,Gender.FEMALE,"музыкант");
        System.out.println(expert.getInfo());




    }
}
