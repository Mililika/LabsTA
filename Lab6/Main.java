package Lab6;


public class Main {

    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {
        BinaryTree<Integer> tC = new BinaryTree<>();
        BinaryTree<Integer> tR = new BinaryTree<>();
        BalancedBinaryTree<Integer, Integer>  bTC = new BalancedBinaryTree<>();
        BalancedBinaryTree<Integer, Integer>  bTR = new BalancedBinaryTree<>();

        CalcTime c = new CalcTime();

        try {
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~UNBALANCED TREE~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~CONTINIOUS KEYS~~~~~~~~~~~~~~~~~~~~~~~");

            c.Start();
            for (int i = 0; i < 1000; i++) {
                tC.insert(i, (int) (Math.random() * 100));
            }
            System.out.println("Insertion continious elements takes " + c.Finish() + " ms");

            c.Start();
            tC.getValue(154);
            System.out.println("Search in continious tree takes " + c.Finish() + " ms");

            c.Start();
            tC.remove(200);
            System.out.println("Deletion in continious tree takes " + c.Finish() + " ms");

            //System.out.println(tC);

            UniqueKeys keys = new UniqueKeys();
            int[] elems = keys.getKeys();

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~RANDOM KEYS~~~~~~~~~~~~~~~~~~~~~~~");

            c.Start();
            for (int elem : elems) {
                tR.insert(elem, (int) (Math.random() * 100));
            }
            System.out.println("Insertion random elements takes " + c.Finish() + " ms");

            c.Start();
            tR.getValue(elems[456]);
            System.out.println("Search in random tree takes " + c.Finish() + " ms");

            c.Start();
            tR.remove(elems[834]);
            System.out.println("Deletion in random tree takes " + c.Finish() + " ms");

            //System.out.println(tR);

            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~BALANCED TREE~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~CONTINIOUS KEYS~~~~~~~~~~~~~~~~~~~~~~~");

            c.Start();
            for (int i = 0; i < 1000; i++) {
                bTC.insert(i, (int) (Math.random() * 100));
            }
            System.out.println("Insertion continious elements takes " + c.Finish() + " ms");

            c.Start();
            bTC.get(145);
            System.out.println("Search in continious tree takes " + c.Finish() + " ms");

            c.Start();
            bTC.remove(564);
            System.out.println("Deletion in continious tree takes " + c.Finish() + " ms");

            //bTC.print();

            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~RANDOM KEYS~~~~~~~~~~~~~~~~~~~~~~~");

            c.Start();
            for (int elem : elems) {
                bTR.insert(elem, (int) (Math.random() * 100));
            }
            System.out.println("Insertion random elements takes " + c.Finish() + " ms");

            c.Start();
            bTR.get(elems[456]);
            System.out.println("Search in random tree takes " + c.Finish() + " ms");

            c.Start();
            bTR.remove(elems[834]);
            System.out.println("Deletion in random tree takes " + c.Finish() + " ms");

            //bTR.print();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
