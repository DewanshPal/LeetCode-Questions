package Strings;
class Solution {
    public int lengthOfLastWord(String s) {
        String j = s.trim();
        int index=0;
        for(int i =j.length()-1 ; i>=0;i--)
        {
            if(j.charAt(i) == ' ')
            {
                index = i+1;
                break;
            }
        }

        return j.length()-index;
    }
}