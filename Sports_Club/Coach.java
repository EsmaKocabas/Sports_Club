import java.util.ArrayList;
import java.util.Scanner;

public class Coach {
    private int coachNum;
    private String coachName;
    private String coachSpecialisation;

   
    public Coach(int coachNum, String coachName, String coachSpecialisation) {
        this.coachNum = coachNum;
        this.coachName = coachName;
        this.coachSpecialisation = coachSpecialisation;
    }

    
    public int getCoachNum() {
        return coachNum;
    }

    public String getCoachName() {
        return coachName;
    }

    public String getCoachSpecialisation() {
        return coachSpecialisation;
    }

    
    @Override
    public String toString() {
        return "Antrenörün numarası: " + coachNum + "\nAntrenörün adı ve soyadı: " + coachName + 
               "\nAntrenörün uzmanlık alanı: " + coachSpecialisation;
    }

    public static void addCoach(ArrayList<Coach> coaches) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Antrenörün numarasını giriniz: ");
            int coachNum = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Antrenörün adını ve soyadını giriniz: ");
            String coachName = scanner.nextLine();
            System.out.println("Antrenörün uzmanlık alanını giriniz: ");
            String coachSpecialisation = scanner.nextLine();

            
            Coach coach = new Coach(coachNum, coachName, coachSpecialisation);
            System.out.println("Antrenör bilgileri aşağıda listelenmiştir:");
            System.out.println(coach);

            System.out.println("Girdiğiniz bilgileri onaylıyor musunuz? (true/false): ");
            boolean input = scanner.nextBoolean();

            if (input) {
                coaches.add(coach);
                System.out.println("Antrenör başarıyla eklendi.");
            } else {
                System.out.println("Antrenör ekleme iptal edildi.");
            }

            
            System.out.println("Başka bir antrenör eklemek istiyor musunuz? (true/false): ");
            boolean continueInput = scanner.nextBoolean();
            if (!continueInput) {
                break;
            }
        }
    }

    
}
