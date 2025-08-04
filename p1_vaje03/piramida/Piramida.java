import java.util.*;
public class Piramida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int spaces = n - 1;
        int stars = 1;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < spaces; j++) {
                System.out.printf("%s", ' ');
            }
            for(int k = 0; k < stars; k++) {
                System.out.printf("%s",  '*');
            }
            System.out.println();
            spaces--;
            
            stars+=2;
        }
    }
}