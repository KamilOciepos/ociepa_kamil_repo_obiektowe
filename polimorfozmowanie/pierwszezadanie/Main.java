import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Interfaces interfaces;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gdzie zapisać wpisz: \n tablica - do tablicy \n list - do arraylista ");
        String wybor = sc.next().toLowerCase();
        switch (wybor) {
            case "tablica":
                interfaces = new Tablica();
                interfaces.tab();
                break;

            case "list":
                interfaces = new Lista();
                interfaces.list();
                break;

            default:
                System.out.println("Wybrałeś złą rzecz");
                interfaces = null;
        }
    }
}