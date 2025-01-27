import java.util.ArrayList;
import java.util.Scanner;

public class Athlete {
    private int athleteNum;
    private String athleteName;
    private String athleteSurname;
    private int athleteAge;

    public Athlete(int athleteNum, String athleteName, String athleteSurname, int athleteAge) {
        this.athleteNum = athleteNum;
        this.athleteName = athleteName;
        this.athleteSurname = athleteSurname;
        this.athleteAge = athleteAge;
    }

    @Override
    public String toString() {
        return "Sporcu Numarası: " + athleteNum +
                "\nSporcu Adı: " + athleteName +
                "\nSporcu Soyadı: " + athleteSurname +
                "\nSporcu Yaşı: " + athleteAge;
    }

    public static void addAthlete(ArrayList<Athlete> athletes) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sporcunun numarasını giriniz: ");
        int athleteNum = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Sporcunun adını giriniz: ");
        String athleteName = scanner.nextLine();

        System.out.print("Sporcunun soyadını giriniz: ");
        String athleteSurname = scanner.nextLine();

        System.out.print("Sporcunun yaşını giriniz: ");
        int athleteAge = scanner.nextInt();

       
        SportsBranch branch = selectBranch(scanner, athleteAge);
        if (branch == null) {
            System.out.println("Kayıt işlemi başarısız.Tekrar deneyiniz.");
            return;
        }

       
        System.out.print("Sağlık raporunuz var mı? (true/false): ");
        boolean hasMedicalCertificate = scanner.nextBoolean();
        if (!hasMedicalCertificate) {
            System.out.println("Sağlık raporu olmayan sporcular kayıt olamaz! Lütfen sağlık raporu aldıktan sonra tekrar başvurunuz.");
            return;
        }

        
        Athlete newAthlete = new Athlete(athleteNum, athleteName, athleteSurname, athleteAge);
        athletes.add(newAthlete);

        System.out.println("\n--- Sporcu Bilgileri ---");
        System.out.println(newAthlete);
        System.out.println("\n--- Seçilen Branş Bilgileri ---");
        branch.showInfo();
        branch.trainingInfo();
        branch.priceInfo();

        System.out.println("\nKayıt işlemi başarıyla tamamlandı.");
    }

    private static SportsBranch selectBranch(Scanner scanner, int athleteAge) {
        System.out.println("\nHangi branşa kayıt olmak istiyorsunuz?");
        System.out.println("1 - Basketbol\n2 - Futbol\n3 - Tekvando");
        int choice = scanner.nextInt();

        SportsBranch branch = null;

        if (choice == 1) {
            branch = new Basketball("Basketbol", 10, 3, 10);
        } else if (choice == 2) {
            branch = new Football("Futbol", 10, 2, 500);
        } else if (choice == 3) {
            System.out.print("Tekvando ekipmanınız var mı? (true/false): ");
            boolean hasEquipment = scanner.nextBoolean();
            branch = new Taekwondo("Tekvando", 10, 1, hasEquipment);
        } else {
            System.out.println("Geçersiz seçim.");
        }

        if (branch != null && athleteAge < branch.getMinAge()) {
            System.out.println("Seçilen branş için minimum yaş sınırı: " + branch.getMinAge());
            branch = null;
        }

        return branch;
    }
}
