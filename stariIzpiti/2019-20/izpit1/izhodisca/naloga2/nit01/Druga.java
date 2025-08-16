
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    public static int najCas(int[][] t, int krog) {
        int min = t[0][krog];
        for(int i = 0; i < t.length; i++) {
            if(t[i][krog] < min) {
                min = t[i][krog];
            }
        }
        return min;
    }


    public static int[][] kumulativa(int[][] t) {
        int kom[][] = new int[t.length][t[0].length];
        for(int i = 0; i < kom.length; i++) {
            kom[i][0] = t[i][0];
        }
        for(int i = 0; i < kom.length; i++) {
            for(int j = 1; j < kom[0].length; j++) {
                kom[i][j] = kom[i][j - 1] + t[i][j];
            }
        }
        return kom;
    }
}
