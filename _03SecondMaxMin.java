//1. If no duplicates are present then, sort the array then find required elements.
//check also for edge cases as n=0 or n=2 , n is length of array
//Time Complexity: O(NlogN), For sorting the array
// Space Complexity: O(1)


//2.Finding the max and min element in single travrsal
//traverse the array and compare with respctive elements to get the required answer.
//Time Complexity: O(N), We do two linear traversals in our array
// Space Complexity: O(1)

//3.Finding the solution in a single traversal
// Time Complexity: O(N), Single-pass solution
// Space Complexity: O(1)


public class _03SecondMaxMin {

    static int SecondMax(int [] arr){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
       
        if (arr.length<2) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
		{
			secondMax = max;
			max = arr[i];
		}

		else if (arr[i] > secondMax && arr[i] != max)
		{
			secondMax = arr[i];
		}
            
        }

        return secondMax;

    }
    static int SecondMin(int [] arr){

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
       
        if (arr.length<2) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
		{
			secondMin = min;
			min = arr[i];
        }

		else if (arr[i] < secondMin && arr[i] != min)
		{
			secondMin = arr[i];
		}
            
        }

        return secondMin;

    }
    public static void main(String[] args) {
        int []arr={9,7,5,6,8,4,5,3};
        System.out.println("Second smallest is "+SecondMax(arr));
	System.out.println("Second largest is "+SecondMin(arr));


    }
    
}
