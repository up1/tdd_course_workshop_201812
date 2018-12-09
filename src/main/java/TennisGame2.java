public class TennisGame2 implements TennisGame {
    private static final int FORTY = 3;
    private final String player1Name;
    private final String player2Name;
    private int firstPlayerPoint;
    private int secondPlayerPoint;

    private String scoreOfFirstPlayer;
    private String scoreOfSecondPlayer;

    private String[] scoresText = new String[]{
            "Love", "Fifteen", "Thirty", "Forty"
    };

    TennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {

        if (firstPlayerPoint >= 4
                && secondPlayerPoint >= 0
                && (firstPlayerPoint - secondPlayerPoint) >= 2) {
            return "Win for " + this.player1Name;
        }
        if (secondPlayerPoint >= 4
                && firstPlayerPoint >= 0
                && (secondPlayerPoint - firstPlayerPoint) >= 2) {
            return "Win for " + this.player2Name;
        }

        if (firstPlayerPoint > secondPlayerPoint
                && secondPlayerPoint >= 3) {
            return "Advantage " + this.player1Name;
        }

        if (secondPlayerPoint > firstPlayerPoint
                && firstPlayerPoint >= 3) {
            return "Advantage " + this.player2Name;
        }

        if (isDeuce()) {
            return "Deuce";
        }

        if (isAll()) {
            return scoresText[firstPlayerPoint] + "-All";
        }

        return scoresText[firstPlayerPoint]
                + "-" + scoresText[secondPlayerPoint];
    }

    private boolean isAll() {
        return (firstPlayerPoint == secondPlayerPoint)
                && (firstPlayerPoint < 4);
    }

    private boolean isDeuce() {
        return firstPlayerPoint == secondPlayerPoint
                && firstPlayerPoint >= FORTY;
    }

    private void P1Score() {
        firstPlayerPoint++;
    }

    private void P2Score() {
        secondPlayerPoint++;
    }

    public void wonPoint(String player) {
        if (player.equals(this.player1Name)) {
            P1Score();
        } else {
            P2Score();
        }
    }
}