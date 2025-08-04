import java.util.Scanner;
public class Collatz {

    public static int runCollatz(int n) {
        int len = 1;
        while(n != 1) {
            if(n % 2 == 0) n = n / 2;
            else if(n % 2 != 0) n = n * 3 + 1;
            len++;
        } 
        return len;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int maxLen = runCollatz(a);
        int maxLenNum = a;
        for(int i = a + 1; i <=b; i++) {
            int curLen = runCollatz(i);
            if(curLen > maxLen) {
                maxLen = curLen;
                maxLenNum = i;
            }
        }
        System.out.println(maxLenNum);
        System.out.println(maxLen);
    }
    
}