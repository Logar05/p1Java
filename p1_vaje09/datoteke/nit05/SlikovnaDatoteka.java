public class SlikovnaDatoteka extends Datoteka{
    private String ime;
    private int sirina;
    private int visina;
    public SlikovnaDatoteka(String ime, int sirina, int visina) {
        this.ime = ime;
        this.sirina = sirina;
        this.visina = visina;
    }

    public int vrniH() {
        return this.visina;
    }
    public int vrniW() {
        return this.sirina;
    }
    public String vrniIme() {
        return this.ime;
    }

    //3wh+54
    @Override
    public int velikost() {
        return 3 * this.sirina * this.visina + 54;
    }
    @Override
    public String toString() {
        return String.format("%s [s %d x %d]", this.ime, this.sirina, this.visina);
    }

}
