package Assignment_1;
import java.util.*;
public class CalC {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to the basic calculator");
        System.out.println("1.Addition  2. Substraction  3.Multiplication  4.Division");
        System.out.println("Enter your Option: ");
        int  input_option = scn.nextInt();
        switch (input_option) {
            case 1:
                    System.out.println("Enter two numbers for addition");
                    int a1 = scn.nextInt();
                    int b1= scn.nextInt();
                    int add = a1+b1;
                    System.out.println("Addition is : " + add);
                break;
            case 2:
                System.out.println("Enter two numbers for substraction");
                int a2 = scn.nextInt();
                int b2= scn.nextInt();
                int sub = a2-b2;
                System.out.println("Substraction is : " + sub);
            break;
            case 3:
                    System.out.println("Enter two numbers for Multiplication");
                    int a3 = scn.nextInt();
                    int b3= scn.nextInt();
                    int mul = a3*b3;
                    System.out.println("Multiplicatiob is : " + mul);
                break;
            case 4:
                System.out.println("Enter two numbers for division");
                float a4 = scn.nextFloat();
                float b4= scn.nextFloat();
                float div = a4/b4;
                System.out.println("Division is : " + div);
            break;        
        
            default:
                System.out.println("Invalid option");
                break;
        }
    }    
}
 