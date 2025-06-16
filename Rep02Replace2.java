import java.util.Scanner;


public class Rep02Replace2 {
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a line of text.");
        
        String input = s.nextLine();
        
        String lowerInput = input.toLowerCase();
        int index = lowerInput.indexOf("hate");
        System.out.println("First occurrence of \"hate\" is at index: " + index);
        
        s.close();
    }
}
