import java.util.Scanner;

public class BasketballGame2 {
	    private String team1Name;
	    private String team2Name;
	    private int team1Score;
	    private int team2Score;
	    private boolean gameFinished;

	    public BasketballGame2(String team1Name, String team2Name) {
	    	if (!isValidTeam(team1Name)) {
	            throw new IllegalArgumentException("팀 이름은 null이거나 빈 문자열일 수 없습니다.");
	        }
	        if (!isValidTeam(team2Name)) {
	            throw new IllegalArgumentException("팀 이름은 null이거나 빈 문자열일 수 없습니다.");
	        }        
	        this.team1Name = team1Name;
	        this.team2Name = team2Name;
	        this.team1Score = 0;
	        this.team2Score = 0;
	        this.gameFinished = false;
	    }
	    
	    private boolean isValidTeam(String team) {
	    	return team != null && !team.trim().isEmpty();
	    }

	    public void recordOnePoint(String team) {
	        if (gameFinished) return;
	        if (team.equals(team1Name)) 
	            team1Score += 1;
	        else 
	            team2Score += 1;
	    }
	    
	    public void recordTwoPoints(String team) {
	        if (gameFinished) return;
	        if (team.equals(team1Name)) 
	            team1Score += 2;
	        else 
	            team2Score += 2;
	    }
	    
	    public void recordThreePoints(String team) {
	         if (gameFinished) return;
	         if (team.equals(team1Name)) 
	             team1Score += 3;
	         else 
	             team2Score += 3;
	    }
	    
	    public void finishGame() {
	    	gameFinished = true;
	    }

	    public int getScore(String team) {
	    	return team.equals(team1Name) ? team1Score : team2Score;
	    }

	    public String getLeadingTeam() {
	    	if (team1Score > team2Score) {
	            return team1Name;
	        } else if (team2Score > team1Score) {
	            return team2Name;
	        } else {
	            return "무승부!"; 
	        }
	    }

	    public static void main(String[] args) {
	        BasketballGame2 game = new BasketballGame2("Cats", "Dogs");
	        game.recordOnePoint("Cats");
	        game.recordTwoPoints("Dogs");
	        
	        int catsScore = game.getScore("Cats");
	        int dogsScore = game.getScore("Dogs");

	        System.out.println("Cats score: " + catsScore);
	        System.out.println("Dogs score: " + dogsScore);
	        System.out.println("Leading team: " + game.getLeadingTeam());
	        System.out.println("게임이 종료되어 점수를 추가할 수 없습니다.");
	        game.finishGame();
	    }
}
