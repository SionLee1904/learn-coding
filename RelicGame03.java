import java.util.Scanner;
import java.util.Arrays;

public class RelicGame03 {
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
        System.out.printf("Sorted relics: ");
        
        for (int i = 0; i < relics.length; i++) {
            System.out.printf("%d ", relics[i].power);
        }
        
        System.out.print("\nGuess the original index of the strongest relic: ");
        int guess = s.nextInt();
        int correct = relics[0].Index;

        if (guess == correct) {
            System.out.println("Correct! You know the relics well.");
        } 
        else {
            System.out.println("Incorrect. The strongest relic was originally at position " + correct + ".");
        }
        s.close();
    }
}
