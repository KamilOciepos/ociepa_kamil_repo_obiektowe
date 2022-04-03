import java.util.ArrayList;
import java.util.Random;

public class Lista implements Interface {
    @Override
    public int[] tab() {
        return null;
    }

    @Override
    public ArrayList<Integer> list() {
        ArrayList list = new ArrayList();
        Random rand = new Random();
        int wybor;
        for (int i = 0; i < 5; i++) {
            wybor = rand.nextInt(100);
            list.add(wybor);
            System.out.println(list);
        }
        return al;
    }
}