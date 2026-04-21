import java.util.ArrayList;

public class Zamowienie {
    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer = 1;

    public Zamowienie(KlientKawiarni klient) {
        this.numerZamowienia = kolejnyNumer;
        kolejnyNumer++;
        this.klient = klient;
        this.produkty = new ArrayList<>();
        this.oplacone = false;
    }

    public void dodajProdukt(ProduktMenu produkt) {
        produkty.add(produkt);
    }

    public double policzWartosc() {
        double suma = 0.0;
        for (ProduktMenu produkt : produkty) {
            suma += produkt.getCena();
        }
        return suma;
    }

    public int policzLiczbeProduktow() {
        return produkty.size();
    }

    public void oznaczJakoOplacone() {
        this.oplacone = true;
    }

    public static int pobierzKolejnyNumer() {
        return kolejnyNumer;
    }

    @Override
    public String toString() {
        StringBuilder listaProduktow = new StringBuilder();

        for (ProduktMenu produkt : produkty) {
            listaProduktow.append("\n - ")
                    .append(produkt.getNazwa())
                    .append(" (")
                    .append(produkt.getCena())
                    .append(" zł)");
        }

        return "Zamowienie{" +
                "numerZamowienia=" + numerZamowienia +
                ", klient=" + klient.pobierzPelneDane() +
                ", oplacone=" + oplacone +
                ", liczbaProduktow=" + produkty.size() +
                ", produkty=" + listaProduktow +
                "\n}";
    }
}