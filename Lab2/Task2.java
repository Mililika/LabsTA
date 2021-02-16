package Lab2;

public class Task2 implements Binom {

    private long Factorial(int n) {
        long result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * Factorial(n-1);
        return result;
    }

    private long FactorialNK(int n, int k) {
        long result = 1;
        int riz = n-k;
        if (riz == 1 || riz == 0) {
            return result;
        }
        result = riz * Factorial(riz-1);
        return result;
    }

    @Override
    public long solve(int n, int k){
        long result;
        if(n > k){
            result = (Factorial(n)/(FactorialNK(n,k)*Factorial(k)));
        }
        else{
            result = (Factorial(k)/(FactorialNK(k,n)*Factorial(n)));
        }
        return result;
    }
}
