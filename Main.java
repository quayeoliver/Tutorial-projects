package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Book book1=new Book();
       Book book2=new Book();
//setting book 1 properties
       book1.setTitle("The Dilema of a Ghost");
       book1.setAuthor("Francis Duncan");
       book1.setISBN("21827364");
       book1.setPage_Count(30);
       book1.setPrice(50.0);

       //Setting book 2 properties
        book2.setTitle("Oliver Twist");
        book2.setAuthor("Charles Dickens");
        book2.setISBN("29183746");
        book2.setPage_Count(350);
        book2.setPrice(65.0);

        System.out.println("Book 1");
        System.out.println("Title:"+book1.getTitle());
        System.out.println("Author:"+book1.getAuthor());
        System.out.println("ISBN:"+book1.getISBN());
        System.out.println("Page Count:"+book1.getPage_Count());
        System.out.println("Price:"+book1.getPrice());


        System.out.println("Book 2");
        System.out.println("Title:"+book2.getTitle());
        System.out.println("Author:"+book2.getAuthor());
        System.out.println("ISBN:"+book2.getISBN());
        System.out.println("Page Count:"+book2.getPage_Count());
        System.out.println("Price:"+book2.getPrice());


    }
}
