public class Palindrome {
    public int isPalindrome(int A) {
        if (A < 0) {
            return 0;
        }
        
        int reversedNumber = 0;
        int originalNumber = A;
        
        while (A != 0) {
            reversedNumber = reversedNumber * 10 + A % 10;
            A /= 10;
        }
        
        return reversedNumber == originalNumber ? 1 : 0;
    }
}
