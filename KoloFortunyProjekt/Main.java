import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static int liczbagraczy = 0;
    public static int iloscrund;

    public static void main(String[] args) {

        // Powitanie i ustawienia

        Scanner sc = new Scanner(System.in);
        String losu = "upo";
        System.out.println("--------------------------");
        System.out.println("\nWitaj w grze koło fortuny\n");
        System.out.println("--------------------------");
        System.out.println("Wybierz liczbe graczy: ");
        System.out.println("--------------------------");
        liczbagraczy = sc.nextInt();

        // zabezpieczenie przed iloscia graczy za duza/za mala
        if (liczbagraczy > 4) {
            System.out.println("Podales za duza liczbe, ustawiono 4 graczy");
            liczbagraczy = 4;
        } else if (liczbagraczy < 2) {
            System.out.println("Podales za mala liczbe, ustawiono 2 graczy");
            liczbagraczy = 2;
        }
        System.out.println("--------------------------");
        System.out.println("Wybierz ilośc rund: ");
        iloscrund = sc.nextInt();

        // przypisywanie do konstruktorow itd
        PlayerPoints playerPoints = new PlayerPoints();
        Questions questions = new Questions();
        GameSettings gameSettings = new GameSettings(liczbagraczy, iloscrund);
        gameSettings.setLiczbagraczy(liczbagraczy);
        gameSettings.setIloscrund(iloscrund);

        // for ktory daje kolej jakiegoś gracza
        for (int i = 1; i <= gameSettings.getLiczbagraczy(); i++) {
            System.out.println("--------------------------");
            System.out.println("Tura gracza nr " + (i));

            // for ktory daje runde aktualna
            for (int zagranerundy = 1; zagranerundy <= gameSettings.getIloscrund(); zagranerundy++) {
                System.out.println("Runda nr " + zagranerundy);
                System.out.println("--------------------------");
                // while ktory losuje kategorie dopoki nie klikniesz L
                while (!losu.equals("L")) {

                    System.out.println("By zaczac losowac nacisnij L");
                    System.out.println("--------------------------");
                    losu = sc.next();
                    losu = losu.toUpperCase();

                    if (losu.equals("L")) {

                        // losowanie kategorii
                        SavingCategory savingCategory = new SavingCategory();
                        System.out.println("--------------------------");
                        System.out.println("Wylosowano kategorie: " + savingCategory.getWylosowanakategoria());
                        System.out.println("--------------------------");

                        String trudlosu = "upo";

                        // while ktory losuje trudnosc dopoki nie klikniesz E
                        while (!trudlosu.equals("E")) {

                            // losowanie trudnosci
                            System.out.println("Kliknij E zeby wylosować poziom trudnosci");
                            System.out.println("--------------------------");
                            trudlosu = sc.next();
                            trudlosu = trudlosu.toUpperCase();

                            if (trudlosu.equals("E")) {
                                PickingDifficulty pickingDifficulty = new PickingDifficulty();
                                // sciezki do plikow bedziesz wiedzial ocb ale sram komentarzami
                                String sciezka = "pytania/" + savingCategory.getWylosowanakategoria() + ".txt";
                                String sciezkaodp = "pytania/" + savingCategory.getWylosowanakategoria() + "Odp.txt";
                                try {
                                    // bierze ci tutaj konkretna linijke z pliku
                                    String pytanie = Files.readAllLines(Paths.get(sciezka))
                                            .get(pickingDifficulty.getDifficulty());
                                    // bierze ci tutaj konkretna linijke z pliku
                                    String odpowiedz = Files.readAllLines(Paths.get(sciezkaodp))
                                            .get(pickingDifficulty.getDifficulty());

                                    if (pickingDifficulty.getDifficulty() < 3) {
                                        questions.pytanieL();
                                        System.out.println(pytanie);
                                        System.out.println("--------------------------");
                                        System.out.println("Podaj odpowiedz: ");
                                        String odpowiedzuzyt = sc.next();
                                        odpowiedzuzyt = odpowiedzuzyt.toUpperCase();
                                        if (odpowiedzuzyt.equals(odpowiedz)) {
                                            System.out.println("--------------------------");
                                            System.out.println("Podales dobra odpowiedz");
                                            System.out.println("--------------------------");
                                            // dodawanie punktow graczowi
                                            playerPoints.punktygracza[i - 1] = playerPoints.punktygracza[i - 1] + 1;
                                        } else {
                                            System.out.println("--------------------------");
                                            System.out.println("Podales zla odpowiedz");
                                            System.out.println("--------------------------");

                                        }

                                    } else if (pickingDifficulty.getDifficulty() > 2
                                            && pickingDifficulty.getDifficulty() < 6) {

                                        questions.pytanieS();
                                        System.out.println(pytanie);
                                        System.out.println("--------------------------");
                                        System.out.println("Podaj odpowiedz: ");
                                        String odpowiedzuzyt = sc.next();
                                        odpowiedzuzyt = odpowiedzuzyt.toUpperCase();
                                        if (odpowiedzuzyt.equals(odpowiedz)) {
                                            System.out.println("Podales dobra odpowiedz");
                                            System.out.println("--------------------------");
                                            // dodawanie punktow graczowi
                                            playerPoints.punktygracza[i - 1] = playerPoints.punktygracza[i - 1] + 2;
                                        } else {
                                            System.out.println("Podales zla odpowiedz");
                                            System.out.println("--------------------------");
                                        }

                                    } else {

                                        questions.pytanieT();
                                        System.out.println(pytanie);
                                        System.out.println("--------------------------");
                                        // bierze ci tutaj konkretna linijke z pliku
                                        System.out.println("Podaj odpowiedz: ");
                                        System.out.println("--------------------------");
                                        String odpowiedzuzyt = sc.next();
                                        odpowiedzuzyt = odpowiedzuzyt.toUpperCase();
                                        if (odpowiedzuzyt.equals(odpowiedz)) {
                                            System.out.println("Podales dobra odpowiedz");
                                            System.out.println("--------------------------");
                                            // dodawanie punktow graczowi
                                            playerPoints.punktygracza[i - 1] = playerPoints.punktygracza[i - 1] + 3;
                                        } else {
                                            System.out.println("Podales zla odpowiedz");
                                            System.out.println("--------------------------");
                                        }

                                    }
                                } catch (IOException e) {
                                    System.out.println(e);
                                }

                            } else {
                                System.out.println("!---!---!---!---!---!---!");
                                System.out.println("Kliknales zly przyciks");
                                System.out.println("!---!---!---!---!---!---!");
                            }
                        }
                        // resetuje zmienna trudlosu zeby while dalej dzialal
                        trudlosu = "upo";
                    } else {
                        System.out.println("!---!---!---!---!---!---!");
                        System.out.println("Kliknales zly przyciks");
                        System.out.println("!---!---!---!---!---!---!");
                    }
                }
                // resetuje zmienna losu zeby while dalej dzialal
                losu = "upo";
            }
        }
        // Wyswietlanie tablicy wyników
        ScoreBoard.scoreBoard(playerPoints.punktygracza);
    }

}
