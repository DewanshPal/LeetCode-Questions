

public class Leetcode1668 {
    public int maxRepeating(String sequence, String word) {
        String tbf = word;
        int ans = 0;
        while(sequence.contains(tbf))
        {
            tbf += word;
            ans++;
        }
        return ans;
    }
}
