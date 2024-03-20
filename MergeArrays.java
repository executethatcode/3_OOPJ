/**
 * MergeArrays
 */
import java.math.*;
import java.util.Arrays;
public class MergeArrays {

    public static void main(String[] args) {
        int[] arrayOne = {23, 60, 94, 3, 102};
        int[] arrayTwo = {42, 16, 74};
        int len1 = arrayOne.length;
        int len2 = arrayTwo.length;
        int maxLen = len1 + len2;
        int[] mergedArray = new int[maxLen];
        int i=0, j=0, k=0;

        while (i < len1 && j < len2) {
            mergedArray[k++] = arrayOne[i++];
            mergedArray[k++] = arrayTwo[j++];
        }

        while (i < len1) {
            mergedArray[k++] = arrayOne[i++];
            
        }

        while (j < len2) {
            mergedArray[k++] = arrayTwo[j++];

            
        }

        System.out.println("merged Array is " + Arrays.toString(mergedArray));

       

    }
}