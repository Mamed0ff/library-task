package Entities;

import Interfaces.LibraryMethods;

import java.util.ArrayList;

public class Library implements LibraryMethods{
    public String libName="Milli Baki";
    private static ArrayList<Book> myBooks;
    public Library(){
        myBooks=new ArrayList<>();
        fillMyList();
    }
    private void fillMyList(){
        myBooks.add(new Book("Think and Grow", "Napoleon Hill", "Eng"));
    }

    @Override
    public void add(Book book) {
        if (searchAll(book)) {
            for (Book item : myBooks) {
                if (searchAll(book,item)) {
                    item.count+=1;
                }
            }
        }
        else {
            myBooks.add(book);
        }
    } // adding

    @Override
    public void delete(Book book) {
        if (searchAll(book)) {
            for (Book item : myBooks) {
                if (searchAll(book,item)) {
                    item.count-=1;
                }
            }
        }
        else {
            System.out.println("There is no such a book;");
        }
    } // delete

    @Override
    public void search(String givenInput) {
        myBooks.stream().filter(x->x.name.equalsIgnoreCase(givenInput)).forEach(x->x.fullInfo());
    } // search name
    public void searchAuthor(String givenInput) {
        myBooks.stream().filter(x->x.author.equalsIgnoreCase(givenInput)).forEach(x->x.fullInfo());
    }
    public void searchLang(String givenInput) {
        myBooks.stream().filter(x->x.language.equalsIgnoreCase(givenInput)).forEach(x->x.fullInfo());
    }

    @Override
    public boolean searchAll(Book book) {
        for (Book item : myBooks){
            if (item.name.equalsIgnoreCase(book.name) && item.author.equalsIgnoreCase(book.author) && item.language.equalsIgnoreCase(book.language)){
                return true;
            }
        }
        return false;
    } // search for fields
    public boolean searchAll(Book book, Book item) {
        if (book.name.equalsIgnoreCase(item.name) && book.author.equalsIgnoreCase(item.author) && book.language.equalsIgnoreCase(item.language)) {
            return true;
        }
        return false;
    } // method overload

    //Lampda expressions xD （￣︶￣）↗　
    @Override
    public void showBooks() {
        myBooks.stream().filter(x->x.count>=1).forEach(x->x.fullInfo());
    }
    public boolean checkName(String name) {
        for (Book item : myBooks){
            if(item.name.equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }
    public void updateName(String name, String newName){
        myBooks.stream().filter(x->x.name.equalsIgnoreCase(name)).forEach(x->x.name=newName);
    }
    public void updatePrice(String name, int price){
        myBooks.stream().filter(x->x.name.equalsIgnoreCase(name)).forEach(x->x.price=price);
    }
    public void updateQuantity(String name, int quantity){
        myBooks.stream().filter(x->x.name.equalsIgnoreCase(name)).forEach(x->x.count=quantity);
    }


}
