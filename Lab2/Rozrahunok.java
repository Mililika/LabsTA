package Lab2;

public class Rozrahunok{
    private final Method method;
    private final Binom binom;
    private final Print printer;

    public Rozrahunok(Method method, Binom binom, Print printer){
        this.method = method;
        this.binom = binom;
        this.printer = printer;
    }

    public void solve(int num){
        printer.print(method.solve(num));
    }

    public void BinomCofRoz(int n, int k){
        printer.print(binom.solve(n, k));
    }
}
