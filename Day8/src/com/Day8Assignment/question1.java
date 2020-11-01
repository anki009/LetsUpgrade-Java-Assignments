package com.Day8Assignment;

import  java.util.Scanner;

public class question1 {
    Scanner sc=new Scanner(System.in);
    String name;
    int age;
    Double salary;
    String designation;


    public void getDetails(){
        System.out.println("enter name age salary designation");
        name=sc.next();
        age=sc.nextInt();
        salary=sc.nextDouble();
        designation=sc.next();
    }

    public void displayDetails(){
        System.out.println("Name: "+name+"  Age: "+age+"  Salary: "+salary+"  Designation: "+designation);
    }


}
