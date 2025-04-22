package NBA;

public class Nba {
    private String player;
    private String points;
    private String assists;
    private String rebounds;
    private String team;

    public Nba(String player, String points, String assists, String rebounds, String team) {
        this.player = player;
        this.points = points;
        this.assists = assists;
        this.rebounds = rebounds;
        this.team = team;
    }

    public String getPlayer() {
        return player;
    }

    public void updatePlayer(String player) {
        this.player = player;
    }

    public void updatePoints(String points) {
        this.points = points;
    }
    public void updateAssists(String assists) {
        this.assists= assists;
    }
    public void updateRebounds(String rebounds) {
        this.rebounds = rebounds;
    }
    public void updateTeam(String team) {
        this.team = team;
    }

    public void display(){
        System.out.println("Player: " + player + " Points: " + points + " Assists: " + assists + " Rebounds: " + rebounds + " Team: " + team);
    }
    @Override
    public String toString() {
        return "Nba{" +
                "player='" + player + '\'' +
                ", points='" + points + '\'' +
                ", assists='" + assists + '\'' +
                ", rebounds='" + rebounds + '\'' +
                ", team='" + team + '\'' +
                '}';
    }


}
