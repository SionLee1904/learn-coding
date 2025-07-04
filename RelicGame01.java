import java.util.Scanner;

public class RelicGame01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] relics = new int[7];
        
        System.out.printf("Enter 7 relic powers: ");
        for (int i = 0; i < relics.length; i++) {
            relics[i] = s.nextInt();
        }

        int max = relics[0];
        int Index = 0;

        for (int i = 1; i < relics.length; i++) {
            if (relics[i] > max) {
                max = relics[i];
                Index = i;
            }
        }

        System.out.println("Strongest relic power: " + max);
        System.out.println("Original index: " + Index);
        s.close();
    }
}
