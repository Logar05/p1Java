public class BesedilnaDatoteka extends Datoteka{
    private String ime;
    private int stZnakov;
    public BesedilnaDatoteka(String ime, int stZnakov) {
        this.ime = ime;
        this.stZnakov = stZnakov;
    }

    @Override
    public int velikost() {
        return stZnakov;
    }

    public String vrniIme() {
        return this.ime;
    }

    @Override
    public String toString() {
        return String.format("%s [b %d]", this.ime, this.stZnakov);
    }
    
}
