public class DataProcessor{

    private final Sort sort;
    private final Timer timer;
    Printer p = new Printer();

    public DataProcessor(Sort sorter, Timer timer){
        this.sort = sorter;
        this.timer = timer;
    }

    public void printName(Sort sorter){
        p.printName(sorter);
    }

    public void processData(int[] array, char s){
        p.print(timer.calcTime(sort, array), array, s);
    }

}

