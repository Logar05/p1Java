
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
        int n = sc.nextInt();
        int area;
        for(int i = 0; i < n; i++) {
            area = sc.nextInt();
            if(jeLahko(area)) System.out.println("DA");
            else System.out.println("NE");
        }
    }

    public static boolean jeLahko(int area) {
        if((int)Math.sqrt(area) * (int)Math.sqrt(area) == area) return true;
        for(int i = 1; i * i <= area; i++) {
            int a = area / i;
            int b = i;
            if(a * b == area) {
                int max = Math.max(a, b);
                if(a > (max / 2) && b > (max / 2)) return true;
            }
        }
        return false;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
