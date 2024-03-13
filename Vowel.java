import java.util.Scanner;
import java.io.*;
class Vowel{
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.next().toLowerCase();
    
        int len = input.length();
        System.out.println("length of string" + len);
        if (len == 1)
        {
           if (input == "a")
                System.out.println("Vowel");
           else if (input == "e")
                System.out.println("Vowel");
           else if (input == "i")
                System.out.println("Vowel");
           else if (input == "o")
                System.out.println("Vowel");
           else if (input == "u")
                System.out.println("Vowel");
           else
                System.out.println("Consonant");
        }
        else
        {
        System.out.println("ERROR!, not a letter !!");
        }
    }
}