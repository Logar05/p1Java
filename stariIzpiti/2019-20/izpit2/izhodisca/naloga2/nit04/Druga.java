
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

    //=========================================================================
    // V vseh testnih primerih velja:
    // 1 <= "stevilo vrstic tabele <= 100
    // 1 <= "stevilo stolpcev tabele <= 100
    //=========================================================================

    public static int zadnjaVrsticaZLocilom(char[][] krizanka) {
        int last = -1;
        for(int i = 0; i < krizanka.length; i++) {
            for(int j = 0; j < krizanka[i].length; j++) {
                if(krizanka[i][j] == '-') last = i;
            }
        }
        return last;
    }

    //=========================================================================
    // V vseh testnih primerih velja:
    // 1 <= "stevilo vrstic tabele <= 100
    // 1 <= "stevilo stolpcev tabele <= 100
    // 0 <= stolpec < "stevilo stolpcev
    //=========================================================================

    public static char[] ktaBeseda(char[][] krizanka, int stolpec, int k) {
        // popravite / dopolnite ...
        int start = 0;
        int end = 0;
        if(k != 1) {
            int count = 1;
            for(int i = 0; i < krizanka.length; i++) {
                if(krizanka[i][stolpec] == '-') {
                    count++;
                }
                if(count == k) {
                    start = i + 1;
                    break;
                }
            }
            if(count != k) return null;
        }
        if(start >= krizanka.length) return null;
        if(start == krizanka.length - 1) {
            char[] ret = {krizanka[start][stolpec]};
            return ret;
        }
        if(krizanka[start][stolpec] == '-') {
            char[] ret1 = new char[0];
            return ret1;
        }
        end = start;
        for(int i = start + 1; i < krizanka.length; i++) {
            if(krizanka[i][stolpec] != '-') {
                end++;
                continue;
            }
            break;
        }
        char wrd[] = new char[end - start + 1];
        int ix = 0;
        for(int i = start; i <= end; i++) {
            wrd[ix++] = krizanka[i][stolpec];
        }
        return wrd;
    }
}
