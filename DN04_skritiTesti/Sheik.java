import java.util.*;
public class Sheik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] oznake = new int[n];
        int lim = Math.max(n, k);
        int[] freq = new int[1001];
        long totalPairs = 0;
        for(int i = 0; i < n; i++) {
            int oznaka = sc.nextInt();
            freq[oznaka]++;
            oznake[i] = oznaka;
        }

        for(int i = 0; i < n; i++) {
            int target = k - oznake[i];
            if(target < 0 || target > 1000) continue;
            totalPairs += freq[target];
        }
        System.out.println(totalPairs);
    }
}