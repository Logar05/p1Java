import java.util.*;
public class Romanje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int p = sc.nextInt();
        int z = sc.nextInt();
        int dayIx = 1;
        while(d > 0 && p > 0) {
            int startDay = d;
            int endDay = ((d - p) > 0) ? (d - p) : 0;
            p = p - z;
            System.out.println(dayIx + ": "+startDay + " -> "+ endDay);
            dayIx++;
            d = endDay;
        }
    }
}