import java.util.ArrayList;
import java.util.Random;

public class SavingCategory {

    public String wylosowanakategoria;

    public SavingCategory() {
        Random rand = new Random();
        ArrayList<String> kategorie = new ArrayList<String>();
        kategorie.add("Historia");
        kategorie.add("Programowanie");
        kategorie.add("Geografia");
        kategorie.add("Gry komputerowe");
        kategorie.add("Slawni afroamerykanie");
        kategorie.add("Mitologia grecka");
        kategorie.add("Anime");
        kategorie.add("Amogus");
        kategorie.add("Polski hip hop");
        kategorie.add("Liga legend");

        String wylosowana = kategorie.get(rand.nextInt((10 - 1) + 1));
        this.wylosowanakategoria = wylosowana;
    }

    public String getWylosowanakategoria() {
        return wylosowanakategoria;
    }

    public void setWylosowanakategoria(String wylosowanakategoria) {
        this.wylosowanakategoria = wylosowanakategoria;
    }

}
