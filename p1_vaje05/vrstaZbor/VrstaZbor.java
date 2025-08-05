import java.util.*;

public class VrstaZbor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] vrsta = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            vrsta[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            if(i == 0 && i + 1 < n ) {
                if(vrsta[i + 1] >= vrsta[i]) {
                    count++;
                    System.out.println(i);
                }
                continue;
            }
            if(i == n - 1 && i != 0) {
                if(vrsta[i - 1] <= vrsta[i]) {
                    count++;
                    System.out.println(i);
                }
                continue;
            }
            if(vrsta[i - 1] <= vrsta[i] && vrsta[i] <= vrsta[i + 1]) {
                count++;
                System.out.println(i);
            }
        }
        if(count == 0) {
            System.out.println("NOBEDEN");
        }
    }
}