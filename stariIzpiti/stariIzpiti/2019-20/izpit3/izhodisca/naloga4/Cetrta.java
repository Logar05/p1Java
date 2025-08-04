
import java.util.*;

public class Cetrta {

    public static interface Generator {
        public int naslednji();
    }

    public static int stKlicev(Generator gen, int k) {
        Map<Integer, Integer> frek = new HashMap<>();
        int n = gen.naslednji();
        int st = 1;
        int f = 1;
        frek.put(n, f);

        while (f < k) {
            n = gen.naslednji();
            f = 1 + (frek.containsKey(n) ? frek.get(n) : 0);
            frek.put(n, f);
            st++;
        }
        return st;
    }

    public static void main(String[] args) {
    }
}
