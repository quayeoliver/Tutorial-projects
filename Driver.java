package com.company;

public class Driver {
    public static void main (String[] args){
        Person person1=new Person();
        Person person2=new Person();


        //setting properties for person1
        person1.setFirst_Name("Richard");
        person1.setLast_Name("Oware");
        person1.setAge(22);
        person1.setGender("Male");
        person1.setPhone_Number("0500883801");

        //setting properties for person2
        person2.setFirst_Name("Benedicta");
        person2.setLast_Name("Quaye");
        person2.setAge(18);
        person2.setGender("Female");
        person2.setPhone_Number("0544023295");

        //Getting properties of person1
        System.out.println("Person 1");
        System.out.println("Full Name: "+person1.getFull_name());
        System.out.println("Age: "+person1.getAge());
        System.out.println("Gender: "+person1.getGender());
        System.out.println("Phone Number: "+person1.getPhone_Number()+"\n");

        //Getting the properties of person 2
        System.out.println("Person 2");
        System.out.println("Full Name: "+person2.getFull_name());
        System.out.println("Age: "+person2.getAge());
        System.out.println("Gender: "+person2.getGender());
        System.out.println("Phone Number: "+person2.getPhone_Number());
    }
}
