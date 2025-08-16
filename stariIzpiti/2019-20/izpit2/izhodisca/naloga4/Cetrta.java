
/*
 * Testiranje:
 *
 * tj.exe Cetrta.java . .
 */

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> ImenaStrank = new ArrayList<>();
        List<Stranka> stranke = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String prvi = sc.next();
            String drugi = sc.next();
            if(ImenaStrank.contains(prvi) == false) {
                ImenaStrank.add(prvi);
                Stranka tmp = new Stranka(prvi);
                stranke.add(tmp);
            }
            if(ImenaStrank.contains(drugi) == false) {
                ImenaStrank.add(drugi);
                Stranka tmp = new Stranka(drugi);
                stranke.add(tmp);
            }
            for (Stranka stranka : stranke) {
                if(stranka.vrniIme().equals(prvi)) stranka.povecajPrim();
                if(stranka.vrniIme().equals(drugi)) stranka.povecajSek();
            }
        }
        Collections.sort(stranke);
        System.out.print('[');
        int count = 1;
        for (Stranka stranka : stranke) {
            if(stranke.size() == count) {
                System.out.print(stranka.vrniIme());
                System.out.println(']');
                break;
            }
            count++;
            System.out.printf("%s, ", stranka.vrniIme());
        }
    
    }

    public static class Stranka implements Comparable<Stranka> {
        private int primarniGlas = 0;
        private int sekundarniGlas = 0;
        private String ime;

        @Override
        public int compareTo(Stranka druga) {
            int prim1 = this.vrniStPrim();
            int sek1 = this.vrniStSek();
            int prim2 = druga.vrniStPrim();
            int sek2 = druga.vrniStSek();
            if(prim1 != prim2) return prim2 - prim1;
            if(sek1 != sek2) return sek2 - sek1;
            return this.vrniIme().compareTo(druga.vrniIme()); 
        } 

        public Stranka(String ime) {
            this.ime = ime;
        }

        public String vrniIme() {
            return this.ime;
        }

        public void povecajPrim() {
            this.primarniGlas++;
        }

        public void povecajSek() {
            this.sekundarniGlas++;
        }

        public int vrniStPrim() {
            return this.primarniGlas;
        }

        public int vrniStSek() {
            return this.sekundarniGlas;
        }
    }


    // po potrebi dopolnite ...
}
