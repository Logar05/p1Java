
public class Premica {
    private double k;
    private double n;
    public Premica(double k, double n) {
        this.k = k;
        this.n = n;
    }

    public double vrniK() {
        return this.k;
    }

    public double vrniN() {
        // dopolnite/popravite ...
        return this.n;
    }

    public String toString() {
        return String.format("y = %.2f x + %.2f", this.k, this.n);
    }

    public Tocka tockaPriX(double x) {
        double y = this.k * x + this.n;
        return new Tocka(x, y);
    }

    public static Premica skoziTocko(double k, Tocka t) {
        double n = t.vrniY() - k * t.vrniX();
        return new Premica(k, n);
    }

    public Premica vzporednica(Tocka t) {
        return skoziTocko(this.k, t);
    }

    public Premica pravokotnica(Tocka t) {
        double newK = 1 / this.k;
        newK = newK * -1;
        return skoziTocko(newK, t);
    }

    public Tocka presecisce(Premica p, double epsilon) {
        if(Math.abs(this.k - p.vrniK()) < epsilon) return null;
        
        double pX = (p.vrniN() - this.n) / (this.k - p.vrniK());

        double pY = this.k * pX + this.n;
        return new Tocka(pX, pY);

    }

    public Tocka projekcija(Tocka t) {
        Premica pravokotnica = this.pravokotnica(t);
        Tocka proj = this.presecisce(pravokotnica, 0.001);
        return proj;
    }

    public double razdalja(Tocka t) {
        Tocka proj = this.projekcija(t);
        return proj.razdalja(t);
    }

    public double razdaljaOdIzhodisca() {
        Tocka iz = Tocka.izhodisce();
        return this.razdalja(iz);
    }

    public double razdalja(double n) {
        double x = 1.0;
        double y = this.k * x + n;
        Tocka T = new Tocka(x, y);
        return razdalja(T);
    }
}
