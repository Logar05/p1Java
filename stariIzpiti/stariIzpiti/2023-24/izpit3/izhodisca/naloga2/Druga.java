
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01: primer iz besedila
02--06: vse besede v okviru istega dokumenta so med seboj razli"cne
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[][] besednjak = new int[n][];
        for(int i = 0; i < besednjak.length; i++) {
            int k = sc.nextInt();
            besednjak[i] = new int[k];
            for(int j = 0; j < k; j++) {
                besednjak[i][j] = sc.nextInt();
            }
        }
        int freq[] = new int[b];
        for(int i = 0; i < besednjak.length; i++) {
            boolean[] added = new boolean[b];
            for(int j = 0; j < besednjak[i].length; j++) {
                if(added[besednjak[i][j]] == false) {
                    added[besednjak[i][j]] = true;
                    freq[besednjak[i][j]]++;
                }
            }
        }
        int maxIx = -1;
        int maxTimes = 0;
        for(int i = 0; i < freq.length; i++) {
            if(freq[i] > maxTimes) {
                maxIx = i;
                maxTimes = freq[i];
            }
        }
        System.out.println(maxIx);
            
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
