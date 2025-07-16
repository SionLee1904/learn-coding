import java.util.Scanner;

class CylinderException extends Exception {
    public CylinderException(String message) {
        super(message);
    }
}

class LoadException extends Exception {
    public LoadException(String message) {
        super(message);
    }
}

class TowingException extends Exception {
    public TowingException(String message) {
        super(message);
    }
}

public class Rep09vehicle2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter number of cylinders (1~12): ");
            int cylinders = s.nextInt();
            if (cylinders < 1 || cylinders > 12) {
                throw new CylinderException("Error: Invalid: Cylinders must be between 1 and 12.");
            }

            System.out.print("Enter load capacity (1.0~10.0): ");
            double loadCapacity = s.nextDouble();
            if (loadCapacity < 1.0 || loadCapacity > 10.0) {
                throw new LoadException("Error: Invalid: Load capacity must be between 1.0 and 10.0.");
            }

            System.out.print("Enter towing capacity (1.0~20.0): ");
            double towingCapacity = s.nextDouble();
            if (towingCapacity < 1.0 || towingCapacity > 20.0) {
                throw new TowingException("Error: Invalid: Towing capacity must be between 1.0 and 20.0.");
            }

            System.out.println("\nAll values are valid.");
            System.out.println("Cylinders: " + cylinders);
            System.out.println("Load Capacity: " + loadCapacity);
            System.out.println("Towing Capacity: " + towingCapacity);   
        } 
        catch (CylinderException e) {
            System.out.println(e.getMessage());
        } 
        catch (LoadException e) {
            System.out.println(e.getMessage());
        } 
        catch (TowingException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Program ended.");
            s.close();
        }
    }
}
