package com.company;

public class Book {
    //Book properties
    private String Title, Author, ISBN;
    private int Page_Count;
    private double Price;


    public Book(){};

    public void setTitle(String Title){
        this.Title=Title;
    }
    public String getTitle(){

        return  Title;
    }
    public void setAuthor(String Author){

        this.Author=Author;
    }
    public String getAuthor(){

        return Author;
    }
    public void setISBN(String ISBN){

        this.ISBN=ISBN;
    }
    public String getISBN(){

        return ISBN;
    }
    public void setPage_Count(int Page_Count){

        this.Page_Count=Page_Count;
    }
    public int getPage_Count(){

        return Page_Count;
    }
    public void setPrice(double Price){

        this.Price=Price;
    }
    public double getPrice(){
        return Price;
    }
}



