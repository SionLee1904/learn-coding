import java.util.Scanner;

public class Grain1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("[step1] Enter an integer value k (Number of squares):\n");
        int k = s.nextInt();

        long total = 0;
        long grain = 1;

        for (int i = 1; i <= k; i++) {
            total += grain;
            grain *= 2;
        }
        System.out.println("The number of grains placed on the board is " + total);
        s.close();
    }
}
