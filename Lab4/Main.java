public class Main {
    public static void main(String[] args) {

        DataProcessor dpBubble = new DataProcessor(new BubbleSort(), new calcTime());

        int[] cArr1k = consecArray(1000);
        int[] cArr1k2 = cArr1k.clone();
        int[] cArr1k3 = cArr1k.clone();

        int[] cArr10k = consecArray(10000);
        int[] cArr10k2 = cArr10k.clone();
        int[] cArr10k3 = cArr10k.clone();

        int[] cArr100k = consecArray(100000);
        int[] cArr100k2 = cArr100k.clone();
        int[] cArr100k3 = cArr100k.clone();

        int[] rArr1k = randArray(1000);
        int[] rArr1k2 = rArr1k.clone();
        int[] rArr1k3 = rArr1k.clone();

        int[] rArr10k = randArray(10000);
        int[] rArr10k2 = rArr10k.clone();
        int[] rArr10k3 = rArr10k.clone();

        int[] rArr100k = randArray(100000);
        int[] rArr100k2 = rArr100k.clone();
        int[] rArr100k3 = rArr100k.clone();

        dpBubble.printName(new BubbleSort());
        dpBubble.processData(cArr1k, 's');
        dpBubble.processData(cArr10k, 's');
        dpBubble.processData(cArr100k, 's');

        dpBubble.processData(rArr1k, 'r');
        dpBubble.processData(rArr10k, 'r');
        dpBubble.processData(rArr100k, 'r');

        DataProcessor dpInsertion = new DataProcessor(new InsertionSort(), new calcTime());

        dpBubble.printName(new InsertionSort());
        dpInsertion.processData(cArr1k2, 's');
        dpInsertion.processData(cArr10k2, 's');
        dpInsertion.processData(cArr100k2, 's');

        dpInsertion.processData(rArr1k2, 'r');
        dpInsertion.processData(rArr10k2, 'r');
        dpInsertion.processData(rArr100k2, 'r');

        DataProcessor dpSelection = new DataProcessor(new SelectionSort(), new calcTime());

        dpBubble.printName(new SelectionSort());
        dpSelection.processData(cArr1k3, 's');
        dpSelection.processData(cArr10k3, 's');
        dpSelection.processData(cArr100k3, 's');

        dpSelection.processData(rArr1k3, 'r');
        dpSelection.processData(rArr10k3, 'r');
        dpSelection.processData(rArr100k3, 'r');

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
