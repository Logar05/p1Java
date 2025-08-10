public class Fib {
    private int a;
    private int b;
    public Fib(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int naslednji() {
        int next = this.a + this.b;
        this.a = Math.max(this.a, this.b);
        this.b = next;
        return next;
    }
}