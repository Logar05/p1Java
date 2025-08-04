
public class Tretja {

    public static abstract class Drevo {
        private int x;
        private int y;

        protected Drevo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int d2(Drevo drevo) {
            int dx = this.x - drevo.x;
            int dy = this.y - drevo.y;
            return (dx * dx + dy * dy);
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
            for (Drevo drevo: this.drevesa) {
                if (!(drevo instanceof Listavec)) {
                    return false;
                }
            }
            return true;
        }

        public Drevo najblizjeIstovrstno(Drevo drevo) {
            int min = Integer.MAX_VALUE;
            String vrsta = drevo.vrsta();
            Drevo najblizje = null;
            for (Drevo d: this.drevesa) {
                int r = d.d2(drevo);
                if (d != drevo && d.vrsta().equals(vrsta) && r < min) {
                    min = r;
                    najblizje = d;
                }
            }
            return najblizje;
        }

    }

    public static void main(String[] args) {
    }

}
