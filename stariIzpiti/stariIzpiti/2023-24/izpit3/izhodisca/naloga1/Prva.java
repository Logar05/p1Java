
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int firstNum = sc.nextInt();
        boolean jePadajoce = true;
        while(sc.hasNextInt()) {
            int nextNum = sc.nextInt();
            if(firstNum == 0){
                firstNum = nextNum;
                nextNum = sc.nextInt();
            }
            if(nextNum >= firstNum) jePadajoce = false;
            if(nextNum == 0) {
                if(jePadajoce) count++;
                if(jePadajoce == false) jePadajoce = true;
            }
            firstNum = nextNum;
        }
        System.out.println(count);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
