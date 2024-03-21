import java.util.Arrays;

public class RunningAvg {
    
    public static void main(String[] args) {
        int[] arrayOne = {5,14,35,89,140};
        int len1 = arrayOne.length;
        int[] updatedArray = new int[len1];
        int i=0;
       while (i != 3 && len1 > 3) 
       {
            updatedArray[i] = (int)(arrayOne[i] + arrayOne[i+1] + arrayOne[i+2])/3;
            i =i+1;
        
       }
       System.out.println("Updated array : " + Arrays.toString(updatedArray));

    }
}
