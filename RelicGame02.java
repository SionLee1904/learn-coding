import java.util.Scanner;
import java.util.Arrays;

public class RelicGame02 {
	static class Relic {
        int power;
        int Index;

        Relic(int power, int Index) {
            this.power = power;
            this.Index = Index;
        }
    }
	
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Relic[] relics = new Relic[7];
        
        System.out.print("Enter 7 relic powers: ");
        for (int i = 0; i < relics.length; i++) {
            int power = s.nextInt();
            relics[i] = new Relic(power, i);
        }

        Arrays.sort(relics, (a, b) -> b.power - a.power);
        System.out.println("Sorted relics (with original positions):");
        
        for (int i = 0; i < relics.length; i++) {
            System.out.println(relics[i].power + " (from " + relics[i].Index + ")");
        }
        s.close();
    }
}
