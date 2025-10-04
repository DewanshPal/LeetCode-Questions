
class Solution {
    public boolean isValid(String s) {

        if(s.length()%2 != 0) return false;
        char[] arr = s.toCharArray();
        char[] checker = new char[arr.length];
        int top=0;
        for(int i=0 ; i<arr.length;i++)
        {
            if(arr[i] == '(' || arr[i] == '{' || arr[i] == '[')
            {
                checker[top++] = arr[i];
            } else if(arr[i] == '}')
            {
                if(top == 0 || checker[--top] != '{') return false;
            } else if(arr[i] == ']')
            {
                if(top == 0 || checker[--top] != '[') return false;
            } else if(arr[i] == ')')
            {
                if(top == 0 || checker[--top] != '(') return false;
            }
        }

        return top == 0;
    }
}
