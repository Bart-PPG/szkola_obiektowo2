import java.util.ArrayList;

/**
 * Klasa reprezentuje
 */
public class Klasa {
    private String nazwaklasy;
    private ArrayList<Uczen> uczniowie;
    private Nauczyciel wychowawca;

    public Klasa(String nazwaklasy) {
        this.nazwaklasy = nazwaklasy;
        uczniowie = new ArrayList<>();
    }
    //-*/
    public Klasa(String nazwaklasy, Nauczyciel wychowawca) {
        this.nazwaklasy = nazwaklasy;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }
    public void dodajUczniaDoKlasy(Uczen uczen){
        if (uczniowie.contains(uczen)){
            System.out.println(uczen+"Uczen jest juz w klasie");
        }
        else {
            uczniowie.add(uczen);
        }
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "nazwaklasy='" + nazwaklasy + '\'' +
                ", wychowawca=" + wychowawca +
                ", uczniowie=" + uczniowie +
                '}';
    }
}
