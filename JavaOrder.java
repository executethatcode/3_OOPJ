import java.util.Scanner;

public class JavaOrder {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter length : ");
        int len = sc.nextInt();
        int[] arrayInput = new int[len];
        Boolean bool_ascending = true;
        Boolean bool_descending = true;

        for (int i = 0; i < len; i++) {
            System.out.println("Enter element : " + (i+1));
            arrayInput[i]=sc.nextInt();
            }

        for (int i = 1; i < len; i++) {
            if (arrayInput[i]>arrayInput[i-1]) {
                    bool_descending = false;
                    break;
                }
        }
        
        for (int i = 1; i < len; i++) {
            if (arrayInput[i]<arrayInput[i-1]) {
                    bool_ascending = false;
                    break;
                }
        }
        if(bool_ascending)
        System.out.println("ascending");
        else if(bool_descending)
        System.out.println("descending");
        else
        System.out.println("Random");    

        
    }
}
