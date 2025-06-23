import java.util.Scanner;


public class Rep04GuessingCode2 {
    public static void main(String[] args) {
    	
    	String secretnum = "53840";
    	
        Scanner s = new Scanner(System.in);
        String input;
        System.out.print("비밀 코드 추측 게임에 오신 것을 환영합니다!\n");
        
        while (true) {
            System.out.print("5자리 숫자를 입력하세요: ");
            input = s.nextLine();
            
            if (input.matches("\\d{5}")) {   
                break;  
            } 
            else {
                System.out.println("오류: 5자리 숫자만 입력 가능합니다.");
            }
        }
        
        int correctcount = 0;
        int sumnumber = 0; 

        for (int i = 0; i < 5; i++) {
            if (input.charAt(i) == secretnum.charAt(i)) {
                correctcount++;
                sumnumber += input.charAt(i) - '0';
            }
        }
        
        if (input.equals(secretnum)) {
            System.out.println("축하합니다! 정답을 맞추셨습니다.");
        } 
        else {
            System.out.println("추측 결과 : 일치하는 자리 수 = " + correctcount + ", 합 = " + sumnumber);
        }
        
        s.close();  
    }
}
