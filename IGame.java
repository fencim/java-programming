
public interface IGame {
    String getName();
    void registerTeam(ITeam team);
    void setPlayerScore(String playerAlias, int score);
    void printTopTeams();
    void printTeams();
}
