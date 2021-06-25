import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        // Input:
        // Each String will have a maximum of 10 alphabetic characters, 
        // and each integer will be in the inclusive range from 0 to 999.
    
        // Output:
        // ================================
        // java           100 
        // cpp            065 
        // python         050 
        // ================================
        Scanner sc=new Scanner(System.in);
        
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
