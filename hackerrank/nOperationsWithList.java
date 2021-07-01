import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        List<Integer> lista = new ArrayList<>();
        
        
        int countOfNumbers = scanner.nextInt();
        
        // list upload
        for(int i = 0; i < countOfNumbers; i++) {
            lista.add(scanner.nextInt());
        }
        
        int commandCount = scanner.nextInt();
        scanner.nextLine();
        
        for(int j = 0; j < commandCount; j++) {
            String currentCommand = scanner.nextLine();
            
            int index = scanner.nextInt();
            
            if(currentCommand.equals("Insert")) {
                int newNumber = scanner.nextInt();
                
                lista.add(index, newNumber);
            } else {
                lista.remove(index);
            }
            if(scanner.hasNext()) {
                scanner.nextLine();
            }
        }
        
        for(int n : lista) {
            System.out.print(n + " ");
        }
    }
}
