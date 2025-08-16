
import java.util.*;

public class Cetrta {

    public static interface Generator {
        public int naslednji();
    }

    public static int stKlicev(Generator gen, int k) {
        Map<Integer, Integer> mapa = new HashMap<>(); // Map<Stevilo, stPojavitev>
        int count = 0;
        while (true) {
            count++;
            int key = gen.naslednji();
            if(mapa.containsKey(key)) {
                int stPonKeya = mapa.get(key);
                mapa.put(key, stPonKeya + 1);
            }
            else mapa.put(key, 1);
            if(mapa.get(key) == k) return count;
        }
    }

    public static void main(String[] args) {
    }
}
