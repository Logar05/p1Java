
import java.util.*;

public abstract class Lik implements Comparable <Lik> {
    public abstract int vrniTip();
    public abstract int ploscina();

    public abstract int obseg();

    public String toString() {
        return String.format("%s [%s]", this.vrsta(), this.podatki());
    }


    @Override
    public int compareTo(Lik drugiLik) {
        return this.ploscina() - drugiLik.ploscina();
    }

    public static Comparator<Lik> poObsegu() {
        return new primerjalnikPoObsegu();
    }

    private static class primerjalnikPoObsegu implements Comparator<Lik> {
        @Override
        public int compare(Lik a, Lik b) {
            return a.obseg() - b.obseg();
            //alternative: return Integer.compare(a.obseg(), b.obseg());
        }
    }

    private static class primerjalnikPoTipu implements Comparator <Lik> {
        @Override
        public int compare(Lik a, Lik b) {
            return a.vrniTip() - b.vrniTip();
        }
    }

    public static Comparator<Lik> poTipu() {
        return new primerjalnikPoTipu();
    }

    // Vrne vrsto lika  his> (npr. "pravokotnik").
    public abstract String vrsta();

    // Vrne niz s podatki o liku <this> 
    // (npr. "širina = 3.0, višina = 4.0").
    public abstract String podatki();

    public static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
        Comparator<Lik> prim1 = poTipu();
        Comparator<Lik> prim2 = poObsegu();
        Comparator<Lik> komp = Skupno.kompozitum(prim1, prim2);
        Skupno.uredi(vektor, komp);
    }

    public static void izpisi(Vektor<Lik> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 0;  i < stElementov;  i++) {
            Lik lik = vektor.vrni(i);
            System.out.printf("%s | p = %d | o = %d%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
    }
}
