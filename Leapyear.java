package Assignment_1;

import java.util.Scanner;

public class Leapyear {

      public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Year:");
        int year = in.nextInt();
        if (year%4==0 && year%400==0)
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap year");
    }
    
}
