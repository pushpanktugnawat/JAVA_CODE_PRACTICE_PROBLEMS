/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/
/*
You need to take an integer input and then draw the pattern according to it. Say for example if you enter 5 then, the pattern should be like this-
           A
        C B A
     E D C B A
  G F E D C B A
I H G F E D C B A

Input Format
You will take an integer input n from stdin.

Constraints
1 <= n <= 26

Output Format
Your output should be the pattern according to the input which you had entered. 

*/

import java.io.*;
import java.util.*;
public class TechGigProblem42 {
    public static void main(String args[] ) throws Exception {

    	int i=5;

        for(int k=1;k<i*2;k+=2)
        {
            
            int l=k;
            String temp="";
            
            while(l!=0)
            {
               temp=temp.concat(String.valueOf((char)(64+l))+" ");
               
                l--;
            }
            System.out.println(temp);
        }

   }
}
