
public class LeetCode1616 {
     public boolean checkPalindromeFormation(String a, String b) {
        return check(a,b) || check(b,a);
    }

    public boolean check(String s , int left , int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // Checks if combining a prefix of a and suffix of b can form a palindrome
    public boolean check(String a, String b) {
        int left = 0;
        int right = a.length() - 1;
        while (left < right && a.charAt(left) == b.charAt(right)) {
            left++;
            right--;
        }
        // After mismatch, check remaining inside a or b
        return check(a, left, right) || check(b, left, right);
    }
}
