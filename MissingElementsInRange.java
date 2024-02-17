// Print missing elements that lie in range 0 – 99

// Given an array of integers print the missing elements that lie in range 0-99. If there are more than one missing, collate them, otherwise just print the number.
// Note that the input array may not be sorted and may contain numbers outside the range [0-99], but only this range is to be considered for printing missing elements.

// Examples :  

// Input: {88, 105, 3, 2, 200, 0, 10}
// Output: 1
//         4-9
//         11-87
//         89-99


// Input: {9, 6, 900, 850, 5, 90, 100, 99}
// Output: 0-4
//         7-8
//         10-89
//         91-98

import java.util.ArrayList;
import java.util.List;

public class MissingElementsInRange {
    public static void main(String[] args) {
        // Sample input array
        int[] array = {2, 5, 8, 10, 12, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 105, -5};

        // Find missing elements
        List<String> missingElements = findMissingElements(array);

        // Print the result
        System.out.println("Missing elements in the range 0 to 99:");
        if (missingElements.isEmpty()) {
            System.out.println("No missing elements.");
        } else {
            for (String element : missingElements) {
                System.out.print(element + " ");
            }
        }
    }

    // Function to find missing elements
    private static List<String> findMissingElements(int[] array) {
        // Result list to store missing elements
        List<String> result = new ArrayList<>();

        // Create a boolean array to mark the presence of elements in the range 0 to 99
        boolean[] present = new boolean[100];

        // Mark elements from the given array as present
        for (int num : array) {
            // Check if the number is within the range [0-99]
            if (num >= 0 && num < 100) {
                present[num] = true;
            }
        }

        // Collate missing elements
        boolean inRange = false;
        StringBuilder collated = new StringBuilder();
        for (int i = 0; i < present.length; i++) {
            if (!present[i]) {
                if (!inRange) {
                    // Start of a missing range
                    collated.append(i);
                    inRange = true;
                }
            } 
            else {
                if (inRange) {
                    // End of a missing range
                    collated.append("-").append(i - 1).append(" ");
                    inRange = false;
                }
            }
        }

        // Handle the case where the last element is missing
        if (inRange) {
            collated.append("-").append(99);
        }

        if (collated.length() > 0) {
            // Add collated missing elements to the result list
            result.add(collated.toString());
        } else {
            // If no collated missing elements, add individual missing elements
            for (int i = 0; i < present.length; i++) {
                if (!present[i]) {
                    result.add(String.valueOf(i));
                }
            }
        }

        return result;
    }
}

// The idea is to use a boolean array of size 100 to keep track of array elements that lie in range 0 to 99.
// We first traverse input array and mark such present elements in the boolean array. 
// Once all present elements are marked, the boolean array is used to print missing elements. 