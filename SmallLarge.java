public class SmallLarge {
    
    public static void main(String[] args) {
        int[] arr = {2,4,6,5,4,7,6,8};
        int len = arr.length;
        int small = arr[0];
        int large = arr[1];
        for (int i = 2, k = 2; i < len; i++, k++) {
            if (arr[i]<small ) {
                small = arr[i];
            }
            else if (arr[k]>large ) {
                large = arr[k];
            }
         }
         System.out.println("Smallest element is: " +small + " and Largest element is: " +large);
    }
}
