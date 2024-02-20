package Entities;

public class Book {

    private static int ID;
    private int id;
    public String name;
    public String author;
    public String language;
    public int price;
    public int count=1;

    public Book(String name, String author, String language){
        ID += 1;
        id = ID;
        this.name=name;
        this.author = author;
        this.language = language;

    }
    public void fullInfo() {
        System.out.println("\n\nID: "+this.id + "\nBook name: " + this.name+"\nBook Author: "+ this.author + "\nLanguage: "+ this.language+ "\nMarketPrice: "+ this.price +" USD" +"\nStock Quantity: "+ this.count);
    }
}
