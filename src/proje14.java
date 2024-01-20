import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class proje14{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("İlk tarihi giriniz (GG.AA.YYYY): ");
        String ilkTarihStr = scanner.next();


        System.out.print("İkinci tarihi giriniz (GG.AA.YYYY): ");
        String ikinciTarihStr = scanner.next();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");


        LocalDate ilkTarih = LocalDate.parse(ilkTarihStr, formatter);
        LocalDate ikinciTarih = LocalDate.parse(ikinciTarihStr, formatter);


        long gunFarki = ikinciTarih.toEpochDay() - ilkTarih.toEpochDay();
        int yilFarki = ikinciTarih.getYear() - ilkTarih.getYear();
        int ayFarki = ikinciTarih.getMonthValue() - ilkTarih.getMonthValue();


        if (gunFarki < 0) {
            gunFarki *= -1;
        }


        System.out.println("Tarih farkı:");
        System.out.println("Gün: " + gunFarki);
        System.out.println("Ay: " + ayFarki);
        System.out.println("Yıl: " + yilFarki);

        scanner.close();
    }
}
