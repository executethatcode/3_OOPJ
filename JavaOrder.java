import java.util.Scanner;

public class JavaOrder {
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Enter length : ");
        int len = sc.nextInt();
        int[] arrayInput = new int[len];
        String s = "true";
        for (int i = 0; i < len; i++) {
            System.out.println("Enter element : " + (i+1));
            arrayInput[i]=sc.nextInt();
            }

        for (int i = 0; i < len-1; i++) {
            if (arrayInput[i]>arrayInput[i+1]) {
                    s = "de";
                }
            }

        for (int i = 0; i < len-1; i++) {
             if (arrayInput[i]<arrayInput[i+1]) {
                        s = "as";
                }
            }
            
        if(s == "de")
        System.out.println("Descending");
        else if(s == "as")
        System.out.println("Ascending");
        else
        System.out.println("Random");    

        
    }
}
