
public class LastNameExtractor {

    // Method to extract last name by splitting full name
    public static String extractLastNameBySplit(String fullName) {
        String[] nameParts = fullName.split("\\s+");
        return nameParts[nameParts.length - 1];
    }

    // Method to extract last name by finding last space
    public static String extractLastNameByLastSpace(String fullName) {
        int lastIndex = fullName.lastIndexOf(' ');
        if (lastIndex != -1) {
            return fullName.substring(lastIndex + 1);
        } else {
            // If no space is found, return the entire name as the last name
            return fullName;
        }
    }

    public static void main(String[] args) {
        String fullName = "John Doe";
        
        // Extract last name using split
        String lastNameSplit = extractLastNameBySplit(fullName);
        System.out.println("Last name (split): " + lastNameSplit);
        
        // Extract last name using last space
        String lastNameLastSpace = extractLastNameByLastSpace(fullName);
        System.out.println("Last name (last space): " + lastNameLastSpace);
    }
}

// In this code:

// The extractLastNameBySplit method splits the full name string using whitespace as a delimiter and returns the last component
// of the resulting array.
// The extractLastNameByLastSpace method finds the last occurrence of a space in the full name string and returns the substring after it.
// In the main method, we demonstrate both approaches by extracting the last name from the fullName string "John Doe" 
// and printing the result.



// Here's how it works:

// lastIndexOf(' '): This method is called on the fullName string to find the index of the last occurrence of the space character (' ') 
// in the string. If no space character is found, it returns -1. The index returned represents the position of the last space character 
// in the string.

// if (lastIndex != -1): This condition checks whether a space character was found in the fullName string. If lastIndex is not -1, 
// it means that at least one space character exists in the string.

// fullName.substring(lastIndex + 1): If a space character is found in the fullName string, this line extracts the substring starting 
// from the character right after the last space character (i.e., lastIndex + 1). This substring corresponds to the last name
// in the full name string.


// The expression split("\\s+") in Java is used to split a string based on whitespace characters (spaces, tabs, newlines, etc.).

// \\s is a regular expression that matches any whitespace character.
// + is a quantifier that matches one or more occurrences of the preceding element, in this case, whitespace characters.
// So, split("\\s+") will split the string into substrings whenever one or more whitespace characters are encountered. Here's how it works:



// Let's break down the code snippet you provided:

// java
// Copy code
// int lastIndex = fullName.lastIndexOf(' ');
// if (lastIndex != -1) {
//     return fullName.substring(lastIndex + 1);
// }
// Here's how it works:

// lastIndexOf(' '): This method is called on the fullName string to find the index of the last occurrence of the space character (' ')
// in the string. If no space character is found, it returns -1. The index returned represents the position of the last space character
// in the string.

// if (lastIndex != -1): This condition checks whether a space character was found in the fullName string. If lastIndex is not -1, 
// it means that at least one space character exists in the string.

// fullName.substring(lastIndex + 1): If a space character is found in the fullName string, this line extracts the substring 
// starting from the character right after the last space character (i.e., lastIndex + 1).
// This substring corresponds to the last name in the full name string.