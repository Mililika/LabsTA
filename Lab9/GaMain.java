package lab9;

public class GaMain {
    public static void main(String[] args) {
        Company c = new Company(20, 11234, 20000, 45, 43432, 8235);
        System.out.println(c);
        c.calculate(0.2);
        //System.out.println(c);
        System.out.println(c.getSum());
    }
}
