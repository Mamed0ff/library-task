import Entities.Helpers;
import Entities.Library;

import Entities.Book;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Library myLib= new Library();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a name for Library.");
        myLib.libName= Helpers.tryStringInput();
        System.out.println("\t\t\t\t\t\t\t ( ﾉ ﾟｰﾟ)ﾉ     （￣︶￣）↗　      ＼(ﾟｰﾟ＼)");
        System.out.println("\t\t\t\tヾ(⌐■_■)ノ♪  WELCOME TO THE "+myLib.libName+" NAMED LIBRARY  ");
        while(true){
            System.out.println("\n\nPlease choose what you want to do:");
            System.out.println("1:Show the books");
            System.out.println("2:Update");
            System.out.println("3:Search");
            System.out.println("4:Restart");
            System.out.println("5:exit");
            int myChoice = Helpers.tryParseInt();
            if(myChoice==1){
                myLib.showBooks();
                Helpers.backToMainMenu();
            } // Showing all books
            else if(myChoice==2){
                while (true){
                    System.out.println("\nWhat do you want to update?");
                    System.out.println("1:Library");
                    System.out.println("2:Book");
                    System.out.println("3:Exit");
                    int myUpdate=Helpers.tryParseInt();
                    if(myUpdate==1){
                        while(true){
                            System.out.println("What do you want to update?");
                            System.out.println("1.Add book");
                            System.out.println("2.Delete book");
                            System.out.println("3.Update name");
                            System.out.println("4.Exit");
                            int mySecondUpdate=Helpers.tryParseInt();
                            if(mySecondUpdate==1){
                                System.out.println("Enter the name:");
                                String Name=Helpers.tryStringInput();
                                System.out.println("Enter the author:");
                                String Author = Helpers.tryStringInput();
                                System.out.println("Enter the language:");
                                String Lang=Helpers.tryStringInput();
                                Book newBook = new Book(Name,Author,Lang);
                                myLib.add(newBook);
                                System.out.println("Process executed!");
                                Helpers.backToMainMenu();
                            }
                            else if(mySecondUpdate==2){
                                System.out.println("Enter the name:");
                                String Name=Helpers.tryStringInput();
                                System.out.println("Enter the author:");
                                String Author = Helpers.tryStringInput();
                                System.out.println("Enter the language:");
                                String Lang=Helpers.tryStringInput();
                                Book newBook = new Book(Name,Author,Lang);
                                myLib.delete(newBook);
                                System.out.println("Process executed!");
                                Helpers.backToMainMenu();
                            }
                            else if(mySecondUpdate==3){
                                System.out.println("Enter the Searched book`s name:");
                                String Name = Helpers.tryStringInput();
                                if(myLib.checkName(Name)){
                                    System.out.println("Enter New name:");
                                    String newName=Helpers.tryStringInput();
                                    myLib.updateName(Name,newName);
                                    System.out.println("Process executed!");
                                    Helpers.backToMainMenu();
                                }
                            }
                            else if(mySecondUpdate==4){
                                System.out.println("Going Back....");
                                break;
                            }
                            else{
                                System.out.println("Please enter number between 1-4");
                            }
                        }
                    }
                    else if(myUpdate==2){
                        while(true){
                            System.out.println("\nWhat do you want to update?");
                            System.out.println("1.Update price ");
                            System.out.println("2.Update Quantity");
                            System.out.println("3.Exit");
                            int myThirdUpdate=Helpers.tryParseInt();
                            if(myThirdUpdate==1){
                                System.out.println("Enter the name of book:");
                                String Name = Helpers.tryStringInput();
                                if(myLib.checkName(Name)){
                                    System.out.println("Enter the price:");
                                    int price=Helpers.tryParseInt();
                                    myLib.updatePrice(Name,price);
                                    System.out.println("Process executed!");
                                    Helpers.backToMainMenu();
                                }
                            }
                            else if(myThirdUpdate==2){
                                System.out.println("Enter the name of book:");
                                String Name = Helpers.tryStringInput();
                                if(myLib.checkName(Name)){
                                    System.out.println("Enter the quantity:");
                                    int quantity=Helpers.tryParseInt();
                                    myLib.updateQuantity(Name,quantity);
                                    System.out.println("Process executed!");
                                    Helpers.backToMainMenu();
                                }
                            }
                            else if(myThirdUpdate==3){
                                System.out.println("Going Back....");
                                break;
                            }
                            else{
                                System.out.println("Please enter number between 1-4");
                            }
                        }
                    }
                    else if(myUpdate==3){
                        System.out.println("Going Back....");
                        break;
                    }
                    else{
                        System.out.println("Please enter number between 1-4");
                    }
                }
            } // updating books and library
            else if(myChoice==3){
                while(true){
                    System.out.println("What are you searching for?");
                    System.out.println("1:Book name");
                    System.out.println("2:Book author");
                    System.out.println("3:Book language");
                    System.out.println("4:exit");
                    int mySearchChoice=Helpers.tryParseInt();
                    if(mySearchChoice==1){
                        System.out.println("Enter the name:");
                        String Name=Helpers.tryStringInput();
                        myLib.search(Name);
                        System.out.println("Process executed!");
                        Helpers.backToMainMenu();
                    }
                    else if(mySearchChoice==2){
                        System.out.println("Enter the author:");
                        String Author=Helpers.tryStringInput();
                        myLib.searchAuthor(Author);
                        System.out.println("Process executed!");
                        Helpers.backToMainMenu();
                    }
                    else if(mySearchChoice==3){
                        System.out.println("Enter the language:");
                        String Lang=Helpers.tryStringInput();
                        myLib.searchLang(Lang);
                        System.out.println("Process executed!");
                        Helpers.backToMainMenu();
                    }
                    else if(mySearchChoice==4){
                        System.out.println("Going Back....");
                        break;
                    }
                    else{
                        System.out.println("Please enter the number between given amount.");
                    }
                }

            } // searching
            else if(myChoice==4){
                System.out.println("Enter a name for Library.");
                myLib.libName= Helpers.tryStringInput();
                System.out.println("\t\t\t\t/////////WELCOME TO THE "+myLib.libName+" NAMED LIBRARY//////////");
            } // renaming library
            else if(myChoice==5) {
                System.out.println("Do you want to exit? Y/N");
                String answer;
                while (true) {
                    answer = myObj.next();
                    if (answer.equalsIgnoreCase("y")) {
                        System.out.println("Thanks for visiting our library.");
                        return;
                    }
                    else if(answer.equalsIgnoreCase("n")){
                        System.out.println("xD");
                        break;
                    }
                    else {
                        System.out.println("Only Y or N accepted.");
                    }
                }
                } // getting out of program
            else{
                System.out.println("Make the choice again, please.");
            } // out of range case

        }
    }
}