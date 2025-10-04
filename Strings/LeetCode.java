
class Solution {
    public String mergeAlternately(String word1, String word2) {
        // StringBuilder sb = new StringBuilder();
        // int n1 = word1.length();
        // int n2 = word2.length();
        // int i=0;
        // while(i<n1+n2)
        // {
        //     if(i<n1)
        //     {
        //         sb.append(word1.charAt(i));
        //     }
        //     if(i<n2)
        //     {
        //         sb.append(word2.charAt(i));
        //     }
        //     i++; 
        // }
        // return sb.toString();

        //2nd approach
        int n = word1.length(), m = word2.length();
        char[] result = new char[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n || j < m) 
        {
            if (i < n) result[k++] = word1.charAt(i++);
            if (j < m) result[k++] = word2.charAt(j++);
        }
        
        return new String(result);
    }
}
