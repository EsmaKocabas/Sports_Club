public class Basketball extends SportsBranch {
    private int numberOfAthlete;
    private double basketPrice;
    public Basketball(String sportsName,int minAge,int numberOfCoach,int numberOfAthlete){
        super(sportsName, minAge,numberOfCoach);
        this.numberOfAthlete = numberOfAthlete;
    }

    public int getNumberOfAthlete() {
        return numberOfAthlete;
    }

    public void setnumberOfAthlete(int numberOfAthlete) {
        this.numberOfAthlete = numberOfAthlete;
    }

    @Override
    public void trainingInfo() {
        System.out.println("Basketbol antrenmanı: 5x5 maç yaparak takım oyunu geliştirilir.");
    }
    @Override
    public double calculationPrice() {
        this.basketPrice = 750.00; 
        
        return basketPrice;
    }

    @Override
    public void priceInfo() {
        double price=calculationPrice();
        System.out.println("Kaydınızın için aylık ödemeniz gereken toplam ücret: " + price + " TL'dir.");
        System.out.println("Spor kulübümüze ait hesaba ücretinizi ödemenizi rica ederiz.");
    }
  
}
