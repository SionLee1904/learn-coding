import java.io.*;
import java.util.Scanner;

public class SpeciesDatabase01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the input file name: ");
        String fileName = s.nextLine();

        Species[] speciesList = {
            new Species("Koala", 80000, 1.5),
            new Species("Panda", 1864, 1.1),
            new Species("Tiger", 3200, 1.2)
        };

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            for (Species species : speciesList) {
            	 out.writeObject(species);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        s.close();
    }
}
