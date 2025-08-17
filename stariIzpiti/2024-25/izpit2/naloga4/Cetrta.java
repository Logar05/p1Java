
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--12: klici metode <izposoja>
07--12: klici metode <vracilo>
01--03, 07--09: klici metode <statusiKoles>
04--06, 10--12: klici metode <kolesaNaPostaji>

01, 04, 07, 10: ro"cno izdelani
02--03, 05--06, 08--09, 11--12: samodejno izdelani
*/

import java.security.KeyStore.Entry;
import java.util.*;

public class Cetrta {

    public static class Sistem {
        private Map<Integer, String> kolo2postaja;
        private Map<Integer, Boolean> parkirano;
        // po potrebi dopolnite ...

        public Sistem(Map<Integer, String> kolo2postaja) {
            this.kolo2postaja = kolo2postaja;
            this.parkirano = new HashMap<>();
            for(Integer key : kolo2postaja.keySet()) {
                parkirano.put(key, true);
            }
        }

        public void izposoja(int kolo) {
            kolo2postaja.remove(kolo);
            parkirano.put(kolo, false);
        }

        public void vracilo(int kolo, String postaja) {
            kolo2postaja.put(kolo, postaja);
            parkirano.put(kolo, true);
        }

        public Map<Integer, Boolean> statusiKoles() {
            return parkirano;
        }

        public Set<Integer> kolesaNaPostaji(String postaja) {
            Set<Integer> kolesaNaPostaji = new HashSet<>();
            for(Integer kolo : kolo2postaja.keySet()) {
                if(kolo2postaja.get(kolo).equals(postaja)) kolesaNaPostaji.add(kolo);
            }
            return kolesaNaPostaji;
        }
    }
}
