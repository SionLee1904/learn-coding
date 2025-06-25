import java.util.Scanner;


public class Rep04GuessingCode3 {
    public static void main(String[] args) {

        String secretnum = "53840";

        Scanner s = new Scanner(System.in);
        String input;
        System.out.println("비밀 코드 추측 게임에 오신 것을 환영합니다!");
        System.out.println("총 5번의 기회가 주어집니다.");
        
        for (int chance = 1; chance <= 5; chance++) {
            while (true) {
            	System.out.print("기회 " + chance + " - 5자리 숫자를 입력하세요 : ");
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
            	System.out.println("결과" + chance + ": 일치하는 자리 수 = "+ correctcount + ", 합 = " + sumnumber);
                System.out.println("축하합니다! 정답을 맞추셨습니다.");
                break;  
            } 
            else {
            	System.out.println("결과" + chance + ": 일치하는 자리 수 = "+ correctcount + ", 합 = " + sumnumber);
            }
        }
        
        System.out.println("게임 종료! 비밀 코드는 " + secretnum + " 이었습니다.");
        s.close();
    }
}
