package Entities;

import java.util.Scanner;

public class Helpers {
    public static int tryParseInt(){
        Scanner myObj =new Scanner(System.in);
        while (true) {
            try {
                String primaryChoice = myObj.next();
                if(Integer.parseInt(primaryChoice)>0) {
                    return Integer.parseInt(primaryChoice);
                }
                else{
                    System.out.println("Only positive numbers bigger than 0 can be entered");
                }
            } catch (Exception ex) {
                System.out.println("Only numbers can be entered!");
            }
        }
    }
    public static void backToMainMenu(){
        System.out.println("\nPress E on keyboard to continue");
        String response;
        while (true){
            Scanner myObj =new Scanner(System.in);
            response = myObj.next();
            if(response.equalsIgnoreCase("e")){
                break;
            }
            else{
                System.out.println("Only E accepted. ");
            }
        }
    }
    public static String tryStringInput(){
        while (true){
            Scanner myObj =new Scanner(System.in);
            String name = myObj.nextLine();
            if (name.isBlank() || name.isEmpty() || name.length()>20){
                System.out.println("Please give the proper input.");
            }
            else{
                return name;
            }

        }
    }
}
