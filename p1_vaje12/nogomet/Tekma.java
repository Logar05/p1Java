
import java.util.*;

public class Tekma {

    private String domaci;
    private String gostje;
    private int goliDomacih;
    private int goliGostov;

    public Tekma(String domaci, String gostje, int goliDomacih, int goliGostov) {
        this.domaci = domaci;
        this.gostje = gostje;
        this.goliDomacih = goliDomacih;
        this.goliGostov = goliGostov;
    }

    public int steviloTock(String klub) {
        if(!(this.domaci.equals(klub) || this.gostje.equals(klub))) return 0;
        int gd = 0;
        if(klub.equals(this.domaci)) {
            gd = this.goliDomacih - this.goliGostov;
        }
        if(klub.equals(this.gostje)) {
            gd = this.goliGostov - this.goliDomacih;
        }
        if(gd > 0) return 3;
        else if(gd == 0) return 1; 
        return 0;
    }

    public int goalDiff() {
        return (int)Math.abs(this.goliDomacih - this.goliGostov);
    }
    @Override
    public String toString() {
        return String.format("%s %d : %d %s", this.domaci, this.goliDomacih,
                this.goliGostov, this.gostje);
    }
}
