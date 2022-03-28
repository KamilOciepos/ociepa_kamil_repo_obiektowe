import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        try {
            File file = new File("wzrost.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
