public class Imenik extends Datoteka{
    private String ime;
    private Datoteka[] datoteke;
    public Imenik(String ime, Datoteka[] datoteke) {
        this.ime = ime;
        this.datoteke = datoteke;
    }
    @Override
    public int velikost() {
        int size = 256;
        for(int i = 0; i < this.datoteke.length; i++) {
            size+=this.datoteke[i].velikost();
        }
        return size;
    }

    @Override
    public String toString() {
        return String.format("%s [i %d]", this.ime, this.datoteke.length);
    }

    public String vrniIme() {
        return this.ime;
    }

    public Datoteka[] vrniDat() {
        return this.datoteke;
    }

    public int steviloVecjihSlik(int prag) {
        int count = 0;
        for(int i = 0; i < this.datoteke.length; i++) {
            if(this.datoteke[i] instanceof SlikovnaDatoteka) {
                SlikovnaDatoteka tmp = (SlikovnaDatoteka)this.datoteke[i];
                if(tmp.vrniH() >= prag && tmp.vrniW() >= prag) {
                    count++;
                }
            }
        }
        return count;
    }

    public String poisci(String ime) {
        String start = null;
        for(int i = 0; i < this.datoteke.length; i++) {
            if(this.datoteke[i].vrniIme().equals(ime)) return "./" + this.datoteke[i].vrniIme();
            if(!(this.datoteke[i] instanceof Imenik)) continue;
            Imenik tmp = (Imenik)this.datoteke[i];
            start = najdiDat(ime, tmp);
            if(start != null) return "." + start;
        }
        return null;
    }

    public String najdiDat(String ime, Datoteka dat) {
        if(dat.vrniIme().equals(ime)) return "/" + ime;
        if(!(dat instanceof Imenik)) return null;
        String niz = "/" + dat.vrniIme();
        String naprej = null;
        Imenik tmp = (Imenik)dat;
        Datoteka[] files = tmp.vrniDat();
        for(int i = 0; i < files.length; i++) {
            naprej = najdiDat(ime, files[i]);
            if(naprej != null) return niz + naprej;
        }
        return null;

    }

}
