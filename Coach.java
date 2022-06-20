public class Coach implements ICoach {
    Coach(String alias, String fullName, String birthDate) {
        this.alias = alias;
        this.fullName = fullName;
        this.birthDate = birthDate;
        
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
    @Override
    public String getStatus() {
        return "Available";
    }
}
