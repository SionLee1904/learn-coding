import java.util.Scanner;

public class Grain3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("[step3] Enter an integer value k (Number of squares):\n");
        int k = s.nextInt();
        
        long total = getTotalGrains(k, 1);
       
        System.out.println("The number of grains placed on the board is " + total);
        s.close();
    }
    
    public static long getTotalGrains(int k, long grains) {
    	if(k == 1) {
    		return grains;
    	}
    	return grains + getTotalGrains(k - 1, grains * 2);	
    }
}
