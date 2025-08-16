
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 2;
        boolean vsaDeljiva = true;
        boolean skip = false;
        int prvo = sc.nextInt();
        int drugo = sc.nextInt();
        if(drugo % prvo != 0) {
            System.out.println(count - 1);
            skip = true;
            vsaDeljiva = false;
        }
        while (sc.hasNext() && !skip) {
            count++;
            prvo = drugo;
            drugo = sc.nextInt();
            if(drugo % prvo != 0) {
                System.out.println(count - 1);
                vsaDeljiva = false;
            }
        }
        if(vsaDeljiva) System.out.println(count);
    }

    // po potrebi dopolnite ...
}
