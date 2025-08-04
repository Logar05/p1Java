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


        return 0;
    }
}