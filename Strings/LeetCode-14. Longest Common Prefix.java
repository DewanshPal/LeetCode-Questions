package Strings;
import java.util.Arrays;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        //intution used is what is prefix and comparing each string with the prefix
        //1st approach
        //time complexity is O(m*n)
        // if (strs == null || strs.length == 0) return "";
        // int n = 500;
        // for(int i =0 ; i<strs.length;i++)
        // {
        //     //find the smallest length of a string
        //     if(strs[i].length()<n)
        //     {
        //         n = strs[i].length();
        //     }
        // }
        // String prefix = strs[0];
        // for(int i=1 ; i<strs.length;i++)
        // {
        //     String s = strs[i];
        //     StringBuilder sb = new StringBuilder();
        //     for(int j =0 ; j<n ; j++)
        //     {
        //         if(prefix.isEmpty() || s.charAt(j) != prefix.charAt(j))
        //         {
        //             break;
        //         }
        //         sb.append(prefix.charAt(j));
        //     }
        //     prefix = sb.toString();
        //     n = prefix.length();
        // }

        // return prefix;

        //2nd approach using sorting
        int len=strs.length;
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[len-1];
        int idx=0;

        while(idx<first.length() && idx < last.length()){
            if(first.charAt(idx)==last.charAt(idx)){
                idx++;
            }
            else{
                break;
            }
        }

        return last.substring(0,idx);

        //it can also be done using trie data structure
    }
}