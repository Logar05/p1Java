public class Fibonacci {
    private int a;
    private int b;
    public Fibonacci(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int naslednji() {
        int next = this.a + this.b;
        this.a = this.b;
        this.b = next;
        return next;
    }
}