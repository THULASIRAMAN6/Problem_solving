// 
// Given an array arr[] consisting of N integers, and an integer X, the task is to find two elements from the 
// array arr[] having sum X. If there doesn’t exist such numbers, then print “-1”.

// Examples:

// Input: arr[] = {0, -1, 2, -3, 1}, X = -2
// Output: -3, 1
// Explanation:
// From the given array the sum of -3 and 1 is equal to -2 (= X).

// Input: arr[] = {1, -2, 1, 0, 5}, X = 0
// Output: -1

import java.util.HashMap;

public class PairSum {


    // Function to print pairs in the array with the given sum
    static void printPairs(int arr[], int arr_size, int sum) {
        // Initialize a hash map to keep track of elements encountered
        // The key is the array element, and the value is a boolean indicating if it's present
        HashMap<Integer, Boolean> binMap = new HashMap<>();

        // Iterate through each element in the array
        for (int i = 0; i < arr_size; i++) {
            // Calculate the complement of the current element with respect to the given sum
            int temp = sum - arr[i];

            // Check if the complement is present in the hash map and if it's not the same element
            if (temp >= 0 && binMap.containsKey(temp) && binMap.get(temp)) {
                // Print the pair with the given sum
                System.out.printf("Pair with given sum %d is (%d, %d)%n", sum, arr[i], temp);
            }

            // Mark the current element as encountered in the hash map
            binMap.put(arr[i], true);
        }
    }

    // Main function to test the pair sum functionality
    public static void main(String[] args) {
        // Example usage
        int[] arr = {1, 4, 7, 8, 3, 5};
        int sum = 10;
        int arr_size = arr.length;

        // Call the function to print pairs with the given sum
        printPairs(arr, arr_size, sum);
    }
}


// Time complexity : O(N)
// Space complexity : O(N)