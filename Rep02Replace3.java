import java.util.Scanner;


public class Rep02Replace3 {
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        
        while (true) {
        System.out.println("Enter a line of text.");
        String input = s.nextLine();
        
        if (input.equalsIgnoreCase("quit")) {
            break;
        }
       
        String output = input.replaceFirst("(?i)hate", "love");
        System.out.println("I have rephrased that line to read:\n" + output);
       
    }
        s.close();
  }
}