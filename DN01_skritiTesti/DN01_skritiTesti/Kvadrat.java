import java.util.*;
public class Kvadrat {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = 1; //dolzina stranice
        int total = 0;
        if(a > b) {
            int t = a;
            a = b; 
            b = t;
        }
        while(k < a) {
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < b; j++) {
                if(i + k < a && j + k < b) total++;
            }
        }
        k++;
        }
        System.out.println(total);
    }
}