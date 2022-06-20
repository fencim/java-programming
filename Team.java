import java.util.ArrayList;

public class Team implements ITeam {
    Team(String name) {
        this.name = name;
    }
    private String name;
    @Override
    public String getName() {
        return name;
    }
    private ArrayList<IPlayer> players = new ArrayList<IPlayer>();
    @Override
    public void registerPlayer(IPlayer player) {
        players.add(player);        
    }

    @Override
    public ArrayList<IPlayer> getPlayers() {
        return players;
    }

    private ICoach coach;
    @Override
    public void assignCoach(ICoach coach) {
        this.coach = coach;
    }
    @Override
    public ICoach getCoach() {
        return coach;
    }
    @Override
    public int getTotalScore() {
        int total = 0;
        for (IPlayer player : players) {
            total += player.getScore();
        }
        return total;
    }

    @Override
    public void printTeam() {
        System.out.println("Team:" + getName());
        for (int i = 0; i < players.size(); i++) {
            System.out.println("(" + (i + 1) + ")" + players.get(i).getFullName() + " alias " + players.get(i).getAlias());
        }
    }    
}
