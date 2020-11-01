package com.Day8Assignment;

public class Main {

    public static void main(String[] args) {
        question1[] obj=new question1[3];
        for(int i=0;i<3;i++){
            obj[i]=new question1();

        }
        System.out.println("enter details of doctor");
        Doctor d= new Doctor();
        obj[0]= d;
        d.getDetails();
        d.displayDetails();
        d.task();

        System.out.println("enter details of engineer");
        engineer e= new engineer();
        obj[1]= e;
        e.getDetails();
        e.displayDetails();
        e.task();

        System.out.println("enter details of Piolot");
        Piolot p= new Piolot();
        obj[2]= p;
        p.getDetails();
        p.displayDetails();
        p.task();


        for(int i=0;i<3;i++){
            System.out.println(obj[i].name+" "+obj[i].age+" "+obj[i].salary+" "+
                    obj[i].designation);
        }
    }
}
