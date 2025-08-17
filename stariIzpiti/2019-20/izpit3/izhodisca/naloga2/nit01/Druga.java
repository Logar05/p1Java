
public class Druga {

    public static void main(String[] args) {

    }

    public static int stPresezkov(int[][] r, int meja) {
        int count = 0;
        for(int i = 0; i < r.length; i++) {
            for(int j = 0; j < r[i].length; j++) {
                if(r[i][j] > meja) count++;
            }
        }
        return count;
    }

    public static int nedeljskoPovprecje(int[][] r) {
        int stNedelj = 0;
        int sumNedelj = 0;
        int prvaNedelja = 6;
        int rem = 6;
        for(int i = 0; i < r.length; i++) {
            prvaNedelja = rem;
            for(int j = prvaNedelja; j < r[i].length; j+=7){
                sumNedelj += r[i][j];
                stNedelj++;
                if(j + 7 >= r[i].length) {
                    rem = ((j + 7) - r[i].length);
                }
            }
        }
        return (int)(sumNedelj / stNedelj);
    }

}
