//Widening: Process of converting value of variable of narrower type into wider type
package Assignment_3;

/**
 * Widening_Application
 */
public class Widening_Application {

    public static void main(String[] args) {
        //Defining all possible values
        byte byte_value=1;
        short short_value=2;
        char character_value='c';
        int integer_value=3;
        float float_value=4.34f;
        long long_value= 77877;
        double double_value=8.7638768736;
        //Implicit type casting or Widening
        short short_value2 = (short)byte_value;
        char character_value2= (char) short_value;
        int integer_value2= (int) character_value;
        float float_value2= (float) integer_value;
        long long_value2= (long) float_value; //data loss
        double double_value2= (double) long_value;
        //Printing after wideing
        System.out.println("After wideing values are:");
        System.out.println(short_value2 + " " + character_value2 + " " + integer_value2 + " " + float_value2 + " " + long_value2 + " " + double_value2 );
        //Explicit type casting or Widening
        short short_value3 = byte_value;
        char character_value3= (char) short_value; //cannot happen explicitly  
        int integer_value3= character_value;
        float float_value3= integer_value;
        long long_value3= (float) float_value; //cannot happen explicitly 
        double double_value3= long_value;
        //Printing after wideing
        System.out.println("After wideing values are:");
        System.out.println(short_value3 + " " + character_value3 + " " + integer_value3 + " " + float_value3 + " " + long_value3 + " " + double_value3 );

          
    }
}