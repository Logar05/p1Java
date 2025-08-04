
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static class Celica {
        private int vrstica;
        private int stolpec;

        public Celica(int vrstica, int stolpec) {
            this.vrstica = vrstica;
            this.stolpec = stolpec;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.vrstica, this.stolpec);
        }

        // dopolnite po potrebi ...
    }

    public static class Ovojnik {
        private boolean[][] tabela;

        public Ovojnik(boolean[][] tabela) {
            this.tabela = tabela;
        }

        public NavigableSet<Celica> enice() {
            // popravite / dopolnite ...
            return null;
        }

        // dopolnite po potrebi ...
    }
}
