import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Random rd = new Random(); // creating Random object

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz czy chcesz do tablicy czy do lista");
        System.out.println("1- Tablica");
        System.out.println("2- Lista");
        String wybor = sc.nextLine();

        if(wybor.equals("1")) {
            int[] tab = new int[10];
            for (int i = 0; i < tab.length; i++) {
                tab[i] = rd.nextInt(10+1); // storing random integers in an array
                System.out.println(tab[i]); // printing each array element
            }
        }else if(wybor.equals("2")){
            ArrayList<Integer> lista = new ArrayList<>();
            for(int i=0; i<10; i++) {
                lista.add(rd.nextInt(10+1));
                System.out.println(lista.get(i));
            }
        }else{
            System.out.println("Zły wybór");
        }
    }
}
