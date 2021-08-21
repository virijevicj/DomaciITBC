package Nedelja;

import java.util.ArrayList;

public class Posta {
    private ArrayList<Poruka> poruke;

    /*Konstruktori*/

    public Posta(ArrayList<Poruka> poruke) {
        this.poruke = poruke;
    }
    /*Metode*/

    //Dodaje poruku p u poruke ako ona vec ne postoji (gledano u odnosu na id)
    public void add(Poruka p) {
        //TODO: Implement me
        poruke.add(p);
    }

    //Brise poruku p iz poruka ako ona postoji (gledano u odnosu na id)
    public void remove(Poruka p) {
        //TODO: Implement me
        int id = p.getId();
        for (Poruka msg : poruke) {
            if (id == msg.getId()) {
                poruke.remove(p);
            }
        }

    }

    //Ispisuje poruku p i ibrese je iz poruka, ako ona postoji (gledano u odnosu na id)
    public void send(Poruka p) {
        //TODO: Implement me
        int id = p.getId();
        for (Poruka msg : poruke) {
            if (id == msg.getId()) {
                System.out.println(p);
                poruke.remove(p);
            }
        }
    }

    //Menja tekst poruke
    public void change(Poruka p, String msg) {
        //TODO: Implement me
        p.setPoruka(msg);
    }

    // Vraca sumu poruke p ako ta poruka postoji u listi
    public int isplata(Poruka p) {
        //TODO: Implement me
        for(Poruka msg : poruke){
            if(msg.getPoruka().equals(p)){
                return p.getSuma();
            }
        }
        return 0;
    }


    // U konzoli ispisuje, ako je suma nenegativna:
    // {posiljalac} salje {suma} para {primalac}-u, uz poruku:
    // {poruka}
    // a ako je suma negativna:
    // {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
    // {poruka}
    // za svaki element iz liste!
    @Override
    public String toString() {
        String returnMsg = "";
        for(Poruka msg : poruke) {
            if (msg.getSuma() >= 0) {
                returnMsg = returnMsg + msg.getPosiljalac() + " salje " + msg.getSuma() + " para" + msg.getPrimalac() + "-u, uz poruku: \n" + msg.getPoruka();
            } else {
                returnMsg = returnMsg + msg.getPosiljalac() + " prima " + msg.getSuma() + " para od " + msg.getPrimalac() + "-a, uz poruku: \n" + msg.getPoruka();

            }
        }
        return returnMsg;
    }
}
