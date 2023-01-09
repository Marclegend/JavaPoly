package models.Utils;

import java.util.Scanner;

public abstract class InputString {
    public static String inputString(String message){
        System.out.println(message);
        Scanner numberScanner = new Scanner(System.in);
        String word = numberScanner.next();
        return word;
    }
}
