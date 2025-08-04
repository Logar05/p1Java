
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

        public static int bilanca(Ukaz[] ukazi) {
            // popravite / dopolnite ...
            return -9999;
        }

        public Ukaz zaporedje(Ukaz drugi) {
            // popravite / dopolnite ...
            return null;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class Postavi extends Ukaz {
        private int kam;

        // V vseh testnih primerih velja:
        // kam >= 0

        public Postavi(int kam) {
            this.kam = kam;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class Odvzemi extends Ukaz {
        private int odkod;

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
