public class Main {
    public static void main(String[] args) {

        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen = new Uczen("Daniel","Nowy");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen2 = new Uczen("Daniel","Nowa");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        Uczen uczen3 = new Uczen("Danielo","Stary");
        System.out.println("Liczba uczniow"+Uczen.liczbaObiektow);
        System.out.println(uczen3);

            Nauczyciel nauczycielSlowik = new Nauczyciel("Marlena","Slowik", 30,"Matematyka");
        System.out.println(nauczycielSlowik);
        nauczycielSlowik.wykonajDyzur();
        uczen2.wykonajDyzur();

        Klasa klasa3a = new Klasa("3A_programisci",nauczycielSlowik);
        klasa3a.dodajUczniaDoKlasy(uczen);
        klasa3a.dodajUczniaDoKlasy(uczen2);
        klasa3a.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa3a);
    }
}