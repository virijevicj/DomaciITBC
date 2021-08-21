package Nedelja;

public class Poruka {
    private String poruka;
    private String posiljalac;
    private String primalac;
    int suma;
    int id;

    public Poruka(String poruka, String posiljalac, String primalac, int suma, int id) {
        this.poruka = poruka;
        this.posiljalac = posiljalac;
        this.primalac = primalac;
        this.suma = suma;
        this.id = id;
    }

    public String getPoruka() {
        return poruka;
    }

    public void setPoruka(String poruka) {
        this.poruka = poruka;
    }

    public String getPosiljalac() {
        return posiljalac;
    }

    public void setPosiljalac(String posiljalac) {
        this.posiljalac = posiljalac;
    }

    public String getPrimalac() {
        return primalac;
    }

    public void setPrimalac(String primalac) {
        this.primalac = primalac;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // U konzoli ispisuje, ako je suma nenegativna:
    // {posiljalac} salje {suma} para {primalac}-u, uz poruku:
    // {poruka}
    // a ako je suma negativna:
    // {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
    // {poruka}
    public void posalji(){
        //TODO: Implement me
        if(suma >= 0) {
            System.out.println(posiljalac + " salje " + suma + " para" + primalac + "-u, uz poruku:");
            System.out.println(poruka);
        }
        else{
            System.out.println(posiljalac + " prima " + suma + " para od " + primalac + "-a, uz poruku:");
            System.out.println(poruka);
        }
    }

    // Ispisuje:
    // {posiljalac} i {prilamalac} vrse tranzakciju od {suma}, uz poruku: {poruka} ({id})

    @Override
    public String toString() {
        return posiljalac + " i " + primalac + " vrse transakciju od " + suma + ", uz poruka: " + poruka + "(" + id + ")";
    }
}
