public class Vsota extends Zaporedje {
    private Zaporedje f;
    private Zaporedje h;
    public Vsota(Zaporedje f, Zaporedje h) {
        this.f = f;
        this.h = h;
    }
    @Override
    public Integer y(int x) {
        Integer a = this.f.y(x);
        Integer b = this.h.y(x);
        if(a == null || b == null) return null;
        return a + b;
    }
}
