import java.util.Scanner;

public class ChooseBranch{
    public ChooseBranch() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hangi branş için kayıt oluşturmak istersiniz?");
        System.out.println("1-Basketbol 2-Futbol 3-Tekvando");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
            Basketball basketball = new Basketball("Basketbol", 10, 3, 20);
        
            System.out.println("\n--- Basketbol Bilgileri ---");
            basketball.showInfo();
            basketball.trainingInfo();
            basketball.calculationPrice();
            basketball.priceInfo();
            break;
        
            case 2:
            Football football = new Football("Futbol", 10, 5, 90); 
            System.out.println("--- Futbol Bilgileri ---");
            football.showInfo();
            football.trainingInfo();
            football.calculationPrice();
            football.priceInfo();
            break;

            case 3:
            System.out.println("Tekvando ekipmanınız var mı? (true/false): ");
            boolean taekwondoEquipment = scanner.nextBoolean(); 
            Taekwondo taekwondo = new Taekwondo("Taekwondo", 10, 2, taekwondoEquipment);
            System.out.println("--- Tekvando Bilgileri ---");
            taekwondo.showInfo();
            taekwondo.trainingInfo();
            taekwondo.calculationPrice();
            taekwondo.priceInfo();
            break;

            default:
            System.out.println("Yanlış bir değer girdiniz. Kayıt oluşturulamadı. Lütfen tekrar deneyiniz.");
            System.exit(0); 
            break;
        }
    }


}