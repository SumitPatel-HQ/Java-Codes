class Tester {
    public static boolean checkPalindrome(String str) {
        // Initialize two pointers: one at the start, one at the end of the string
        int left = 0;
        int right = str.length() - 1;
        
        // Check characters from both ends
        while (left < right) {
            // If characters do not match, it's not a palindrome
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            // Move pointers towards the center
            left++;
            right--;
        }
        
        // If all characters matched, it's a palindrome
        return true;
    }

    public static void main(String args[]) {
        String str = "Radar";  // Test with case-sensitive input
        if (checkPalindrome(str))
            System.out.println("The string is a palindrome!");
        else
            System.out.println("The string is not a palindrome!");
    }
}
