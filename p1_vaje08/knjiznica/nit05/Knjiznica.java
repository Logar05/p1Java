public class Knjiznica {
    private int stClanov;
    private int stNaslovov;
    private int stIzvodovNaNaslov;
    private boolean[][] izposojeClana;
    private int[] zaloga;
    private int[] izposojeNaslova;
    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov) {
        this.stClanov = stClanov;
        this.stNaslovov = stNaslovov;
        this.stIzvodovNaNaslov = stIzvodovNaNaslov;
        this.izposojeClana = new boolean[stClanov][stNaslovov];
        this.zaloga = new int[stNaslovov];
        for(int i = 0; i < stNaslovov; i++) {
            this.zaloga[i] = stIzvodovNaNaslov;
        }
        this.izposojeNaslova = new int[stNaslovov];
    }
    public boolean posodi(int clan, int naslov) {
        if(this.izposojeClana[clan][naslov] || (this.zaloga[naslov] == 0)) return false;
        this.izposojeClana[clan][naslov] = true;
        this.zaloga[naslov]--;
        this.izposojeNaslova[naslov]++;
        return true;
    }
    public void clanVrne(int clan) {
        for(int i = 0; i < this.stNaslovov; i++) {
            if(this.izposojeClana[clan][i]) {
                this.izposojeClana[clan][i] = false;
                this.zaloga[i]++;
            }
        }
    }
    public int posojeni(int naslov) {
        return this.stIzvodovNaNaslov - this.zaloga[naslov];
    }
    public int priClanu(int clan) {
        int count = 0;
        for(int i = 0; i < this.stNaslovov; i++) {
            if(this.izposojeClana[clan][i]) count++;
        }
        return count;
    }
    public int najNaslov() {
        int max = 0;
        int ixNaj = 0;
        for(int i = 0; i < stNaslovov; i++) {
            if(this.izposojeNaslova[i] > max) {
                max = this.izposojeNaslova[i];
                ixNaj = i;
            }
        }
        return ixNaj;
    }
}