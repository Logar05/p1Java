import java.util.*;
public class Stevke {

    public static void izpisStevk(long n) {
        while(n > 0) {
            long rem = n % 10;
            System.out.println(rem);
            n = n / 10;
        }
        return;
    }
    //levo - desno vrstni red rekurzivno
    /*public static void izpisRekurziven(long n) {
        if(n <= 0) return;
        int x = (int)(n % 10);
        izpisRekurziven(n / 10);
        System.out.println(x);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        izpisStevk(num);
        //System.out.println();
        //izpisRekurziven(num);
    }
} 
