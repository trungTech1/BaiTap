package BaiTap11;

public class FootballTeam {
    int id;
    String name;
    int numberOfPlayers;
    int score;

    public FootballTeam(int id, String name, int numberOfPlayers, int score) {
        this.id = id;
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.score = score;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    public int getScore() {
        return score;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
    public void setScore(int score) {
        this.score = score;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Number of players: " + numberOfPlayers + ", Score: " + score;
    }
}
