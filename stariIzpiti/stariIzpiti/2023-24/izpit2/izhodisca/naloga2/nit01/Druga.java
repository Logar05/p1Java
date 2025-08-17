
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02: vse smeri so 1 ali 2, ostalo enako kot v besedilu
02--06: vse smeri so 1 ali 2
01, 07--10: splo"sni primeri

V vseh testnih primerih (javnih in skritih) so elementi tabele <rel>
"stevila z intervala [-1000, 1000].
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static int[][] visine(int[][] rel, int[][] smer) {
        int [][] visine = new int [rel.length][rel[0].length];
        for(int i = 0; i < visine.length; i++) {
            for(int j = 0; j < visine[i].length; j++) {
                if(i == 0 && j == 0) continue;
                int direction = smer[i][j];
                if(direction == 1) visine[i][j] = visine[i][j - 1] + rel[i][j];
                if(direction == 2) visine[i][j] = visine[i - 1][j] + rel[i][j];
                if(direction == 3) visine[i][j] = rekVisine(visine, i , j + 1, smer, rel, direction) + rel[i][j];
                if(direction == 4) visine[i][j] = rekVisine(visine, i + 1, j, smer, rel, direction) + rel[i][j];
            }
        }
        return visine;
    }

    public static int rekVisine(int [][] visine, int i, int j, int[][] smer, int[][] rel, int direction) {
        direction = smer[i][j];
        if(visine[i][j] != 0) {
            return visine[i][j];
        }
        if(direction == 3) {
            return visine[i][j] = rekVisine(visine, i, j + 1, smer, rel, direction) + rel[i][j];
        }
        if(direction == 4) {
            return visine[i][j] = rekVisine(visine, i + 1, j, smer, rel, direction) + rel[i][j];
        }
        if(direction == 1) {
            return visine[i][j] = rekVisine(visine, i, j - 1, smer, rel, direction) + rel[i][j];
        }
        if(direction == 2) {
            return visine[i][j] = rekVisine(visine, i - 1, j, smer, rel, direction) + rel[i][j];
        }
        return 0;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
