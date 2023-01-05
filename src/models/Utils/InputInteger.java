package models.Utils;

import java.util.Scanner;

public abstract class InputInteger {
    public static Integer inputInteger(String message, String failMessage){
        System.out.println(message);
        Scanner numberScanner = new Scanner(System.in);
        int number = numberScanner.nextInt();
        return number;
    }
}
