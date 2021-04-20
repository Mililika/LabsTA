package lab7;

public class Main {
    public static void main(String[] args) {

        BTree bC = new BTree();
        BTree bR = new BTree();
        CalcTime c = new CalcTime();

        UniqueKeys keys = new UniqueKeys();
        int[] elems = keys.getKeys();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~CONTINUOUS KEYS~~~~~~~~~~~~~~~~~~~~~~~\n");

        c.Start();
        for(int i = 0; i < 1000; i++){
            bC.insert(i);
            bR.insert(elems[i]);
        }
        System.out.println("Insertion takes " + c.Finish() + "ms");

        c.Start();
        System.out.println("Is key found: " + bC.search(567) + " for " + c.Finish() + "ms");

        c.Start();
        bC.delete(345);
        System.out.println("Deletion takes " + c.Finish() + "ms");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~RANDOM KEYS~~~~~~~~~~~~~~~~~~~~~~~\n");

        c.Start();
        for(int i = 0; i < 1000; i++){
            bR.insert(elems[i]);
        }
        System.out.println("Insertion takes " + c.Finish() + "ms");

        c.Start();
        System.out.println("Is key found: " + bR.search(elems[567]) + " for " + c.Finish() + "ms");

        c.Start();
        bR.delete(elems[345]);
        System.out.println("Deletion takes " + c.Finish() + "ms");

    }
}
