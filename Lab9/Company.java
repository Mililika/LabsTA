package lab9;

import lombok.*;
import java.util.*;

public class Company {

    @Getter
    @Setter
    double sum;
    private List<Double> accounts;

    Company(double... accounts) {
        this.accounts = new ArrayList<Double>(Arrays.asList(Arrays.stream(accounts).boxed().toArray(Double[]::new)));
        sum = this.accounts.stream().mapToDouble(e -> e).sum();
    }

    double calculate(double percent) {
        if (percent < 0 && percent >= 0.2)
            throw new IllegalArgumentException("Unacceptable proportion: " + percent);

        double newSum = sum;
        int length = accounts.size();

        for (int i = 1; i < length; i++) {
            Collections.sort(accounts);
            newSum -= (accounts.get(0) + accounts.get(1)) * percent;
            accounts.set(1, (accounts.get(0) + accounts.get(1)) * (1 - percent));
            accounts.remove(0);
        }
        sum = newSum;

        return newSum;
    }

    public void add(double account) {
        accounts.add(account);
    }

    public void addAll(double... accounts) {
        this.accounts.addAll(Arrays.asList(Arrays.stream(accounts).boxed().toArray(Double[]::new)));
    }

    @Override
    public String toString() {
        return accounts.toString();
    }

}
