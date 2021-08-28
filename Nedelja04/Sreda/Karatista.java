import java.util.Arrays;
import java.util.Random;

public class Karatista {
    String ime;
    int godine;
    String rang;
    String[] kata;

    public Karatista(String ime, int godine, String rang, String[] kata) {
        this.ime = ime;
        if(godine > 0 ){
            this.godine = godine;
        }
        else{
            System.out.println("godine moraju biti pozitivna vrednost");
        }
        this.rang = rang;
        this.kata = kata;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if(godine > 0 ){
            this.godine = godine;
        }
        else{
            System.out.println("godine moraju biti pozitivna vrednost");
        }
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String[] getKata() {
        return kata;
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }

    public String napadni(int indeks){
        return "Karatista " + ime + " napada sa " + kata[indeks] + " katom.";
    }

    public String vatreniNapad(){
        int max = kata.length;
        int indeks = (int)(Math.random() * max);
        return "Karatista " + ime + " napada sa " + kata[indeks] + " katom.";
    }

    public void log(){
        String kate = "[";
        System.out.println("Karatista: " + ime + ", " + godine + ", " + rang + " - zna naredne kate " + kata);
    }
}
