import java.util.Random;

public class PickingDifficulty {
    public int trudnosc;

    public PickingDifficulty() {
        Random rand = new Random();
        int wylosowana = rand.nextInt(9 - 1);

        this.trudnosc = wylosowana;
    }

    public int getDifficulty() {
        return trudnosc;
    }

    public void setDifficulty(int trudnosc) {
        this.trudnosc = trudnosc;
    }
}
