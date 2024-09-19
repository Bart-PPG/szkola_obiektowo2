import java.util.ArrayList;

public class Szkola {
    /*
    Singleton dozwolony tylko jeden obiekt tej klasy
     */
    private String nazwa;
    private static Szkola szkola = new Szkola();
    private ArrayList<Uczen> uczniowie = new ArrayList<>();
    private ArrayList<Klasa> klasy = new ArrayList<>();

    private Szkola() {
        //prywatny konstruktor dostepny tylko w tej klasie
    }
    public static Szkola getSzkola(){
        return szkola;
    }
    public void dodajUczniaDoSzkoly(String imie,String nazwisko, int wiek){
        Uczen uczen = new Uczen(imie,nazwisko);
        uczniowie.add(uczen);
    }
    public void dodajKlase(String nazwa){
        klasy.add(new Klasa(nazwa));
    }
    public void dodajKlase(Klasa klasa){
       klasy.add(klasa);
    }
    public void  dodajUczniaDoKlasy(Uczen uczen, Klasa klasa){
        klasa.dodajUczniaDoKlasy(uczen);
    }
}
