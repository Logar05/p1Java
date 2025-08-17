
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int potZoge(int strelec, boolean[][] igralci, int smer) {
        int travel = 0;
        int mid = igralci.length / 2;
        if(smer == -1) {
            int potZoge = 0;
            for(int i = strelec - 1; i >= 0; i--) {
                potZoge++;
                if(potZoge == strelec) return potZoge;
                int oddaljenostIgralca = razlikaDoMid(igralci, potZoge, i, mid);
                if(potZoge >= oddaljenostIgralca) return potZoge;
            }
        }
        else {
            int potZoge = 0;
            for(int i = strelec + 1; i < igralci[0].length; i++) {
                potZoge++;
                if(potZoge == igralci[0].length - strelec - 1) return potZoge;
                int oddaljenostIgralca = razlikaDoMid(igralci, potZoge, i, mid);
                if(potZoge >= oddaljenostIgralca) return potZoge;
            }
        }
        return 0;
    }

    public static int razlikaDoMid(boolean[][] igralci, int potZoge, int ixStolpca, int mid) {
        int minRazdalja = Integer.MAX_VALUE;
        for(int i = 0; i < igralci.length; i++) {
            if(igralci[i][ixStolpca] && Math.abs(mid - i) <= minRazdalja) {
                minRazdalja = Math.abs(mid - i);
            }
        }
        return minRazdalja;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
