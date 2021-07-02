import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        
        String word = scanner.nextLine();
        
        StringBuffer sb = new StringBuffer(word);
        
        System.out.println(word.equals(sb.reverse().toString()) ? "Yes" : "No");
    }
}
