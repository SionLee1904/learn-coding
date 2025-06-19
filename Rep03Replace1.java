import java.util.Scanner;


public class Rep03Replace1 {
	public static void main(String[] args) {
		
        Scanner s = new Scanner(System.in);
        
        System.out.print("첫번째 시간을 입력하세요 (HH:MM:SS): ");
        String time1 = s.nextLine();
        System.out.print("두번째 시간을 입력하세요 (HH:MM:SS): ");
        String time2 = s.nextLine();
       
        int time1_Result = convert_Time(time1);
        int time2_Result = convert_Time(time2);
        int diffInSeconds = time2_Result - time1_Result;

        int hours = diffInSeconds / 3600;
        int minutes = (diffInSeconds % 3600) / 60;
        int seconds = diffInSeconds % 60;

        System.out.println("경과된 시간은 " + hours + "시 " + minutes + "분 " + seconds + "초입니다.");
        s.close();
    }

    public static int convert_Time(String time) {
       
        int hours = Integer.parseInt(time.substring(0, 2));  
        int minutes = Integer.parseInt(time.substring(3, 5)); 
        int seconds = Integer.parseInt(time.substring(6, 8));  

        return hours * 3600 + minutes * 60 + seconds;
    }
}
