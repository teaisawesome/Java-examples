import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        
        int count = scanner.nextInt();
        
        for(int i = 0; i < count;i++) {
            try {
                    long n = scanner.nextLong();
                    System.out.println(n + " can be fitted in:");
                    
                    if(n == (byte)n)
                        System.out.println("* byte");
                    if(n == (short)n)
                        System.out.println("* short");
                    if(n == (int)n)
                        System.out.println("* int");
                    if(n == (long)n)
                        System.out.println("* long");
            }
            catch(Exception e) {
                System.out.println(scanner.next() + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}
