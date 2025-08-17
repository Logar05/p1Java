
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02, 03: ro"cno izdelani (in manj"si)
04--10: samodejno izdelani (in ve"cji)

Primeri 01, 02 in 03 vsebujejo isti dnevnik, razlikujejo se le po klicih metod.

01, 04--05: steviloMalicarjev
02, 06--07: kolikoRekreacije
03, 08--10: prisotnost
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
    }

    public abstract static class Dogodek {
        private int oseba;
        private Cas cas;
        private boolean odhod;

        protected Dogodek(int oseba, Cas cas, boolean odhod) {
            this.oseba = oseba;
            this.cas = cas;
            this.odhod = odhod;
        }

        public int vrniOsebo() {
            return this.oseba;
        }

        public Cas vrniCas() {
            return this.cas;
        }

        public boolean jeOdhod() {
            return this.odhod;
        }
    }

    public static class Malica extends Dogodek {
        public Malica(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Rekreacija extends Dogodek {
        public Rekreacija(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class SluzbenaPot extends Dogodek {
        public SluzbenaPot(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Dnevnik {
        private int stZaposlenih;
        private Dogodek[] dogodki;

        public Dnevnik(int stZaposlenih, Dogodek[] dogodki) {
            this.stZaposlenih = stZaposlenih;
            this.dogodki = dogodki;
        }

        public int steviloMalicarjev() {
            int count = 0;
            for(int i = 0; i < this.dogodki.length; i++) {
                if(this.dogodki[i] instanceof Malica && this.dogodki[i].jeOdhod()) count++;
            }
            return count;
        }

        public int kolikoRekreacije(int oseba) {
            ArrayList<Cas> rekOsebe = new ArrayList<>();
            for(int i = 0; i < this.dogodki.length; i++) {
                if(this.dogodki[i].vrniOsebo() == oseba && this.dogodki[i] instanceof Rekreacija) {
                    Cas rek = this.dogodki[i].vrniCas();
                    rekOsebe.add(rek);
                }
            }
            int mins = 0;
            int ix = 0;
            Collections.sort(rekOsebe);
            for(int i = 0; i < rekOsebe.size() - 1; i+=2) {
                Cas prihod = rekOsebe.get(i);
                Cas odhod = rekOsebe.get(i + 1);
                mins += prihod.razlikaVMin(odhod);
            }
            return mins * -1;
        }

        public boolean jePrisoten(Cas cas, int oseba) {
            ArrayList<Cas> dogodkiOsebe = new ArrayList<>();
            for(int i = 0; i < this.dogodki.length; i++) {
                if(this.dogodki[i].vrniOsebo() == oseba) {
                    Cas add = this.dogodki[i].vrniCas();
                    dogodkiOsebe.add(add);
                }
            }
            Collections.sort(dogodkiOsebe);
            for(int i = 0; i < dogodkiOsebe.size() - 1; i+= 2) {
                Cas prihod = dogodkiOsebe.get(i);
                Cas odhod = dogodkiOsebe.get(i + 1); 
                if(cas.compareTo(prihod) >= 0 && cas.compareTo(odhod) < 0) return false; 
            }
            return true;
        }


        public boolean[] prisotnost(Cas cas) {
            boolean[] prisotni = new boolean[this.stZaposlenih];
            for(int i = 0; i < prisotni.length; i++) {
                prisotni[i] = true;
            }
            for(int i = 0; i < prisotni.length; i++) {
                prisotni[i] = jePrisoten(cas, i);
            }
            return prisotni;
        }
    }
}
