import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SpeciesDatabase03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String inputFile = s.nextLine();
        System.out.print("Enter the output file name: ");
        String outputFile = s.nextLine();

        ArrayList<Species> speciesList = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(inputFile))) {
            while (true) {
                try {
                    Species species = (Species) in.readObject();
                    speciesList.add(species);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            s.close();
            return;
        }

        Collections.sort(speciesList, Comparator.comparing(Species::getName));

        System.out.println("\nSorted Species:");
        for (Species sp : speciesList) {
            System.out.println(sp);
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            for (Species species : speciesList) {
                out.writeObject(species);
            }
            System.out.println("Data successfully written to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        s.close();
    }
}
