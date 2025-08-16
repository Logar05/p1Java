
/*
 * Testiranje:
 *
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        int lowerBound = 1;
        int upperBound = a;
        int count = 1;
        int curPileSize = a;
        while(true) {
            if(lowerBound <= k && k <= upperBound){
                System.out.println(count);
                break;
            }
            count++;
            curPileSize = curPileSize + b;
            lowerBound = upperBound + 1;
            upperBound = upperBound + curPileSize;
        }
    }
}
