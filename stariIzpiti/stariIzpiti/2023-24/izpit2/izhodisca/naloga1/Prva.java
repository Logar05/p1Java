
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--10: splošni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if(jeRazcep(num, p, q)) System.out.println("DA");
            else System.out.println("NE");
        }
    }

    public static boolean jeRazcep(int num, int p, int q) {
        while(num % p == 0) {
            num = num / p;
        }
        while(num % q == 0) {
            num = num / q;
        }
        return num == 1;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
