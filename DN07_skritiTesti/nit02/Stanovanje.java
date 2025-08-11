
import java.util.*;
public class Stanovanje {
    private Oseba[] stanovalci;
    private Stanovanje[] sosedi = new Stanovanje[4];
    public Stanovanje(Oseba[] stanovalci) {
        this.stanovalci = stanovalci;
    }

    public Stanovanje[] vrniSosede() {
        return this.sosedi;
    }

    public int steviloStanovalcev() {
        return stanovalci.length;
    }

    public Oseba[] vrniStanovalce() {
        return this.stanovalci;
    }

    public int steviloStarejsihOd(Oseba os) {
        int count = 0;
        for(int i = 0; i < this.steviloStanovalcev(); i++) {
            if(this.stanovalci[i].jeStarejsaOd(os)) count++;
        }
        return count;
    }

    public int[] mz() {
        int stM, stZ;
        int[] vrni = new int[2];
        for(int i = 0; i < this.steviloStanovalcev(); i++) {
            if(this.stanovalci[i].vrniSpol() == 'M') vrni[0]++;
            if(this.stanovalci[i].vrniSpol() == 'Z') vrni[1]++;
        }
        return vrni;
    }

    public Oseba starosta() {
        int lim = this.stanovalci.length;
        if(lim == 0) return null;
        Oseba najStarejsa = this.stanovalci[0];
        for(int i = 0; i < lim; i++) {
            if(this.stanovalci[i].jeStarejsaOd(najStarejsa)) najStarejsa = this.stanovalci[i];
        }
        return najStarejsa;
    }

    public void nastaviSosede(Stanovanje levi, Stanovanje zgornji,
            Stanovanje desni, Stanovanje spodnji) {
        this.sosedi[0] = levi;
        this.sosedi[1] = zgornji;
        this.sosedi[2] = desni;
        this.sosedi[3] = spodnji;
    }

    public Oseba starostaSosescine() {
        Oseba najStarosta = this.starosta();
        for(int i = 0; i < 4; i++) {
            if(this.sosedi[i] == null || this.sosedi[i].starosta() == null) continue;
            if(this.sosedi[i].starosta().jeStarejsaOd(najStarosta)) najStarosta = this.sosedi[i].starosta();
        }
        return najStarosta;
    }

    public int vrniStSosedov() {
        int count = 0;
        for(int i = 0; i < 4; i++) {
            if(this.sosedi[i] != null) count++; 
        }
        return count;
    }

    public int vrniStLjudiSosedov() {
        int count = 0;
        for(int i = 0; i < 4; i++) {
            if(this.sosedi[i] != null) {
                count += this.sosedi[i].steviloStanovalcev();
            }
        }
        return count;
    }

    

    public Oseba[] sosedjeSosedov() {
        Stanovanje cur = null;
        int count = 0;
        boolean found = false;
        int ix = 0;
        Set<Oseba> mnozica = new HashSet<>();
        for(int i = 0; i < 4; i++) {
            if(this.sosedi[i] == null) continue;
            Stanovanje sosediSoseda[] = this.sosedi[i].vrniSosede();
            for(int j = 0; j < 4; j++) {
                if(sosediSoseda[j] == null) continue;
                Oseba [] tmp = sosediSoseda[j].vrniStanovalce();
                mnozica.addAll(Arrays.asList(tmp));
            }
        }
        mnozica.removeAll(Arrays.asList(this.stanovalci));
        return mnozica.toArray(new Oseba[0]);
    }

    
}
