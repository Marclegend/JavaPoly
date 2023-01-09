package models.Utils;

import java.util.Scanner;

public abstract class InputInteger {
    public static Integer inputInteger(String message, String failMessage){
        int number = 0;
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(message);
        while(!numberScanner.hasNextInt()){
            System.out.println(failMessage); //We communicate that the answer wasnt the desired one
            numberScanner.nextLine(); //We delete the current Scanner token because it isnt an integer
        }
        number = numberScanner.nextInt();
        return number;
    }
    public static Integer inputIntegerWithRange(String message, String failMessage, int numberMin,int numberMax){
        int numberToCheck = inputInteger(message,failMessage);
        while (numberToCheck > numberMax || numberToCheck < numberMin){
            numberToCheck = inputInteger(message,failMessage);
        }
        return numberToCheck;
    }
}
