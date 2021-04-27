package lab9;

public class DpMain {
    public static void main(String[] args) {

        Generator g = new Generator();
        int n = g.getNum();

        int[] size = new int[]{2, 5, 3, 3};
        int[] price = new int[]{5, 2, 3, 4};
        int S = 10;

        MaxPricing maxPrice = new MaxPricing();
        Integer[] prices = maxPrice.maxPrices(size, price, S);
        for (Integer i : prices) {
                System.out.print(i + " ");
        }
        System.out.println();

        MaxPacked maxPacked = new MaxPacked();
        Integer[] Ds = maxPacked.maxThings(size, S);
        for (Integer d : Ds) {
            System.out.print(d + " ");
        }
        System.out.println();

        Intersection inters = new Intersection(prices, Ds);
        inters.intersection();
        System.out.println(inters);
    }
}
