public abstract class SportsBranch {
    private String SportsName;
    private int minAge;
    private int numberOfCoach;

    public abstract void trainingInfo();
    public abstract double calculationPrice();
    public abstract void priceInfo();

    public SportsBranch(String sportsName, int minAge, int numberOfCoach) {
        this.SportsName = sportsName; 
        this.minAge = minAge;
        this.numberOfCoach = numberOfCoach;
    }

    public String getSportsName() {
        return SportsName;
    }

    public void setSportsName(String sportsName) {
        this.SportsName = sportsName;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getNumberOfCoach() {
        return numberOfCoach;
    }

    public void setNumberOfCoach(int numberOfCoach) {
        this.numberOfCoach = numberOfCoach;
    }

    public void showInfo() {
        System.out.println("Spor branşı: " + SportsName);
        System.out.println("Bu spor branşına kaydolmanız için " + minAge + " yaşını doldurmanız gerekmektedir.");
    }
}
