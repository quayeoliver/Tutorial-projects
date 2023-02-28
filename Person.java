package com.company;

public class Person {
   private String First_Name, Last_Name, Gender, Phone_Number;
   private int Age;

    //Methods of the class

    public Person(){}

    public void setFirst_Name(String First_Name){
        this.First_Name=First_Name;

    }
    public void  setLast_Name(String Last_Name){
        this.Last_Name=Last_Name;
    }
    public String getFull_name(){
        return First_Name+" "+ Last_Name;
    }

    public void setAge(int Age){
        this.Age=Age;
    }
    public int getAge(){
        return Age;
    }
    public void setGender(String Gender){
        this.Gender=Gender;
    }
    public String getGender(){
        return Gender;
    }
    public void setPhone_Number(String Phone_Number){
        this.Phone_Number=Phone_Number;
    }
    public String getPhone_Number(){
        return Phone_Number;
    }
}
