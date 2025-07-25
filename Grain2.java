import java.util.Scanner;

public class Grain2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("[step2] Enter an integer value k (Number of squares):\n");
        int k = s.nextInt();
        
        long total = 0;
        total = (long)(Math.pow(2, k) - 1);
        System.out.println("The number of grains placed on the board is " + total);
        s.close();
    }
}
