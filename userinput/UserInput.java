// package userinput;
import java.lang.System; // Doesn't really matter if it's here or not
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        // Creating new instance for Scanner class - From java.util.Scanner
        Scanner input = new Scanner(System.in); // System.in is the default input stream

        System.out.println("Please Enter Your Name");
        String name = input.nextLine(); // nextLine() -> string is used to get the input from the user
        System.out.println("Your name is " + name);
        input.close(); // closing the scanner - to avoid memory leak
    }
}