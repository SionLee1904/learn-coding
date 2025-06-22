import java.util.Scanner;


public class Rep04GuessingCode1 {
    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
        String input;
        System.out.print("비밀 코드 추측 게임에 오신 것을 환영합니다!\n");
        
        while (true) {
            System.out.print("5자리 숫자를 입력하세요: ");
            input = s.nextLine();
            
            if (input.matches("\\d{5}")) { 
                System.out.println("입력한 숫자: " + input);  
                break;  
            } 
            else {
                System.out.println("오류: 5자리 숫자만 입력 가능합니다.");
            }
        }
        
        s.close();  
    }
}
