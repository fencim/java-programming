public class Player implements IPlayer {
    Player(String alias, String fullName, String birthDate) {
        this.alias = alias;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.score = 0;
    }
    private String alias;
    @Override
    public String getAlias() {
        return alias;
    }
    private String fullName;
    @Override
    public String getFullName() {
        return fullName;
    }
    private String birthDate;
    @Override
    public String getBirthDate() {
        return birthDate;
    }
    private int score;
    @Override
    public int getScore() {
        return score;
    }

    @Override
    public void setScore(int score) {
        this.score = score;
    }
    
}
