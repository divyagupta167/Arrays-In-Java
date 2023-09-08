//1. Sorting using  Array.sort(arr)   
// Time Complexity: O(N*log(N))
// Space Complexity: O(1)


//2. Using a max Variable
// Time Complexity: O(N*log(N))
// Space Complexity: O(1)

public class _02MaxElement {

    public static int maxElement(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 9, 7, 6, 5, 8, 3, 4 };
        int maxEl = maxElement(arr);
        System.out.println("The minimum element in the array is "+ maxEl);
    }
    
}
