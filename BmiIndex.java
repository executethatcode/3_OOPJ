package Assignment_1;
import java.util.*;
public class BmiIndex {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        float height,weight,bmi_index;
        System.out.println("Enter your height in meter");
        height = scn.nextFloat();
        System.out.println("Enter your Weight in kg");
        weight = scn.nextFloat();
        bmi_index = (weight/(height*height));
        if (bmi_index < 18.5 )
                System.out.println("Underweight");
        else if ( bmi_index < 24.9 && bmi_index >= 18.5)
                System.out.println("Healthy weight");
        else if ( bmi_index < 29.9 && bmi_index >= 25)
                System.out.println("Over weight");
        else if ( bmi_index > 30)
                System.out.println("Obesity");                

    }
    
}
