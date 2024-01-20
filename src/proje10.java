public class proje10{

    public static void main(String[] args) {
        int sayi = 2;
        int adet = 0;

        System.out.println("İlk 20 Asal Sayı:");

        while (adet < 20) {
            if (asalMi(sayi)) {
                System.out.print(sayi + " ");
                adet++;
            }
            sayi++;
        }
    }


    public static boolean asalMi(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
