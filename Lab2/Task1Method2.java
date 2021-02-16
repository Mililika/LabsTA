package Lab2;

public class Task1Method2 implements Method {
    @Override
    public boolean solve(int N) {
        while(N > 1) {
            if (N % 2 == 0) {
                N = N / 2;
            } else {
                return false;
            }
        }
        return true;
    }

}
