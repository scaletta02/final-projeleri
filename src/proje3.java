import java.util.Scanner;

public class proje3{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Yapmak istediğiniz işlemi seçiniz:");
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        int secim = scanner.nextInt();


        System.out.println("İlk sayıyı giriniz:");
        double sayi1 = scanner.nextDouble();

        System.out.println("İkinci sayıyı giriniz:");
        double sayi2 = scanner.nextDouble();


        switch (secim) {
            case 1:
                System.out.println("Toplama sonucu: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Çarpma sonucu: " + (sayi1 * sayi2));
                break;
            case 4:

                if (sayi2 != 0) {
                    System.out.println("Bölme sonucu: " + (sayi1 / sayi2));
                } else {
                    System.out.println("Sıfıra bölme hatası!");
                }
                break;
            default:
                System.out.println("Geçersiz işlem seçimi!");
        }


        scanner.close();
    }
}
