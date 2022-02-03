import java.util.Random;

class CardDraw {
    public static void carddraw() {
        String[] cardname = { "as", "król", "dama", "walet", "dziesięc", "dziewięć", "osiem", "siedem", "sześć", "pięć",
                "cztery", "trzy", "dwa" };
        String[] cardvalue = { "11", "10", "10", "10", "10", "9", "8", "7", "6", "5", "4", "3", "2" };

        int liczba1 = (int) (Math.random() * cardname.length + 1);
        int liczba2 = (int) (Math.random() * cardname.length + 1);
        int liczba3 = (int) (Math.random() * cardname.length + 1);
        String wylosowana[][] = { { cardname[liczba1], cardvalue[liczba1] },
                { cardname[liczba2], cardvalue[liczba2] }, { cardname[liczba3], cardvalue[liczba3] } };

    }
}