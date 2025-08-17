
/*
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static class Tocka {
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
            return this.y;
        }

        public double razdalja(Tocka druga) {
            return Math.sqrt((this.x - druga.vrniX()) * (this.x - druga.vrniX()) + (this.y - druga.vrniY()) * (this.y - druga.vrniY()));
        }
    }

    public static class Najdba {
        private String najditelj;
        private int cas;

        public Najdba(String najditelj, int cas) {
            this.najditelj = najditelj;
            this.cas = cas;
        }

        public String vrniNajditelja() {
            return this.najditelj;
        }

        public int vrniCas() {
            return this.cas;
        }
    }

    public static class Zaklad {
        private String id;
        private Tocka polozaj;
        private Najdba[] najdbe;

        public Zaklad(String id, Tocka polozaj, Najdba[] najdbe) {
            this.id = id;
            this.polozaj = polozaj;
            this.najdbe = najdbe;
        }

        public Tocka vrniPolozaj() {
            return this.polozaj;
        }

        public Najdba[] vrniNajdbe() {
            return this.najdbe;
        }

        public String[] najditelji() {
            String[] tab = new String[this.najdbe.length];
            for(int i = 0; i < tab.length; i++) {
                tab[i] = this.najdbe[i].vrniNajditelja();
            }
            return tab;
        }

        @Override
        public String toString() {
            return this.id;
        }
    }

    public static class Geolov {
        private Zaklad[] zakladi;

        public Geolov(Zaklad[] zakladi) {
            this.zakladi = zakladi;
        }

        public Zaklad[] vrniZaklade() {
            return this.zakladi;
        }

        public double pot(Tocka zacetna) {
            double xZ = zacetna.vrniX();
            double yZ = zacetna.vrniY();
            Tocka trenutna = new Tocka(xZ, yZ);
            double accum = 0;
            Tocka naslednja = null;
            for(int i = 0; i < this.zakladi.length; i++) {
                naslednja = this.zakladi[i].vrniPolozaj();
                accum += trenutna.razdalja(naslednja);
                trenutna = naslednja;
            }
            accum += zacetna.razdalja(this.zakladi[this.zakladi.length - 1].vrniPolozaj());
            return accum;
        }

        public Zaklad nazadnjeOdkrit() {
            int maxCas = 0;
            Zaklad najPoznejsi = null;
            for(int i = 0; i < this.zakladi.length; i++) {
                Najdba[] najdbe = this.zakladi[i].vrniNajdbe();
                if(najdbe == null || najdbe.length == 0) continue;
                int casPrve = najdbe[0].vrniCas();
                if(casPrve >= maxCas){
                    maxCas = casPrve;
                    najPoznejsi = this.zakladi[i];
                }
            }
            return najPoznejsi;
        }
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
