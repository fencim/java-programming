import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GameProgram implements IGame {
    public static void main(String[] args) {
        //Game
        //Players
        //Teams
        //Coach
        System.out.println("This program is a game scoring system");
        GameProgram myGame = new GameProgram("Our Game");
        
        myGame.loadFromFile("team-blue.txt");
        myGame.loadFromFile("team-red.txt");
        myGame.printTeams();

        myGame.setPlayerScore("001", 100);
        myGame.setPlayerScore("004", 199);
        
        myGame.printTopTeams();
                
    }
    GameProgram() {
        name = "Default Game";
    }
    GameProgram(String name) {
        this.name = name;
    }
    private String name;
    @Override
    public String getName() {
        return name;
    }

    ArrayList<ITeam> teams = new ArrayList<ITeam>();
    @Override
    public void registerTeam(ITeam team) {
        teams.add(team);        
    }

    @Override
    public void setPlayerScore(String playerAlias, int score) {
        for (ITeam team : teams) {
            for (IPlayer player : team.getPlayers()) {
                if (player.getAlias().equals(playerAlias)) {
                    player.setScore(score);
                }
            }
        }        
    }

    @Override
    public void printTopTeams() {
        ArrayList<ITeam> topTeams = new ArrayList<ITeam>(teams);
        for (int pass = 1; pass <= topTeams.size() - 1; pass++) {
            for (int i = 0; i < topTeams.size() - 1; i++) {
                if (topTeams.get(i).getTotalScore() < topTeams.get(i + 1).getTotalScore()) {
                    //swapping
                    ITeam temp = topTeams.get(i);
                    topTeams.set(i, topTeams.get(i + 1));
                    topTeams.set(i + 1, temp);
                }
            }
        }
        for (ITeam team : topTeams) {
            System.out.println("Team:" + team.getName() + " = " + team.getTotalScore());
        }
    }
    @Override
    public void printTeams() {
        for (ITeam team : teams) {
            team.printTeam();
        }
        
    }
    void loadFromFile(String filename) {
        Scanner in;
        try {
            in = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return;
        }
        String teamName = in.nextLine();
        Team team = new Team(teamName);
        if (in.hasNext()) {
            String alias = in.next();
            String fullName = in.next();
            String birthDate = in.next();
            Coach coach = new Coach(alias, fullName, birthDate);
            team.assignCoach(coach);
        }
        while (in.hasNext()) {
            String alias = in.next();
            String fullName = in.next();
            String birthDate = in.next();
            Player player = new Player(alias, fullName, birthDate);
            team.registerPlayer(player);
        }
        this.registerTeam(team);
    }
}
