import java.util.Scanner;

public class BasketballGame3 {
    private String team1Name;
    private String team2Name;
    private int team1Score;
    private int team2Score;
    private int team1Count;
    private int team2Count;
    private boolean gameFinished;

    public BasketballGame3(String team1Name, String team2Name) {
    	if (!isValidTeam(team1Name)) {
            throw new IllegalArgumentException("팀 이름은 null이거나 빈 문자열일 수 없습니다.");
        }
        if (!isValidTeam(team2Name)) {
            throw new IllegalArgumentException("팀 이름은 null이거나 빈 문자열일 수 없습니다.");
        }        this.team1Name = team1Name;
        this.team2Name = team2Name;
        this.team1Score = 0;
        this.team2Score = 0;
        this.team1Count = 0;
        this.team2Count = 0;
        this.gameFinished = false;
    }
    
    private boolean isValidTeam(String team) {
    	return team != null && !team.trim().isEmpty();
    }
    
    public void recordPoints(String team, int points) {
        if (gameFinished) return;
        if (points != 1 && points != 2 && points != 3) {
            System.out.println("유효하지 않은 점수입니다. 1, 2, 또는 3만 허용됩니다.");
            return;
        }
        if (team.equals(team1Name)) {
            team1Score += points;
            team1Count++;
        } else if (team.equals(team2Name)) {
            team2Score += points;
            team2Count++;
        }
        printStatus();
        if (team1Count >= 4 && team2Count >= 4) {
            System.out.println("각 팀이 4번씩 득점하여 게임을 자동 종료합니다.");
            finishGame();
        }
    }

    public void finishGame() {
        gameFinished = true;
        System.out.println("게임 종료!");
        System.out.printf("최종 결과: %s %d, %s %d; ", team1Name, team1Score, team2Name, team2Score);
        if (team1Score > team2Score) {
            System.out.printf("%s이(가) 승리했습니다.\n", team1Name);
        } else if (team2Score > team1Score) {
            System.out.printf("%s이(가) 승리했습니다.\n", team2Name);
        } else {
            System.out.println("무승부!");
        }
    }

    public void printStatus() {
        System.out.printf("%s %d, %s %d; ", team1Name, team1Score, team2Name, team2Score);
        if (team1Score > team2Score) {
            System.out.printf("%s이(가) 우세합니다.\n", team1Name);
        } else if (team2Score > team1Score) {
            System.out.printf("%s이(가) 우세합니다.\n", team2Name);
        } else {
            System.out.println("동점입니다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BasketballGame3 game = new BasketballGame3("Cats", "Dogs");

        System.out.println("경기가 시작되었습니다: Cats vs Dogs");
        System.out.println("득점 입력 형식: <팀> <점수> (예: a 1 또는 b 2)");
        System.out.println("게임을 종료하려면 'finish'를 입력하세요.");

        while (!game.gameFinished) {
            System.out.print("Enter a score: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("finish")) {
                game.finishGame();
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("잘못된 입력 형식입니다. <팀> <점수> 형식으로 입력해주세요.");
                continue;
            }
            String teamInput = parts[0];
            String scoreInput = parts[1];

            String team = null;
            if (teamInput.equalsIgnoreCase("a")) {
                team = "Cats";
            } else if (teamInput.equalsIgnoreCase("b")) {
                team = "Dogs";
            } else {
                System.out.println("유효하지 않은 팀입니다. a 또는 b를 입력해주세요.");
                continue;
            }

            try {
                int points = Integer.parseInt(scoreInput);
                game.recordPoints(team, points);
            } catch (NumberFormatException e) {
                System.out.println("점수는 숫자여야 합니다.");
            }
        
        }

        scanner.close();
        }
}
