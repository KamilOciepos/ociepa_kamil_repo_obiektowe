import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Losowanie implements Interface {
    @Override
    public int losowanie() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe zakresu (mniejsza)");
        int min = sc.nextInt();
        System.out.println("Podaj druga liczbe zakresu (wieksza)");
        int max = sc.nextInt();
        int los;
        System.out.println("Czy liczby mają sie powtarzać \n 1- jeśli tak \n 2- jeśli nie");
        int wybor = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        if (wybor == 1) {
            for (int i = 0; i < 10; i++) {
                los = rand.nextInt(max - min) + min;
                System.out.println(los);
            }
        } else {
            for (int i = a; i <= b; i++)
                lista.add(i);
            for (int i = 0; i < 10; i++) {
                int wynik = rand.nextInt(list.size() - 1);
                los = list.get(wynik);
                System.out.println(los);
                list.remove(wynik);

            }
        }
        return c;

    }

}
