import java.util.Scanner;
public class Anka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        int druga = m + 1;
        int totalCnt = 0;
        int tretja = 0;
        for(int i = 1; i <= 9; i+=2) {
            for(int j = druga; j <= 9; j++) {
                for(int k = 0; k <= 9; k += d) {
                    System.out.print(i+"-"+j+"-"+k+"\n");
                    totalCnt++;
                }
            }
        }
        System.out.println(totalCnt);
    }
}