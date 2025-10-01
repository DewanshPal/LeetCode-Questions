package Strings;
// import java.util.Arrays;
class LeetCode1784 {
    public boolean checkOnesSegment(String s) {
        //this solution is based on counting the number of 0's
        // int Onecount = 0;
        int Zerocount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Zerocount == 0) {
                if (s.charAt(i) == '1') {
                    continue;
                } else {
                    Zerocount++;
                }
            } else {
                if (s.charAt(i) == '1') {
                    return false;
                }
            }
        }
        return true;
    }
}