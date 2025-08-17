
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = a; i <= b; i++) {
            if(jeChenovo(i)) count++;
        }
        System.out.println(count);
    }

    public static boolean jeChenovo(int n) {
        if(!jePraSt(n)) return false;
        int coutDeliteljev = 2;
        int t = n + 2;
        for(int i = 2; i <= t / 2; i++) {
            if(t % i == 0) coutDeliteljev++;
        }
        return coutDeliteljev <= 4;

    }
    public static boolean jePraSt(int n) {
        if(n == 2) return true;
        if(n <= 1) return false;
        if(n % 2 == 0) return false;
        for(int i = 3; i * i <= n; i+=2) {
            if(n % i == 0) return false;
        }
        return true;
    }

}
