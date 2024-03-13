package Assignment_1;
import java.util.Scanner; 
class GradeCal{
    public static void main(String[] args)
    {
        int numerical_grade;
        System.out.println("Enter your score(0-100)");
        Scanner user_input  = new Scanner(System.in);
        numerical_grade= user_input.nextInt();
            if ((numerical_grade > 90) && (numerical_grade <= 100)) {
                    System.out.println("Your grade is A");
            }
            else if ((numerical_grade > 70) && (numerical_grade <= 90)) {
                System.out.println("Your grade is B");
                
            }
            else if ((numerical_grade > 50) && (numerical_grade <= 70)) {
                System.out.println("Your grade is C");
                
            }
            else if ((numerical_grade > 30) && (numerical_grade <= 50)) {
                System.out.println("Your grade is D");
                
            }
            else
            {
                System.out.println("Your grade is F");

    }
}
}