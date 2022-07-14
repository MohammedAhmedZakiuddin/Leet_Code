package com.mycompany.longesthappystring;

public class LongestHappyString 
{

    public static void main(String[] args) 
    {
        System.out.println(longestDiverseString(1,1,7));
    }
    
    public static String longestDiverseString(int a, int b, int c) 
    {
        StringBuilder str = new StringBuilder();
        
        // Total Length of the string
        int Total = a + b + c;
        // keep count of the string length
        int currA = 0, currB = 0, currC = 0;
        
        for(int i = 0;i < Total;i++)
        {
            if(a >= b && a >= c && currA!= 2 || a > 0 && (currB == 2 || currC == 2))
            {
                str.append("a");
                currA++;
                currB = 0;
                currC = 0;  
                a--;
            }
            else if(b >= a && b >= c && currB != 2 || b > 0 && (currA == 2 || currC == 2))
            {
                str.append("b");
                currB++;
                currA = 0;
                currC = 0;
                b--;
            }
            else if(c >= a && c >= b && currC != 2 || c > 0 && (currA == 2 || currB == 2))
            {
                str.append("c");
                currC++;
                currA = 0;
                currB = 0;
                c--;
            }
            else if(Total < 0)
            {
                return null;
            }
        }
        return str.toString();
    }
}
