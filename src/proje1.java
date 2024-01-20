import java.util.Random;
import java.util.Scanner;

public class proje1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rastgeleSayi = rand.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int tahmin;
        int denemeSayisi = 0;

        System.out.println("1 ile 100 arasında bir sayıyı tahmin edin.");

        do {
            System.out.print("Tahmininiz: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler! " + denemeSayisi + ". denemede doğru tahmin ettiniz.");
            } else {
                String ipucu = (tahmin < rastgeleSayi) ? "Daha büyük bir sayı girin." : "Daha küçük bir sayı girin.";
                System.out.println(ipucu);
            }
        } while (tahmin != rastgeleSayi);

        scanner.close();
    }
}
