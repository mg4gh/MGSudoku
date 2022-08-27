package sudoku.mg4gh.de;

public class GameResult {

    public long timestamp;
    public int points;
    public GameLevel gameLevel;
    public long secondsPlayed;
    public int difficulty;

    public GameResult(){}

    public GameResult(long timestamp, int points, GameLevel gameLevel, long secondsPlayed, int difficulty) {
        this.timestamp = timestamp;
        this.points = points;
        this.gameLevel = gameLevel;
        this.secondsPlayed = secondsPlayed;
        this.difficulty = difficulty;
    }
}
