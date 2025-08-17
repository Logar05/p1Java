
import java.util.Scanner;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true) {
            if(jeObilno(n)) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }

    public static boolean jeObilno(int n) {
        int lim = n / 2;
        int sum = 1;
        for(int i = 2; i <= lim; i++) {
            if(n % i == 0) sum += i;
        }
        return n < sum;
    }
}
