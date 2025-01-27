public class Taekwondo extends SportsBranch {
    private boolean taekwondoEquipment; 
    private double taekwondoPrice; 

    public Taekwondo(String sportsName, int minAge, int numberOfCoach, boolean taekwondoEquipment) {
        super(sportsName, minAge, numberOfCoach); 
        this.taekwondoEquipment = taekwondoEquipment;
    }

    public boolean getTaekwondoEquipment() {
        return taekwondoEquipment;
    }

    public void setTaekwondoEquipment(boolean taekwondoEquipment) {
        this.taekwondoEquipment = taekwondoEquipment;
    }

    public double getTaekwondoPrice() {
        return taekwondoPrice;
    }

    public void setTaekwondoPrice(double taekwondoPrice) {
        this.taekwondoPrice = taekwondoPrice;
    }

 
    @Override
    public void trainingInfo() {
        System.out.println( " Tekvando antrenmanı: Takım antrenmanı ve ülke, il, ilçe, okul maçları için hazırlık antrenmanları gerçekleştirilecektir.");
    }

    
    @Override
    public double calculationPrice() {
        taekwondoPrice = 500.00; 
        if (!taekwondoEquipment) {
            taekwondoPrice += 200.00; //Ekipman yoksa kulüpten ekipman sağlanır ve kiralama ücreti alınır.
            System.out.println("Ekipmanınız kulübümüz tarafından sporcumuza sağlanacaktır. Aylık kiralama ücreti: 200 TL'dir.");
        }
        return taekwondoPrice;
    }

    @Override
    public void priceInfo() {
        System.out.println("Kaydınızın için aylık ödemeniz gereken toplam ücret: " + calculationPrice() + " TL'dir.");
        System.out.println("Spor kulübümüze ait hesaptan ücretinizi ödemenizi rica ederiz. İyi günler!");
    }
}
