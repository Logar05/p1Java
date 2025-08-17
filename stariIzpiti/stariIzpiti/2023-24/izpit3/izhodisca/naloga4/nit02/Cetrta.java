
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode skupne
06--10: klici metode poDolziniBrezDuplikatov

01, 02, 06, 07: ro"cno izdelani
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite, "ce "zelite metodi testirati ro"cno
    }

    public static <T> Set<T> skupni(List<List<T>> s) {
        Set<T> ret = new HashSet<>();
        ret.addAll(s.get(0));
        for(int i = 1; i < s.size(); i++) {
            ret.retainAll(s.get(i));
        }
        return ret;
    }

    public static <T> void poDolziniBrezDuplikatov(List<List<T>> s) {
        // dopolnite ...
        Comparator<List<T>> cmp = new poDolzini();
        Collections.sort(s, cmp);
    }

    private static class poDolzini<T> implements Comparator<List <T>> {
        @Override
        public int compare(List<T> prvi, List<T> drugi) {
            Set<T> a = new HashSet<>();
            Set<T> b = new HashSet<>();
            a.addAll(prvi);
            b.addAll(drugi);
            return a.size() - b.size();
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
