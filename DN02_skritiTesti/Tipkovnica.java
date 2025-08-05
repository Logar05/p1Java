import java.util.Arrays;
import java.util.Scanner;
public class Tipkovnica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        int d = sc.nextInt(); //st tipk
        int n = sc.nextInt(); //dolzina zaporedja
        
        int length = 0;
        if(type == 1) length = ravnovrstnica(d, n, sc);
        if(type == 2) length = kvadratnica(d, n, sc);
        if(type == 3) length = piramidnica(d, n, sc);
        if(type == 4) length = spiralnica(d, n, sc);

        System.out.printf("%d\n", length);
    }
    
    public static int ravnovrstnica(int d, int n, Scanner sc) {
        int travel = 0;
        int prva = sc.nextInt();
        for(int i = 1; i < n; i++) {
            int druga = sc.nextInt();
            travel+=Math.abs(prva - druga);
            prva = druga;
        }
        return travel;
    }
    public static int kvadratnica(int d, int n, Scanner sc) {
        int travel = 0;
        int prva = sc.nextInt();
        int colPrva = prva % d + 1;
        int rowPrva = prva / d + 1;
        for(int i = 1; i < n; i++) {
            int next = sc.nextInt();
            int colNext = next % d + 1;
            int rowNext = next / d + 1;
            travel += Math.abs(rowNext - rowPrva) + Math.abs(colNext - colPrva);
            colPrva = colNext;
            rowPrva = rowNext;
            prva = next;
        }
        return travel;
    }
    public static int piramidnica(int d, int n, Scanner sc) {
        int travel = 0;
        int totalCols = d * 2 - 1;
        int prva = sc.nextInt();
        int prvaRow = (int)Math.sqrt(prva) + 1;
        int prvaCol = prva - (prvaRow - 1) * (prvaRow - 1) + 1 + (d - prvaRow);
        for(int i = 1; i < n; i++) {
            int next = sc.nextInt();
            int nextRow = (int)Math.sqrt(next) + 1;
            int nextCol = next - (nextRow - 1) * (nextRow - 1) + 1 + (d - nextRow);
            travel += Math.abs(nextRow - prvaRow) + Math.abs(nextCol - prvaCol);
            prvaCol = nextCol;
            prvaRow = nextRow;
            prva = next;
        }

        return travel;
    }
    public static int spiralnica(int d, int n, Scanner sc) {
        int travel = 0;
        int prva = sc.nextInt();
        int prvaLayer = findLayer(prva, d);
        int prvaCoord[] = findCoords(d, prva, prvaLayer);
        for(int i = 1; i < n; i++) {
            int next = sc.nextInt();
            int nextLayer  = findLayer(next, d);
            int nextCoords[] = findCoords(d, next, nextLayer);
            travel += Math.abs(prvaCoord[0] - nextCoords[0]) + Math.abs(prvaCoord[1] - nextCoords[1]);
            prvaCoord = nextCoords;
            prvaLayer = nextLayer;
            prva = next;
        }

        return travel;
    }
    public static int findLayer(int n, int d) {
        if(n == 0) return 0;
        int layer = 1;
        for(int i = 1; i < d; i+=2){
            if(i * i <= n && n < (i + 2) * (i + 2)){
                return layer; 
            }
            layer++;
        }
        return layer;
    }
    public static int[] findCoords(int d, int n, int layer) {
        int mid = d / 2 + 1;
        if(n == 0) return new int[] {mid, mid};
        int coords[] = new int[2];
        int start = (int)Math.sqrt(n);
        if(start % 2 == 0) start--;
        start = start * start;
        int layerLen = layer * 2;
        int maxLayer = findLayer((d) * (d) - 1, d);
        int side = 0;
        int start2 = start;
        for(int i = 1; i <= 4; i++) {
            if(n >= start && n < start + layerLen) {
                side = i;
                break;
            }
            start = start + layerLen;
        }
        if(side == 1 || n == start2 + layerLen) {
            coords[0] = mid - layer;
            coords[1] = maxLayer - layer + 1 + (n - start2);
        }
        if(side == 3 || n == start2 + 3 * layerLen){
            coords[0] = mid + layer;
            int botLeft = start2 + 3 * layerLen;
            coords[1] = maxLayer - layer + 1 + botLeft - n;
        }
        if(side == 2 || n == start2 + 2 * layerLen){
            int tmp = start2 + layerLen;
            coords[0] = n - tmp + (maxLayer - layer) + 1;
            
            coords[1] = mid + layer;
        }
        if(side == 4) {
            int tmp = start2 + 3 * layerLen;
            int diff = n - tmp;
            int corner = mid + layer;
            coords[0] = corner - diff;
            coords[1] = mid - layer;
        }

        return coords;
    }
}


