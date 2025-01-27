import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<>();
        ArrayList<Coach> coaches = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n *** Spor Okulları Yönetim Sistemi *** ");
            System.out.println("1 - Sporcu Ekle");
            System.out.println("2 - Antrenör Ekle");
            System.out.println("3 - Sporcu Listesini Görüntüle");
            System.out.println("4 - Antrenör Listesini Görüntüle");
            System.out.println("5 - Spor Branşı Bilgilerini Görüntüle");
            System.out.println("6 - Çıkış");
            System.out.print("Lütfen bir seçim yapınız: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nSporcu ekleme işlemi yapılacaktır.");
                    Athlete.addAthlete(athletes);
                    break;
                case 2:
                    System.out.println("\nAntrenör ekleme işlemi yapılacaktır.");
                    Coach.addCoach(coaches);
                    break;
                case 3:
                    System.out.println("\n--- Sporcu Listesi ---");
                    if (athletes.isEmpty()) {
                        System.out.println("Kayıtlı sporcu yok.");
                    } else {
                        for (Athlete athlete : athletes) {
                            System.out.println(athlete);
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n--- Antrenör Listesi ---");
                    if (coaches.isEmpty()) {
                        System.out.println("Kayıtlı antrenör yok.");
                    } else {
                        for (Coach coach : coaches) {
                            System.out.println(coach);
                        }
                    }
                    break;
                case 5:
                    System.out.println("\n--- Spor Branşı Bilgileri ---");
                    new ChooseBranch(); 
                    break;
                case 6:
                    System.out.println("\nSistemden çıkılıyor. İyi günler!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nGeçersiz seçim. Lütfen tekrar deneyin.");
            }
        }
    }
}
