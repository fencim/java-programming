import java.util.ArrayList;

public interface ITeam {
    String getName();
    void registerPlayer(IPlayer player);
    ArrayList<IPlayer> getPlayers();
    void assignCoach(ICoach coach);
    ICoach getCoach();
    int getTotalScore();
    void printTeam();
}
