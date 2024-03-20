import java.util.Scanner;

public class PairSum {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the length of an array");
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            System.out.println("Enter value of element " + (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter any random number : ");
        int randomNumber = sc.nextInt();

        for (int j = 0; j < len; j++) {

            for (int j2 = 0; j2 < len; j2++) {

                if ((arr[j]+arr[j2]) == randomNumber) {
                    System.out.println((j+1) + " and " + (j2+1) + " are the element of the array that has sum equals to " + randomNumber);
                }
                
                /*else
                {
                    continue;
                }*/
                
                
            }
            
        }
    }
}
