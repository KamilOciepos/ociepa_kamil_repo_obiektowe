import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imie: ");
        String imie = scanner.nextLine();

        System.out.println("Podane imie to: " + imie);

        System.out.print("Podane imie czytane wspak: ");
        for (int i = imie.length() - 1; i >= 0 ; i--) {
            System.out.print(imie.charAt(i));
        }
        System.out.println("\n Spółgłoski: ");
        for (int i = 0; i < imie.length(); i++) {
            if (imie.charAt(i) == 'a' || imie.charAt(i) == 'e' || imie.charAt(i) == 'i' || imie.charAt(i) == 'o' || imie.charAt(i) == 'u'
                    || imie.charAt(i) == 'A' || imie.charAt(i) == 'E' || imie.charAt(i) == 'I' || imie.charAt(i) == 'O' || imie.charAt(i) == 'U') {
                System.out.print(imie.charAt(i));
            }
        }
    }
}