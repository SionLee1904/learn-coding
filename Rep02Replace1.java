import java.util.Scanner;


public class Rep02Replace1 {
	public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter a line of text.");
        String input = s.nextLine();
        
        System.out.println("You entered: " + input);
        
        s.close();
    }
}
