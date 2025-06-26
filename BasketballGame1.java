import java.util.Scanner;

public class BasketballGame1 {
	    private String team1Name;
	    private String team2Name;
	    private int team1Score;
	    private int team2Score;
	    private boolean gameFinished;

	    public BasketballGame1(String team1Name, String team2Name) {
	        this.team1Name = team1Name;
	        this.team2Name = team2Name;
	        this.team1Score = 0;
	        this.team2Score = 0;
	        this.gameFinished = false;
	    }

	    public void recordOnePoint(String team) {}
	    public void recordTwoPoints(String team) {}
	    public void recordThreePoints(String team) {}
	    public void finishGame() {}

	    public int getScore(String team) {
	        return 0;
	    }

	    public String getLeadingTeam() {
	        return null;
	    }

	    public static void main(String[] args) {
	        BasketballGame1 game = new BasketballGame1("Cats", "Dogs");
	        game.recordOnePoint("Cats");
	        game.recordTwoPoints("Dogs");
	        
	        int catsScore = game.getScore("Cats");
	        int dogsScore = game.getScore("Dogs");

	        System.out.println("Cats score: " + catsScore);
	        System.out.println("Dogs score: " + dogsScore);
	        System.out.println("Leading team: " + game.getLeadingTeam());
	        game.finishGame();
	    }
}
