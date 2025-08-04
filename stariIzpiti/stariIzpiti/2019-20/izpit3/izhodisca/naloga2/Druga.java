
public class Druga {

    public static void main(String[] args) {
    }

    public static int stPresezkov(int[][] r, int meja) {
        int st = 0;
        for (int m = 0;  m < r.length;  m++) {
            for (int d = 0;  d < r[m].length;  d++) {
                if (r[m][d] > meja) {
                    st++;
                }
            }
        }
        return st;
    }

    public static int nedeljskoPovprecje(int[][] r) {
        int dan = 0;
        int vsota = 0;
        int stNedelj = 0;
        for (int m = 0;  m < r.length;  m++) {
            for (int d = 0;  d < r[m].length;  d++) {
                if (dan % 7 == 6) {
                    vsota += r[m][d];
                    stNedelj++;
                }
                dan++;
            }
        }
        return vsota / stNedelj;
    }
}
