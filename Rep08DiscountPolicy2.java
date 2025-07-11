import java.util.Scanner;

public class Rep08DiscountPolicy2 extends Rep08DiscountPolicy1 {
    private int minimum;     
    private double percent;   

    public Rep08DiscountPolicy2(int minimum, double percent) {
        this.minimum = minimum;
        this.percent = percent;
    }

    public double computeDiscount(int count, double itemCost) {
    	 if (count >= minimum) {
             double total = count * itemCost;
             return total - (total * (percent / 100.0));
         } 
    	 else {
             return count * itemCost;
         }
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the minimum: ");
        int minimum = s.nextInt();
        System.out.print("Enter the itemCost: ");
        double itemCost = s.nextDouble();
        System.out.print("Enter the discount percent: ");
        double percent = s.nextDouble();
        System.out.print("Enter item quantity: ");
        int count = s.nextInt();
        
        Rep08DiscountPolicy2 discountPolicy = new Rep08DiscountPolicy2(minimum, percent);
        double price = discountPolicy.computeDiscount(count, itemCost);
        
        System.out.println("Res: " + price);
        s.close();
    }
}
