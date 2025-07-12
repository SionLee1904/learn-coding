import java.util.Scanner;

public class Rep08DiscountPolicy3 extends Rep08DiscountPolicy1 {
    private int n;  
    
    public Rep08DiscountPolicy3(int n) {
        this.n = n;
    }

    public double computeDiscount(int count, double itemCost) {
        int free = count / n;  
        double discount = free * itemCost;
        return discount;  
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the item cost: ");
        double itemCost = s.nextDouble();
        System.out.print("Enter item quantity: ");
        int count = s.nextInt();
        System.out.print("Enter the number N: ");
        int n = s.nextInt();
       
        Rep08DiscountPolicy3 discountPolicy = new Rep08DiscountPolicy3(n);
        double discount = discountPolicy.computeDiscount(count, itemCost);
        double total = count * itemCost;  
        double finalPrice = total - discount;  
        
        System.out.println("[Result]\nTotal before discount: " + total);
        System.out.println("Discount amount: " + discount);
        System.out.println("Final Price: " + finalPrice);
        s.close();
    }
}
