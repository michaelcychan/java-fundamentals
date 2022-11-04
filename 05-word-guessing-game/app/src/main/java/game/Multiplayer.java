package game;

public class Multiplayer {

    private Game game1;
    private Game game2;
    private Game current;
    private String name1;
    private String name2;

    public Multiplayer(Game game1, Game game2) {
        this.game1 = game1;
        this.game2 = game2;
        this.current = getRandomFirst();
    }

    public Game getRandomFirst(){
        if (Math.random() > 0.5) {
            return this.game1;
        } else {
            return this.game2;
        }
    }

    public void inputPlayerName(String name) {
        if (this.current == this.game1) {
            this.name1 = name;
        } else {
            this.name2 = name;
        }
    }

    public String getPlayername(){
        if (this.current == this.game1) {
            return this.name1;
        } else {
            return this.name2;
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

    public void changePlayer(){
        if (this.current == this.game1) {
            this.current = this.game2;
        } else {
            this.current = this.game1;
        }
    }
}
