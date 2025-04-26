public class ques20 {

    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1; 
        }
        
        if (n > 10) {
            return 0; 
        }
        
        int result = 9;  
        int currentFactor = 9;  
        
        for (int i = 1; i < n; i++) {
            result *= currentFactor;
            currentFactor--;  
        }
        
        int count = 1;  
        for (int i = 1; i <= n; i++) {
            count += result;
            result *= (9 - i);  
        }
        
        return result;
    }

    public static void main(String[] args) {
        int n = 3;  
        System.out.println("Count of numbers with unique digits for " + n + " digits: " + countNumbersWithUniqueDigits(n));
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)
