//1.Using an extra array and Iterate from the back of the input array while storing the elements in new array  in opposite direction.
// Time Complexity: O(n), single-pass for reversing array.
// Space Complexity: O(n), for the extra array used.

//2.Space Optimized iterative method
//Use two pointers at 0 and n-1,and swap the elements, run the loop for n/2 length, increment and decrement the pointers respectively.
// Time Complexity: O(n), single-pass involved.
// Space Complexity: O(1) 

//3.Recursive method
// a recursive funvtion that takes start and end index along with array as parameters and swap the elements and again call function with array and start+1 and end-1
//Time Complexity: O(n)
// Space Complexity: O(1)

//4.Using library functions
//Collections.reverse(Arrays.asList(arr));
// Time Complexity: O(n)
// Space Complexity: O(1)



public class _04Reverse {
    //Function to print array
   static void printArray(int arr[], int n) {
    System.out.print("Reversed array is:- \n");
    for (int i = 0; i < n; i++) {
       System.out.print(arr[i] + " ");
    }
 }
 //Function to reverse array using recursion
 static void reverseArray(int arr[], int start, int end) {
    if (start < end) {
       int tmp = arr[start];
       arr[start] = arr[end];
       arr[end] = tmp;
       reverseArray(arr, start + 1, end - 1);
    }
 }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 19, 41, 50, 2, 990};
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
    }
    
}
