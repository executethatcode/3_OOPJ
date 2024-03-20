/**
 * JavaEquality
 */
public class JavaEquality {

    public static void main(String[] args) {
        int[] arr1 = {1,3,2,4,6,4,2,4,3,2};
        int[] arr2 = {1,3,2,4,6,4,2,4,3,2};
        boolean bool = true;
        
        if(arr1.length == arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    bool = false;
                    break;
                }
                else
                {
                    bool = true;
                    
                }
                
            }
            if (bool == true) {
                System.out.println("Arrays are equal");
                
            }
            else
            {
                System.out.println("Arrays are not equal");
            }
            
        }
        else
        {
            System.out.println("Arrays with different length occurred");
        }
    }
}