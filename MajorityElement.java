

// To find the majority element in an array, you can use the Boyer-Moore Voting Algorithm.
// The majority element is the element that appears more than n/2 times in an array of length n,
// where n is the size of the array.

public class MajorityElement {
    public static int findMajorityElement(int[] arr) {
        int candidate = 0;
        int count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // At this point, the candidate may be the majority element,
        // but we need to verify it by counting its occurrences in the array.

        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate is the majority element
        if (count > arr.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("No majority element found");
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 2, 1, 1, 1, 2, 2};
        try {
            int majorityElement = findMajorityElement(array);
            System.out.println("Majority element: " + majorityElement);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
// Time complexity - O(N)
// Space Comploexity - O(1)

