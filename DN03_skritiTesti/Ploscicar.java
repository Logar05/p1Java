import java.util.Scanner;
class Ploscicar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextLong();
        long w = sc.nextLong();
        long k = sc.nextLong();
        long startSize = (long)(Math.pow(2, k));
        long tiles = rek(h, w, startSize);
        System.out.println(tiles);
    }
    public static long rek(long h, long w, long tileSize) {
        if(w % tileSize == 0 && h % tileSize == 0) {
            return (h / tileSize) * (w / tileSize);
        }
        if(h % tileSize == 0) {
            long wrem = w % tileSize;
            long prt1 = rek(h, w - wrem, tileSize);
            long prt2 = rek(h, wrem, tileSize / 2);
            return prt1 + prt2; 
        }
        long heightRem = h % tileSize;
        long topPart = rek(h - heightRem, w, tileSize);
        long bottomPart = 0;
        bottomPart = rek(heightRem, w, tileSize / 2);
        return topPart + bottomPart;
    }   
}