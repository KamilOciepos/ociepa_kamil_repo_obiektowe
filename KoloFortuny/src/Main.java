import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        ArrayList<String> kategorie = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String losu = "upo";
        Random rand = new Random();
        kategorie.add("Historia");
        kategorie.add("Programowanie");
        kategorie.add("Geografia");
        kategorie.add("Gry komputerowe");
        kategorie.add("Sławni afroamerykanie");
        kategorie.add("Mitologia grecka");
        kategorie.add("Anime");
        kategorie.add("Amogus");
        kategorie.add("Polski hip hop");
        kategorie.add("Liga legend");

        while(!losu.equals("L")) {
            System.out.println("By zacząc losować naciśnij L");
            losu = sc.next();
            losu = losu.toUpperCase();
            if (losu.equals("L")) {
                System.out.println("Wylosowano kategorie: " + kategorie.get(rand.nextInt((10 - 1) + 1)));
                System.out.println("Kliknij E żeby wylosować poziom trudności");

            } else {
                System.out.println("Kliknąłeś zły przyciks");
            }
        }
    }
}
