
public class Volitve {

    public static void main(String[] args) {
        char a = 'c';
        char b = '0';
        System.out.println((int)b);
  
        
    }

    public static int steviloGlasov(int[][][] t, int leto, int stranka) {
        int totalVotes = 0;
        for(int i = 0; i < t[leto][stranka].length; i++) {
            totalVotes += t[leto][stranka][i];
        }
        return totalVotes;
    }

    public static int[][] glasovi(int[][][] t) {
        int L = t.length;
        int S = t[0].length;
        int [][] res = new int[L][S];
        for(int i = 0; i < L; i++) {
            for(int j = 0; j < S; j++) {
                res[i][j] = steviloGlasov(t, i, j);
            }
        }
        return res;
    }

    public static int stGlasovVolisce(int [][][] t, int stranka, int volisce) {
        int total = 0;
        for(int i = 0; i < t.length; i++) {
            total += t[i][stranka][volisce];
        }
        return total;
    }

    public static int najVolisce(int[][][] t, int stranka) {
        int max = 0;
        int ix = 0;
        int stVolisc = t[0][stranka].length;
        for(int i = 0; i < stVolisc; i++) {
            int cur = stGlasovVolisce(t, stranka, i);
            if(cur > max) {
                max = cur;
                ix = i;
            }
        }
        return ix;
    }

    public static int uvrstitevLeto(int[][][]t, int stranka, int volisce, int leto) {
        int stVisjih = 0;
        for(int i = 0; i < t[0].length; i++) {
            if(t[leto][i][volisce] > t[leto][stranka][volisce]) {
                stVisjih++;
            }
        }
        return stVisjih + 1;
    }

    public static int vsotaUvrstitev(int[][][] t, int stranka, int volisce) {
        int stLet = t.length;
        int totalUvrstitev = 0;
        for(int i = 0; i < stLet; i++) {
            totalUvrstitev += uvrstitevLeto(t, stranka, volisce, i);
        }
        return totalUvrstitev;
    }
}
