
import java.util.*;

public class Liga{

    private Collection<String> klubi;
    private Collection<Tekma> tekme;

    public Liga(Collection<String> klubi, Collection<Tekma> tekme) {
        this.klubi = klubi;
        this.tekme = tekme;
    }

    public int steviloTock(String klub) {
        int stTock = 0;
        ArrayList<Tekma> tek = new ArrayList<>(this.tekme);
        for (Tekma tekma : tek) {
            stTock += tekma.steviloTock(klub);
        }
        return stTock;
    }
    
    public Comparator<String> poTockahInImenu() {
        return new primerjalnikTockeImena();
    }

    private class primerjalnikTockeImena implements Comparator <String>{
       
       @Override 
        public int compare(String k1, String k2) {
            int tockeK1 = steviloTock(k1);
            int tockeK2 = steviloTock(k2);
            if(tockeK1 - tockeK2 != 0) return tockeK2 - tockeK1;
            return k1.compareTo(k2);   
        }

        
    } 

    public Slovar<String, Integer> klub2tocke() {
        Slovar<String, Integer> sl = new Slovar<>(this.klubi.size());
        for (String club : this.klubi) {
            int pts = this.steviloTock(club);
            sl.shrani(club, pts);
        }
        return sl;
    }


    public List<String> lestvica() {
        List<String> table = new ArrayList(this.klubi);
        Comparator<String> cmp = poTockahInImenu();
        Collections.sort(table, cmp);
        return table;
    }

    private class poGr implements Iterator<Tekma>{
        private int minGr;
        private Iterator<Tekma> izvorni;
        private Tekma naslednja;

        public poGr(int minGR){
            this.izvorni = Liga.this.tekme.iterator();
            this.minGr = minGR;
            findNext();
        }
        
        private void findNext() {
            naslednja = null;
            while(izvorni.hasNext()) {
                Tekma candidate = izvorni.next();
                if(candidate.goalDiff() >= minGr) {
                    this.naslednja = candidate;
                    break;
                }
            }
        }

        public boolean hasNext() {
            return (naslednja != null);
        }

        public Tekma next() {
            if(naslednja == null) throw new NoSuchElementException();
            Tekma toReturn = naslednja;
            this.findNext();
            return toReturn;
        }

    }

    public Iterator<Tekma> poTekmah(int minGR) {
        return new poGr(minGR);
    }
}
