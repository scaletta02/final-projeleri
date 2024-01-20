public class proje12 {
    public static void main(String[] args) {
        String input = "Programlama";
        printPattern(input);
    }

    public static void printPattern(String text) {
        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(text.charAt((j + i) % text.length()));
            }
            System.out.println();
        }
    }
}


