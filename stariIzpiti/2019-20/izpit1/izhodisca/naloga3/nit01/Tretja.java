
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Zaposleni {
        private String ip;
        private int placa;
        private Vodja nadrejeni;

        public Zaposleni(String ip, int placa, Vodja nadrejeni) {
            this.ip = ip;
            this.placa = placa;
            this.nadrejeni = nadrejeni;
        }

        public int vrniPlaco() {
            return this.placa;
        }

        @Override
        public String toString() {
            return this.ip;
        }

        public Zaposleni vrniNadrejenega() {
            return this.nadrejeni;
        }

        public int placaNadrejenega() {
            if(this.nadrejeni == null) return -1;
            return this.nadrejeni.vrniPlaco();
        }

        public static int steviloAnomalij(Zaposleni[] zaposleni) {
            int ixD = -1;
            for(int i = 0; i < zaposleni.length; i++) {
                if(zaposleni[i] instanceof Delavec){
                    ixD = i;
                    break;
                }
            }
            int count = 0;
            if(ixD == -1) return 0;
            int placaD = 0;
            int placaV = 0;
            for(int i = ixD; i < zaposleni.length; i++) {
                if(!(zaposleni[i] instanceof Delavec)) continue;
                placaD = zaposleni[i].vrniPlaco();
                for(int j = 0; j < zaposleni.length; j++) {
                    if(!(zaposleni[j] instanceof Vodja)) continue;
                    placaV = zaposleni[j].vrniPlaco();
                    if(placaD > placaV) count++;
                }
            }
            return count;
        }
    }

    public static class Delavec extends Zaposleni {
        public Delavec(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
    }

    public static class Vodja extends Zaposleni {
        public Vodja(String ip, int placa, Vodja nadrejeni) {
            super(ip, placa, nadrejeni);
        }
        public int vrniPlaco() {
            return super.vrniPlaco();
        }

        public Vodja vrhovni() {
            Zaposleni zap = this;
            while(true) {
                if(zap.vrniNadrejenega() == null) return (Vodja)zap;
                zap = zap.vrniNadrejenega();

            }
        }
    }
}
