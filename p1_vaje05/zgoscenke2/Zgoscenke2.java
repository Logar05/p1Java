import java.util.*;
public class Zgoscenke2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] zasedenost = new int[n];
        int fileSize = 0;
        int ix = 0;
        while(sc.hasNext()) {
            fileSize = sc.nextInt();
            ix = leastFull(zasedenost);
            if(zasedenost[ix] + fileSize > k) {
                break;
            }
            zasedenost[ix] += fileSize;
            System.out.printf("%d EP -> zgoscenka %d %s\n", fileSize, ix + 1, Arrays.toString(zasedenost));
        }
    }

    public static int leastFull(int[] zasedenost) {
        int ix = 0;
        int maxVal = zasedenost[ix];
        for(int i = 0; i < zasedenost.length; i++) {
            if(zasedenost[i] < zasedenost[ix]) {
                maxVal = zasedenost[i];
                ix = i;
            }
        }
        return ix;
    }
}
