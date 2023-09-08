//1. Sorting using  Array.sort(arr)   
// Time Complexity: O(N*log(N))
// Space Complexity: O(1)


//2. Using a min Variable
// Time Complexity: O(N)
// Space Complexity: O(1)

public class _01SmallestElement {
    public static int minElement(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int arr[] = { 10, 9, 7, 6, 5, 8, 3, 4 };
        int minEl = minElement(arr);
        System.out.println("The minimum element in the array is "+ minEl);
    }
}