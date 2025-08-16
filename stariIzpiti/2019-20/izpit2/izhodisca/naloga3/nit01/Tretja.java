
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

    //=========================================================================
    public static abstract class Ukaz {
        public abstract int vrniTip();
        public abstract void izvedi(int[] stolpi);
        public static int bilanca(Ukaz[] ukazi) {
            int numP = 0;
            int numO = 0;
            for(int i = 0; i < ukazi.length; i++) {
                if(ukazi[i].vrniTip() == 1) numP++;
                else numO++;
            }
            return numP - numO;
        }

        public int type = 0;

        public abstract String toString();

        public Ukaz zaporedje(Ukaz drugi) {
            return new Zap(this, drugi);
        }

        // po potrebi dopolnite ...
    }

    public static class Zap extends Ukaz{
        private Ukaz prvi;
        private Ukaz drugi;
        private int type = 3;
        public Zap(Ukaz prvi, Ukaz drugi) {
            this.prvi = prvi;
            this.drugi = drugi;
        }
        public int vrniTip() {
            return this.type;
        }
        public void izvedi(int[] stolpi) {
            this.prvi.izvedi(stolpi);
            this.drugi.izvedi(stolpi);
        }
        public String toString() {
            return "[" + this.prvi.toString() + ", " + this.drugi.toString() + "]";
        }
    }

    //=========================================================================
    public static class Postavi extends Ukaz {
        private int kam;
        public int type = 1;
        // V vseh testnih primerih velja:
        // kam >= 0
        @Override
        public void izvedi(int[] stolpi) {
            if(kam >= stolpi.length) return;
            stolpi[kam]++;

        }

        @Override
        public String toString() {
            return String.format("+%d", this.kam);
        }


        public int vrniTip() {
            return this.type;
        }

        public Postavi(int kam) {
            this.kam = kam;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class Odvzemi extends Ukaz {
        private int odkod;
        public int type = 2;
        public int vrniTip() {
            return this.type;
        }

        @Override
        public void izvedi(int[] stolpi) {
            if(this.odkod >= stolpi.length || stolpi[this.odkod] == 0) return;
            stolpi[this.odkod]--;
        }


        @Override
        public String toString() {
            return String.format("-%d", this.odkod);
        }

        // V vseh testnih primerih velja:
        // odkod >= 0

        public Odvzemi(int odkod) {
            this.odkod = odkod;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    // po potrebi dopolnite ...
}
