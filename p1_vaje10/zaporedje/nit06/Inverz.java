public class Inverz extends Zaporedje {
    private Zaporedje f;
    Interval interval;
    public Inverz(Zaporedje f, Interval interval) {
        this.f = f;
        this.interval = interval;
    }
    public Integer y(int x) {
        for(int i = this.interval.vrniZacetek(); i <= this.interval.vrniKonec(); i++) {
            if(this.f.y(i) == null) continue; 
            if(x == this.f.y(i)) return i;
        }
        return null;
    }
}
