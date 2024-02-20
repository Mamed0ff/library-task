package Interfaces;

import Entities.Book;

public interface LibraryMethods {
    public void add(Book book);
    public void delete(Book book);
    public void search(String givenInput);
    boolean searchAll(Book book);
    public void showBooks();
}
