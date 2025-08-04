
import java.util.Scanner;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = n;
        while (!obilno(st)) {
            st++;
        }
        System.out.println(st);
    }

    public static boolean obilno(int n) {
        int vsota = 0;
        for (int i = 1;  i <= n / 2;  i++) {
            if (n % i == 0) {
                vsota += i;
            }
        }
        return (vsota > n);
    }
}
