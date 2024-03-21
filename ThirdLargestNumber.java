public class ThirdLargestNumber {
    
    public static void main(String[] args) {
        int[] arr = {24,54,31,16,82,45,67};
        int firstLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                
                firstLargest = arr[i];
            }
        }
        int secondLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] > secondLargest) && (arr[i] < firstLargest)) {
                
                secondLargest = arr[i];
            }
        }
        int thirdLargest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > thirdLargest && arr[i] < secondLargest && arr[i] < firstLargest) {
                
                thirdLargest = arr[i];
            }
        }
        
    
        System.out.println("Third largest element is :" + thirdLargest);
        System.out.println("Second largest element is :" + secondLargest);
        System.out.println("First largest element is :" + firstLargest);
    }
}
 