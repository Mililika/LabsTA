public class calcTime implements Timer{

    @Override
    public double calcTime(Sort sort, int[] arr){
        double start = System.nanoTime() * Math.pow(10, -6);
        sort.sort(arr);
        double finish = System.nanoTime() * Math.pow(10, -6);
        return finish - start;
    }
}
