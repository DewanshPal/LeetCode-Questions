package Strings;
import java.util.HashMap;
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('V',5);
        map.put('L',50);
        map.put('D',500);
        map.put('M',1000);
        map.put('I',1);
        map.put('X',10);
        map.put('C',100);

        int sum=0;
        for(int i = 0 ; i < s.length(); i++)
        {
            
            if(i<s.length()-1 && s.charAt(i) == 'I')
            {
                if(s.charAt(i+1) == 'V')
                {
                    sum+=4;
                    i++;
                }
                else if(s.charAt(i+1) == 'X')
                {
                    sum+=9;
                    i++;
                }
                else
                {
                    sum+=1;
                }
            } else if(i<s.length()-1 && s.charAt(i) =='X')
            {
                if(s.charAt(i+1) == 'L')
                {
                    sum+=40;
                    i++;
                }
                else if(s.charAt(i+1) == 'C')
                {
                    sum+=90;
                    i++;
                }
                else
                {
                    sum+=10;
                }
            } else if(i<s.length()-1 && s.charAt(i) == 'C')
            {
                if(s.charAt(i+1) == 'D')
                {
                    sum+=400;
                    i++;
                }
                else if(s.charAt(i+1) == 'M')
                {
                    sum+=900;
                    i++;
                }
                else
                {
                    sum+=100;
                }

            }else
            {
                sum+=map.get(s.charAt(i));
            }
            
        }

        return sum;

        // 2nd approach(Optimized)
        // int result = 0;
        // int previous = 0;
        // for(int i=s.length()-1;i>=0;i--){
        //     int current = map.get(s.charAt(i));
        //     if(current < previous){
        //         result -= current;
        //     }else{
        //         result += current;
        //     }
        //     previous = current;
        // }
        // return result;
    }
}
