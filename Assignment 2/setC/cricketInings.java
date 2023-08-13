import java.util.*;

class CricketPlayer {
    private int playerId;
    private String playerName;
    private int totalRuns;
    private int inningsPlayed;
    private int notOutTimes;

    public CricketPlayer(int pid, String pname, int totalRuns, int inningsPlayed, int notOutTimes) {
        playerId = pid;
        playerName = pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
    }

    public double calculateAverage() {
        if (inningsPlayed == 0) {
            return 0.0;
        }
        return (double) totalRuns / (inningsPlayed - notOutTimes);
    }

    public String getPlayerName() {
        return playerName;
    }

    public void displayDetails() {
        System.out.println("Player ID: " + playerId);
        System.out.println("Player Name: " + playerName);
        System.out.println("Total Runs: " + totalRuns);
        System.out.println("Innings Played: " + inningsPlayed);
        System.out.println("Not Out Times: " + notOutTimes);
        System.out.println("Average: " + calculateAverage());
    }
}

public class cricketInings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        
        CricketPlayer[] players = new CricketPlayer[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Player " + (i + 1) + ":");
            System.out.print("Player ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine();  // Consume the newline
            System.out.print("Player Name: ");
            String pname = scanner.nextLine();
            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();
            System.out.print("Innings Played: ");
            int inningsPlayed = scanner.nextInt();
            System.out.print("Not Out Times: ");
            int notOutTimes = scanner.nextInt();
            players[i] = new CricketPlayer(pid, pname, totalRuns, inningsPlayed, notOutTimes);
        }
        
        double maxAverage = -1.0;
        CricketPlayer maxAveragePlayer = null;
        
        for (CricketPlayer player : players) {
            double average = player.calculateAverage();
            if (average > maxAverage) {
                maxAverage = average;
                maxAveragePlayer = player;
            }
        }
        
        System.out.println("Player with Maximum Average:");
        maxAveragePlayer.displayDetails();
    }
}
