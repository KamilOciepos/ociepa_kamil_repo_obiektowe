public class InfoShow {

    public static void menuShow() {
        System.out.println("Wybierz opcje z ponizszych:\n" +
                "1 - Zacznij gre \n" +
                "2 - Wyjdz");
    }

    public void optionsShow() {
        System.out.println("Wybierz opcje z ponizszych \n" +
                "[S] - Stand (czekanie) \n" +
                "[H] - Hit (dobieranie) \n" +
                "[P] - Split (podzielenie) \n" +
                "[W] - Auto Win (wygrana) \n " +
                "[F] - Poddanie");
    }

    public void missingOptions() {
        System.out.println("Brak opcji");
    }
}
