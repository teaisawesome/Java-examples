import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        
        HashMap<Character, Integer> characters = new HashMap<>();
        HashMap<Character, Integer> charactersS2 = new HashMap<>();
        
        for(char ch : s1.toCharArray()) {
            char c = Character.toLowerCase(ch);
            
            if(characters.containsKey(c)) {
                int value = characters.get(c);
                characters.put(c, value+1);
            }
            else {
                characters.put(c, 1);
            }
        }
        
        for(char ch2 : s2.toCharArray()) {
            char c = Character.toLowerCase(ch2);
            
            if(charactersS2.containsKey(c)) {
                int value = charactersS2.get(c);
                charactersS2.put(c, value+1);
            }
            else {
                charactersS2.put(c, 1);
            }
        }
        
        System.out.println(characters.equals(charactersS2)? "Anagrams" : "Not Anagrams");
        
    }
}
