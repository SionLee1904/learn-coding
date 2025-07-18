import java.util.Scanner;

class CylinderException3 extends Exception {
    public CylinderException3(String message) {
        super(message);
    }
}

class LoadException3 extends Exception {
    public LoadException3(String message) {
        super(message);
    }
}

class TowingException3 extends Exception {
    public TowingException3(String message) {
        super(message);
    }
}

class Vehicle {
    private int cylinders;
    private double loadCapacity;
    private double towingCapacity;

    public Vehicle(int cylinders, double loadCapacity, double towingCapacity)
            throws CylinderException3, LoadException3, TowingException3 {

        if (cylinders < 1 || cylinders > 12) {
            throw new CylinderException3("Error: Invalid: Cylinders must be between 1 and 12.");
        }
        if (loadCapacity < 1.0 || loadCapacity > 10.0) {
            throw new LoadException3("Error: Invalid: Load capacity must be between 1.0 and 10.0.");
        }
        if (towingCapacity < 1.0 || towingCapacity > 20.0) {
            throw new TowingException3("Error: Invalid: Towing capacity must be between 1.0 and 20.0.");
        }

        this.cylinders = cylinders;
        this.loadCapacity = loadCapacity;
        this.towingCapacity = towingCapacity;
    }

    public void printInfo() {
        System.out.println("\nAll values are valid.");
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Load Capacity: " + loadCapacity);
        System.out.println("Towing Capacity: " + towingCapacity);
    }
}

public class Rep09vehicle3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter number of cylinders (1~12): ");
            int cylinders = s.nextInt();

            System.out.print("Enter load capacity (1.0~10.0): ");
            double loadCapacity = s.nextDouble();

            System.out.print("Enter towing capacity (1.0~20.0): ");
            double towingCapacity = s.nextDouble();

            Vehicle vehicle = new Vehicle(cylinders, loadCapacity, towingCapacity);
            vehicle.printInfo();
        } 
        catch (CylinderException3 e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } 
        catch (LoadException3 e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
        catch (TowingException3 e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } 
        catch (Exception e) {
            System.out.println("Invalid input format.");
            System.exit(1);
        } 
        finally {
        	s.close();
            System.out.println("Program ended.");
        }
    }
}
