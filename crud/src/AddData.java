import java.util.Scanner;

public class AddData {
    public static UserData addData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Podaj e-mail: ");
        String email = sc.nextLine();

        System.out.print("Podaj rok urodzenia: ");
        String rokurodzenia = sc.nextLine();

        System.out.print("Podaj imie: ");
        String imie = sc.nextLine();

        System.out.print("Podaj nazwisko: ");
        String nazwisko = sc.nextLine();

        return new UserData(email, rokurodzenia, imie, nazwisko);
    }
}
