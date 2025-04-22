package NBA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NbaManager {
    List<Nba> players;
    Scanner scanner = new Scanner(System.in);

    public NbaManager() {
        this.players = new ArrayList<>();
    }
    public void display() {
        while (true) {
            System.out.println("\n=== NBA Players  ===");
            System.out.println("1. Add Player");
            System.out.println("2. View Player");
            System.out.println("3. Search Player");
            System.out.println("4. Update Player");
            System.out.println("5. Delete Player");
            System.out.println("6. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> addPlayer();
                case 2 -> viewPlayers();
                case 3 -> searchPlayer();
                case 4 -> updatePlayer();
                case 5 -> deletePlayer();
                case 6 -> {
                    System.out.println("Bye");
                    return;
                }

            }
        }
    }
    public void addPlayer(){
        System.out.println("Add Player: ");
        String player = scanner.nextLine();
        System.out.println("Add points: ");
        String points = scanner.nextLine();
        System.out.println("Add Assists: ");
        String assists = scanner.nextLine();
        System.out.println("Add Rebounds: ");
        String rebounds = scanner.nextLine();
        System.out.println("Add team: ");
        String team = scanner.nextLine();
        players.add(new Nba(player,points,assists,rebounds,team));
        System.out.println("Successfully added");
    }
    public void viewPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players added!!");
        } else {
            for (Nba player : players) {
                player.display();  // Using the display method of Nba class
            }
        }
    }
    public void searchPlayer(){
        System.out.print("Enter player name to search: ");
        String playe1r = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Nba player : players) {
            if (player.getPlayer().toLowerCase().contains(playe1r)) {
                player.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("No players found");
        }
    }
    public void updatePlayer(){
        if (players.isEmpty()){
            System.out.println("No players to update");
            return;
        }
        System.out.print("Enter player name to update: ");
        String name = scanner.nextLine().toLowerCase();
        for (Nba player : players) {
            if (player.getPlayer().toLowerCase().equals(name)) {
                System.out.print("Enter new player: ");
                player.updatePlayer(scanner.nextLine());
                System.out.print("Enter new points: ");
                player.updatePoints(scanner.nextLine());
                System.out.print("Enter new assists: ");
                player.updateAssists(scanner.nextLine());
                System.out.print("Enter new rebounds: ");
                player.updateRebounds(scanner.nextLine());
                System.out.print("Enter new team: ");
                player.updateTeam(scanner.nextLine());
                System.out.println("Player updated");
                return;
            }
        }


    }
    public void deletePlayer(){
        if (players.isEmpty()){
            System.out.println("No players to delete");
            return;
        }
        System.out.println("Provide the name of the player you would like to delete: ");
        String deletedName = scanner.nextLine();
        for (int i = 0; i < players.size(); i++){
            if (players.get(i).getPlayer().equals(deletedName)){
                players.remove(i);
                System.out.println("Successfully removed");
                return;
            }

        }
        System.out.println("No player found");

    }


    public static void main(String[] args) {
        NbaManager NBA = new NbaManager();
        NBA.display();
    }

}
