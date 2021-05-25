package lab8;

public class HashFunction {
    private final double x, y;

    public HashFunction(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        final int prime = 17;
        int res = 1;
        long tmp;

        tmp = Double.doubleToLongBits(x);
        res = prime * res + (int) (tmp ^ (tmp >>> 32));
        res -= (int) (tmp ^ (tmp >> 10));

        tmp = Double.doubleToLongBits(y);
        res = prime * res + (int) (tmp ^ (tmp >>> 32));
        res -= (int) (tmp ^ (tmp >> 10));
        return res;
    }
}
