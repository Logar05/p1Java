
public class Kvadrat extends Pravokotnik {
    private int type = 2;
    public Kvadrat(int stranica) {
        super(stranica, stranica);
    }

    public int vrniTip() {
        return this.type;
    }

    @Override
    public String vrsta() {
        return "kvadrat";
    }

    @Override
    public String podatki() {
        return String.format("stranica = %d", this.vrniSirino());
    }
}
