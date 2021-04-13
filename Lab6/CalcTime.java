package Lab6;

public class CalcTime {

    private double start;

    public void Start(){
        this.start = System.nanoTime() * Math.pow(10, -6);
    }

    public double Finish(){
        double finish = System.nanoTime() * Math.pow(10, -6);
        return finish - this.start;
    }
}
