//Lowering: Process of converting value of variable of widening type into lower type
package Assignment_3;
public class Lowering_Application {
    public static void main(String[] args) {
    byte byte_value=1;
    short short_value=2;
    char character_value='c';
    int integer_value=3;
    float float_value=4.34f;
    long long_value= 77877;
    double double_value=8.7638768736;
    //Lowering
    byte byte_value2 = (byte) short_value;
    short short_value2 = (short) character_value;
    char character_value2= (char) integer_value;
    int integer_value2= (int) float_value;
    float float_value2= (float) long_value;
    long long_value2= (long) double_value;
    //Printing after lowering
    System.out.println("After lowering values are:");
    System.out.println(byte_value2 + " " + " " + short_value2 + " " + character_value2 + " " + integer_value2 + " " + float_value2 + " " + long_value2  );
    
}
}
