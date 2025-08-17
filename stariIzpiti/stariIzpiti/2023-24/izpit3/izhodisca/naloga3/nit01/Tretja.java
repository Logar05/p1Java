
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--03: klici metode konec
04--06: klici metode zadnjiFilm
07--09: klici metode infoDovoljPogosto
10--12: klici metode sportVesDan

01, 04, 07, 10: ro"cno izdelani

Po potrebi lahko razred Tretja in njegove notranje razrede dopolnite z
lastnimi elementi (atributi, metodami in notranjimi razredi).
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // dopolnite, "ce "zelite metode testirati ro"cno
    }

    //=========================================================================

    public static abstract class Oddaja {
        private String naziv;
        private int trajanje;

        protected Oddaja(String naziv, int trajanje) {
            this.naziv = naziv;
            this.trajanje = trajanje;
        }

        public abstract String vrsta();

        public String vrniNaziv() {
            return this.naziv;
        }

        public int vrniTrajanje() {
            return this.trajanje;
        }

        @Override
        public String toString() {
            return String.format("%s | %s | %d", this.vrsta(), this.naziv, this.trajanje);
        }
    }

    //=========================================================================

    public static class Film extends Oddaja {
        public Film(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Film";
        }
    }

    //=========================================================================

    public static class Info extends Oddaja {
        public Info(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Info";
        }
    }

    //=========================================================================

    public static class Sport extends Oddaja {
        public Sport(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Sport";
        }
    }

    //=========================================================================

    public static class Program {
        private Oddaja[] oddaje;

        public Program(Oddaja[] oddaje) {
            this.oddaje = oddaje;
        }

        @Override
        public String toString() {
            return Arrays.toString(this.oddaje);
        }

        public Cas konec(Cas zacetek) {
            int skupnoMinute = 0;
            for(int i = 0; i < oddaje.length; i++) {
                skupnoMinute += oddaje[i].vrniTrajanje();
            }
            return zacetek.plus(0, skupnoMinute);
        }

        public Film zadnjiFilm() {
            Film last = null;
            for(int i = 0; i < oddaje.length; i++) {
                if(oddaje[i] instanceof Film) {
                    last = (Film)oddaje[i];
                }
            }
            return last;
        }

        public boolean infoDovoljPogosto(int maksRazmak) {
            int iXprve = -1;
            for(int i = 0; i < oddaje.length; i++) {
                if(oddaje[i] instanceof Info) {
                    iXprve = i;
                    break;
                }
            }
            int razmakVMin = 0;
            for(int i = iXprve + 1; i < oddaje.length; i++) {
                if(oddaje[i] instanceof Info == false) {
                    razmakVMin += oddaje[i].vrniTrajanje();
                    continue;
                }
                if(razmakVMin > maksRazmak) return false;
                razmakVMin = 0;
            }
            return true;
        }

        public static Program sportVesDan(String osnova, int trajanje) {
            int minuteVDnevu = 24 * 60;
            int counter = 1;
            Oddaja[] sportOddaje = new Oddaja[minuteVDnevu / trajanje];
            for(int i = 0; i < sportOddaje.length; i++) {
                sportOddaje[i] = new Sport(osnova + "_" + counter, trajanje);
                counter++;
            }
            Program sportni = new Program(sportOddaje);
            return sportni;
        }
    }
}
