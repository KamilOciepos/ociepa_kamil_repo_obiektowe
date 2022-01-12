public class UserData {
    private String email;
    private String rokurodzenia;
    private String imie;
    private String nazwisko;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRokurodzenia() {
        return rokurodzenia;
    }

    public void setRokurodzenia(String rokurodzenia) {
        this.rokurodzenia = rokurodzenia;
    }

    public UserData(String email, String rokurodzenia, String imie, String nazwisko) {
        this.email = email;
        this.rokurodzenia = rokurodzenia;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Email='" + email + '\'' + " Rok Urodzenia='" + rokurodzenia + '\'' + " Imie ='" + imie + '\''
                + " Nazwisko='" + nazwisko + '\'';
    }
}
