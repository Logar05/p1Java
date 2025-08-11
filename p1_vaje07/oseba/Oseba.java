public class Oseba {
    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;
    private Oseba oce;
    private Oseba mati;
    public Oseba(String ime, String priimek, char spol, int letoRojstva, Oseba oce, Oseba mati) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
        this.oce = oce;
        this.mati = mati;
    }
    public String vrniIme(){
        return this.ime;
    }
    public String toString(){
        return this.ime + " " + this.priimek + " (" + this.spol + "), " + this.letoRojstva;
    }
    public int starost(int leto) {
        return leto - this.letoRojstva;
    }
    public boolean jeStarejsaOd(Oseba os) {
        return this.letoRojstva < os.letoRojstva;
    }
    public static Oseba starejsa(Oseba a, Oseba b) {
        if(a.jeStarejsaOd(b)) {
            return a;
        }
        else if(b.jeStarejsaOd(a)) return b;

        return null;
    }
    public String imeOceta() {
        if(this.oce != null) {
            return this.oce.ime;
        }
        return null;
    }
    public boolean jeBratAliSestraOd(Oseba os) {
        if((this.oce == os.oce && this.mati == os.mati) && this != os) return true;
        return false;
    }
    public boolean jeSestraOd(Oseba os) {
        return this.jeBratAliSestraOd(os) && this.spol == 'Z'; 
    }
    public boolean jeTetaOd(Oseba os) {
        return (os.mati.jeBratAliSestraOd(this) || os.oce.jeBratAliSestraOd(this)) && this.spol == 'Z';
    }
    public boolean jeOcetovskiPrednikOd(Oseba os) {
        if(os.oce == this) return true;
        if(os.oce == null) return false;
        return jeOcetovskiPrednikOd(os.oce);
    }
    public char vrniSpol() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vrniSpol'");
    }   
}