import java.util.ArrayList;
import java.util.Scanner;

public class DeleteData {
    public static void deleteData(ArrayList<UserData> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rekord do usuniecia. Liczba rekordow: " + list.size());
        int index = sc.nextInt() - 1;
        if (index >= 0 && index < list.size()) {
            UserData userData = list.get(index);
            System.out.println("Usunieto rekord nr: " + (index + 1));
            list.remove(userData);
        } else {
            System.out.println("Taki rekord nie istnieje");
        }
    }
}