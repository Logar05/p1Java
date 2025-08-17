
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01, 02: primera iz besedila
01, 03--06: u = 1
02, 07--10: u = 2
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        int m = sc.nextInt(); //drazitelji
        int n = sc.nextInt(); //izdelki
        int k = sc.nextInt();
        int[][] drazba = new int[m][n];
        for(int i = 0; i < k; i++) {
            int ixD = sc.nextInt();
            int ixIz = sc.nextInt();
            int ponudba = sc.nextInt();
            if(ponudba > findMaxPonudba(drazba, ixIz)) {
                drazba[ixD][ixIz] = ponudba;
            }
        }
        if(u == 1) finalCene(drazba);
        if(u == 2) finalStIzdelkov(drazba);
    }

    public static void finalStIzdelkov(int[][] drazba) {
        int[] izpis = new int[drazba.length];
        for(int i = 0; i < drazba.length; i++) {
            int count = 0;
            for(int j = 0; j < drazba[i].length; j++) {
                if(jeMax(drazba, i, j)) {
                    count++;
                    continue;
                }
            }
            izpis[i] = count;
        }
        System.out.println(Arrays.toString(izpis));
    }

    public static boolean jeMax(int[][] drazba, int drazitelj, int izdelek) {
        int max = findMaxPonudba(drazba, izdelek);
        if(drazba[drazitelj][izdelek] == max && max != 0) return true;
        return false;
    }

    public static void finalCene(int[][] drazba) {
        int[] izpis = new int[drazba[0].length];
        for(int j = 0; j < drazba[0].length; j++) {
            int cena = findMaxPonudba(drazba, j);
            izpis[j] = cena;
        }
        System.out.println(Arrays.toString(izpis));
    }

    public static int findMaxPonudba(int[][] drazba, int ixIz) {
        int max = 0;
        for(int i = 0; i < drazba.length; i++) {
            if(drazba[i][ixIz] > max) max = drazba[i][ixIz];
        }
        return max;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
