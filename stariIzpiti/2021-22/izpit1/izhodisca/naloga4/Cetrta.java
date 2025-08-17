
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int p, int q) {
        List<T> list = new ArrayList<T>();
        for(int i = 0; i <= q; i++) {
            T add = it.next();
            if(i >= p) list.add(add);
        } 
        return list;
    }

    public static Iterator<Integer> manjkajoci(Iterator<Integer> it, int zacetek) {
        return new novIt(zacetek, it);
    }

    private static class novIt implements Iterator<Integer> {
        private int expected;
        private Iterator<Integer> zunanji;
        private int otherNext;
        public novIt(int zac, Iterator<Integer> zunanji) {
            this.expected = zac;
            this.zunanji = zunanji; 
            this.otherNext = zunanji.next();
        }

        @Override
        public boolean hasNext() {
            return true;
        }


        @Override
        public Integer next() {
            if(expected != otherNext) {
                int ret = expected;
                expected = incr(expected);
                return ret;
            }
            while(expected == otherNext) {
                expected = incr(expected);
                otherNext = zunanji.next();
            }
            int ret = expected;
            expected = incr(expected);
            return ret;
        }

        public int incr(int num) {
            if(num == Integer.MAX_VALUE) return Integer.MIN_VALUE;
            return num + 1;
        }

    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
