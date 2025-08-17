import java.util.ArrayList;
import java.util.Arrays;

public class Tretja {

    public static abstract class Drevo {
        private int x;
        private int y;

        protected Drevo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int vrniX() {
            return this.x;
        }

        public int vrniY() {
            return this.y;
        }

        public int d2(Drevo drevo) {
            return (this.x - drevo.vrniX()) * (this.x - drevo.vrniX()) + (this.y - drevo.vrniY()) * (this.y - drevo.vrniY());
        }

        public abstract String vrsta();

        @Override
        public String toString() {
            return String.format("%s(%d, %d)", this.vrsta(), this.x, this.y);
        }
    }

    public static abstract class Listavec extends Drevo {
        protected Listavec(int x, int y) {
            super(x, y);
        }
    }

    public static abstract class Iglavec extends Drevo {
        protected Iglavec(int x, int y) {
            super(x, y);
        }
    }

    public static class Hrast extends Listavec {
        public Hrast(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Hrast";
        }
    }

    public static class Bukev extends Listavec {
        public Bukev(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bukev";
        }
    }

    public static class Breza extends Listavec {
        public Breza(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Breza";
        }
    }

    public static class Smreka extends Iglavec {
        public Smreka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Smreka";
        }
    }

    public static class Jelka extends Iglavec {
        public Jelka(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Jelka";
        }
    }

    public static class Bor extends Iglavec {
        public Bor(int x, int y) {
            super(x, y);
        }

        @Override
        public String vrsta() {
            return "Bor";
        }
    }

    public static class Gozd {
        private Drevo[] drevesa;

        public Gozd(Drevo[] drevesa) {
            this.drevesa = drevesa;
        }

        public boolean jeListnat() {
            for(int i = 0; i < this.drevesa.length; i++) {
                if(!(this.drevesa[i] instanceof Listavec)) return false; 
            }
            return true;
        }

        public Drevo[] vrniDrevesa() {
            return this.drevesa;
        }

        public Drevo najblizjeIstovrstno(Drevo drevo) {
            Drevo[] tab = this.vrniDrevesa();
            ArrayList<Drevo> arr = new ArrayList<>();
            arr.addAll(Arrays.asList(tab));
            arr.remove(drevo);
            int minDist = Integer.MAX_VALUE;
            Drevo najBlizje = null;
            for (Drevo element : arr) {
                if(element.vrsta().equals(drevo.vrsta())){
                    if(drevo.d2(element) < minDist) {
                        minDist = drevo.d2(element);
                        najBlizje = element;
                    }
                }
            }
            return najBlizje;
        }

    }

    public static void main(String[] args) {
    }

}
