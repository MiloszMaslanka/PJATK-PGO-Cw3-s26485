import java.util.Objects;

public class KlientKawiarni {
    private int idKlienta;
    private String imie;
    private String nazwisko;
    private String email;

    public KlientKawiarni(int idKlienta, String imie, String nazwisko, String email) {
        this.idKlienta = idKlienta;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public int getIdKlienta() {
        return idKlienta;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public String pobierzPelneDane() {
        return imie + " " + nazwisko + " (" + email + ")";
    }

    @Override
    public String toString() {
        return "KlientKawiarni{" +
                "idKlienta=" + idKlienta +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KlientKawiarni)) return false;
        KlientKawiarni that = (KlientKawiarni) o;
        return idKlienta == that.idKlienta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKlienta);
    }
}