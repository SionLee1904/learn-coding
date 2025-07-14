import java.util.Scanner;

public class Rep09vehicle1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      
        System.out.print("Enter number of cylinders (1~12): ");
        int cylinders = s.nextInt();
        System.out.print("Enter load capacity (1.0~10.0): ");
        double loadCapacity = s.nextDouble();
        System.out.print("Enter towing capacity (1.0~20.0): ");
        double towingCapacity = s.nextDouble();

        System.out.println("\nAll values are valid.");
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Towing Capacity: " + towingCapacity);
        System.out.println("Program ended.");

        s.close();
    }
}
