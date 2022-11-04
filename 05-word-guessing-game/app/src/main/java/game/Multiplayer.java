package game;

public class Multiplayer {

    private Game game1;
    private Game game2;
    private Game current;
    private Game winner;

    public Multiplayer(Game game1, Game game2) {
        this.game1 = game1;
        this.game2 = game2;
        this.current = getRandomFirst();
        this.winner = null;
    }

    public Game getRandomFirst(){
        if (Math.random() > 0.5) {
            return this.game1;
        } else {
            return this.game2;
        }
    }

    public String getPlayername(){
        if (this.current == this.game1) {
            return "Player 1";
        } else {
            return "Player 2";
        }
    }

    public Game getCurrent(){
        return this.current;
    }

    public Boolean gameEnds() {
        if (this.game1.getWinStatus() || this.game2.getWinStatus() || (this.game1.getRemainingAttempts() < 1 && this.game2.getRemainingAttempts() < 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void determineWinnder(){
        if (this.game1.getWinStatus()) {
            this.winner = this.game1;
        } else if (this.game2.getWinStatus()) {
            this.winner = this.game2;
        }
    }

    public void changePlayer(){
        if (this.current == this.game1) {
            this.current = this.game2;
        } else {
            this.current = this.game1;
        }
    }
}
