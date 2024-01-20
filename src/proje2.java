import java.util.Scanner;

public class proje2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Bir kelime girin: ");
        String kelime = scanner.nextLine();


        if (isPalindrome(kelime)) {
            System.out.println(kelime + " bir palindromdur.");
        } else {
            System.out.println(kelime + " bir palindrom değildir.");
        }

        scanner.close();
    }


    public static boolean isPalindrome(String kelime) {

        int uzunluk = kelime.length();


        int baslangic = 0;
        int son = uzunluk - 1;


        while (son > baslangic) {

            if (kelime.charAt(baslangic) != kelime.charAt(son)) {
                return false; // Palindrom değilse false döndür
            }


            baslangic++;
            son--;
        }

        return true; // Palindrom ise true döndür
    }
}

