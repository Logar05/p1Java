import java.util.Scanner;
public class Zgoscenke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int trenutnaZapolnjenost = 0;
        int ixZg = 1;
        int fileSize = 0;
        while(sc.hasNext()){
            fileSize = sc.nextInt();
            if(trenutnaZapolnjenost + fileSize > k) {
                ixZg++;
                trenutnaZapolnjenost = fileSize;
                if(ixZg > n) break;
            }
            else{
                trenutnaZapolnjenost+=fileSize;
            }
            System.out.println(fileSize + " EP -> zgoscenka " + ixZg + " (" + trenutnaZapolnjenost + " EP)");
        }
    }
}