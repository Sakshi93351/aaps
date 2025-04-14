public class ques20 {

    // Function to count numbers with unique digits
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1; // Only the number 0 is valid when n = 0
        }
        
        if (n > 10) {
            return 0; // It's impossible to have unique digits for numbers with more than 10 digits
        }
        
        int result = 9;  // First digit can be any number from 1 to 9
        int currentFactor = 9;  // The number of options for the second digit
        
        // Multiply by the available choices for each subsequent digit
        for (int i = 1; i < n; i++) {
            result *= currentFactor;
            currentFactor--;  // Reduce the number of choices for the next digit
        }
        
        // Add the numbers with fewer than n digits (count all numbers with unique digits up to n-1 digits)
        int count = 1;  // Count of valid numbers for 0 digits (which is just 1, the number 0)
        for (int i = 1; i <= n; i++) {
            count += result;
            result *= (9 - i);  // Calculate result for the next digit count
        }
        
        return result;
    }

    // Main method
    public static void main(String[] args) {
        int n = 3;  // Example: Count numbers with unique digits for 3 digits
        System.out.println("Count of numbers with unique digits for " + n + " digits: " + countNumbersWithUniqueDigits(n));
    }
}
