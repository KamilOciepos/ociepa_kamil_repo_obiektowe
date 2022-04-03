import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Random rd = new Random(); // creating Random object

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj 1 liczbe zakresu");
        int min = Integer.parseInt(sc.nextLine());
        System.out.println("Podaj 2 liczbe zakresu");
        int max = Integer.parseInt(sc.nextLine());
            int[] tab = new int[10];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = (int) ((Math.random() * (max - min)) + min);
                System.out.println(tab[i]); // printing each array element
            }
    }
}