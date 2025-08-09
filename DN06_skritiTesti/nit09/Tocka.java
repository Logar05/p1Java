
public class Tocka {
    private double x;
    private double y;
    public Tocka(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double vrniX() {
        return this.x;
    }

    public double vrniY() {
        // dopolnite/popravite ...
        return this.y;
    }

    public String toString() {
        // dopolnite/popravite ...
        return String.format("(%.2f, %.2f)", this.x, this.y);
    }

    // ustrezno dopolnite/popravite ...
    public static Tocka izhodisce() {
        Tocka izh = new Tocka(0, 0);
        return izh;
    }

    // ustrezno dopolnite/popravite ...
    public double razdalja(Tocka t) {
        return Math.sqrt((t.vrniX() - this.x) * (t.vrniX() - this.x) + (t.vrniY() - this.y) * (t.vrniY() - this.y));
    }

    // ustrezno dopolnite/popravite ...
    public double razdaljaOdIzhodisca() {
        Tocka izh = izhodisce();
        return this.razdalja(izh);
    }
}
