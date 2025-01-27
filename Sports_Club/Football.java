public class Football extends SportsBranch {
    private int fieldSize;
    private double footballPrice;

    public Football(String sportsName,int minAge,int numberOfCoach,int fieldSize){
        super(sportsName, minAge,numberOfCoach);
        this.fieldSize = fieldSize;
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(int fieldSize) {
        this.fieldSize = fieldSize;
    }
    @Override
    public void showInfo() {
        System.out.println("Spor Dalı: " + getSportsName());
        System.out.println("Minimum Yaş: " + getMinAge());
        
    }
    
    @Override
    public void trainingInfo() {
        System.out.println( "Futbol antrenmanı: Pas çalışması,bireysel antrenman ve uzaktan şut antrenmanı gerçekleştirilecektir.");
        System.out.println("Antrenman yapacağınız saha " + fieldSize + " metrekare boyutundadır");
    }
    @Override
    public double calculationPrice() {
        this.footballPrice = 500.00; 
        
        return footballPrice;
    }

    @Override
    public void priceInfo() {
        double price=calculationPrice();
        System.out.println("Kaydınızın için aylık ödemeniz gereken toplam ücret: " + price + " TL'dir.");
        System.out.println("Spor kulübümüze ait hesaba ücretinizi ödemenizi rica ederiz.");
    }
}
