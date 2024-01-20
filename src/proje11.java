import java.util.Random;
import java.util.Scanner;

public class proje11{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int kullaniciSkor = 0;
        int bilgisayarSkor = 0;
        int oyunSayisi = 0;

        while (kullaniciSkor < 3 && bilgisayarSkor < 3) {
            System.out.println("Taş (0), Kağıt (1), Makas (2) seçin: ");
            int kullaniciSecim = scanner.nextInt();

            if (kullaniciSecim < 0 || kullaniciSecim > 2) {
                System.out.println("Geçersiz seçim. Lütfen 0, 1 veya 2 girin.");
                continue;
            }

            int bilgisayarSecim = random.nextInt(3);

            System.out.println("Bilgisayarın seçimi: " + bilgisayarSecim);

            if (kullaniciSecim == bilgisayarSecim) {
                System.out.println("Berabere! Tekrar deneyin.");
            } else if ((kullaniciSecim == 0 && bilgisayarSecim == 2) ||
                    (kullaniciSecim == 1 && bilgisayarSecim == 0) ||
                    (kullaniciSecim == 2 && bilgisayarSecim == 1)) {
                System.out.println("Kullanıcı kazandı!");
                kullaniciSkor++;
            } else {
                System.out.println("Bilgisayar kazandı!");
                bilgisayarSkor++;
            }

            oyunSayisi++;
        }

        if (kullaniciSkor == 3) {
            System.out.println("Tebrikler! Kullanıcı oyunu kazandı.");
        } else {
            System.out.println("Üzgünüm! Bilgisayar oyunu kazandı.");
        }

        System.out.println("Oynanan oyun sayısı: " + oyunSayisi);

        scanner.close();
    }
}
