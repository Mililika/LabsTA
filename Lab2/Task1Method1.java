package Lab2;

public class Task1Method1 implements Method {

    @Override
    public boolean solve(int N){
        if(N == 1){
            return true;
        }
        else{
            if(N % 2 == 0) {
                N = N / 2;
                if(N > 1){
                    return solve(N);
                }
            }
            else {
                return false;
            }
            return true;
        }
    }
}
