/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.longesthappystring;

/**
 *
 * @author Mohammed Ahmed Zaki
 */

public class LongestHappyString 
{

    public static void main(String[] args) 
    {
        longestDiverseString(1, 1, 7);
    }
    
    public String longestDiverseString(int a, int b, int c) 
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
            else if(b > a && b > c && currB != 2 || a > 0 && (currB == 2 || currC == 2))
            {
                str.append("b");
                currB++;
                b--;
            }
            else if(c > a && c > b && currC != 2 || a > 0 && (currB == 2 || currC == 2))
            {
                str.append("c");
                currC++;
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
