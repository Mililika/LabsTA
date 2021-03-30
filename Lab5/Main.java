public class Main {
    public static void main(String[] args) {

        int[] cArr100k = consecArray(100_000);
        int[] cArr100k2 = cArr100k.clone();
        int[] cArr100k3 = cArr100k.clone();
        int[] cArr100k4 = cArr100k.clone();

        int[] cArr1m = consecArray(1_000_000);
        int[] cArr1m2 = cArr1m.clone();
        int[] cArr1m3 = cArr1m.clone();
        int[] cArr1m4 = cArr1m.clone();

        int[] rArr100k = randArray(100_000);
        int[] rArr100k2 = rArr100k.clone();
        int[] rArr100k3 = rArr100k.clone();
        int[] rArr100k4 = rArr100k.clone();

        int[] rArr1m = randArray(1_000_000);
        int[] rArr1m2 = rArr1m.clone();
        int[] rArr1m3 = rArr1m.clone();
        int[] rArr1m4 = rArr1m.clone();

        DataProcessor dpQuick = new DataProcessor(new QuickSort());

        dpQuick.printName(new QuickSort());

        dpQuick.processData(cArr100k, 's');
        dpQuick.processData(cArr1m, 's');

        dpQuick.processData(rArr100k, 'r');
        dpQuick.processData(rArr1m, 'r');

        DataProcessor dpMerge = new DataProcessor(new MergeSort());
        
        dpMerge.printName(new MergeSort());

        dpMerge.processData(cArr100k2, 's');
        dpMerge.processData(cArr1m2, 's');

        dpMerge.processData(rArr100k2, 'r');
        dpMerge.processData(rArr1m2, 'r');

        DataProcessor dpShell = new DataProcessor(new ShellSort());

        dpShell.printName(new ShellSort());

        dpShell.processData(cArr100k3, 's');
        dpShell.processData(cArr1m3, 's');

        dpShell.processData(rArr100k3, 'r');
        dpShell.processData(rArr1m3, 'r');

        DataProcessor dpHeap = new DataProcessor(new HeapSort());

        dpHeap.printName(new HeapSort());

        dpHeap.processData(cArr100k4, 's');
        dpHeap.processData(cArr1m4, 's');

        dpHeap.processData(rArr100k4, 'r');
        dpHeap.processData(rArr1m4, 'r');

    }


    private static int[] consecArray(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i + 1;
        }
        return arr;
    }

    private static int[] randArray(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int) Math.round(Math.random()*100);
        }
        return arr;
    }
}

