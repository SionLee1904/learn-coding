import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class SpeciesDatabase02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String fileName = s.nextLine();

        ArrayList<Species> speciesList = new ArrayList<>();

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            while (true) {
                try {
                    Species species = (Species) in.readObject();
                    speciesList.add(species);
                } catch (EOFException e) {
                    break; 
                }
            }

            for (Species sp : speciesList) {
                System.out.println(sp);
            }

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        s.close();
    }
}
