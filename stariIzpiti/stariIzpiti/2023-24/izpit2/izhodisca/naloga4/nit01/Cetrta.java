
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02: ro"cno izdelana
03--10: samodejno izdelani

01, 03--06: klici metode alternirajoceMonotono
02, 07--10: klici metode generator
*/

import java.util.*;
import java.util.function.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T> boolean alternirajoceMonotono(List<T> zaporedje, Comparator<T> prim) {
        List<T> sorted = new ArrayList<>();
        sorted.addAll(zaporedje);
        int ixSorted = 0;
        for(int i = 0; i < zaporedje.size(); i+=2) {
            if(i + 2 > zaporedje.size() - 1) break;
            T first = zaporedje.get(i);
            T next = zaporedje.get(i + 2);
            if(prim.compare(first, next) >= 0) return false;
        }
        for(int j = 1; j < zaporedje.size(); j+=2) {
            if(j + 2 > zaporedje.size() - 1) break;
            T first = zaporedje.get(j);
            T next = zaporedje.get(j + 2);
            if(prim.compare(first, next) <= 0) return false;
        }
        return true;
    }

    public static Supplier<Integer> generator(int a, int b) {
        // popravite / dopolnite ...
        return new neskoncnoAltMono(a, b);
    }

    public static class neskoncnoAltMono implements Supplier<Integer> {
        private int a;
        private int b;
        private int multiB = 0;
        public neskoncnoAltMono(int a, int b) {
            this.a = a;
            this.b = b;
        }
        @Override
        public Integer get() {
            if(multiB == 0) {
                int ret = a + multiB * b;
                multiB = -1;
                return ret;
            }
            if(multiB < 0) {
                int ret = a + multiB * b;
                multiB = multiB * -1;
                return ret;
            }
            else{
                int ret = a + multiB * b;
                multiB = multiB + 1;
                multiB = multiB * -1;
                return ret;
            }
            
        }

    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
