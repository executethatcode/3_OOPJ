public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("Given array is :");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
            
        }

        for (int j = 0, k = arr.length-1; j != k ; j++, k--) {
            int temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp; 
         }
        
        System.out.println("Reversed array is : ");
        for (int l = 0; l < arr.length; l++) {

            System.out.print(arr[l] + " ");
            
        }
       

    }
}
