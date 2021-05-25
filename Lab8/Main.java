package lab8;

import Lab3.LinkList;
import Lab6.BalancedBinaryTree;
import Lab6.CalcTime;
import Lab6.BinaryTree;

public class Main {
    public static void main(String[] args) {
//        Point value = new Point(6, 15);
//        Node node = new Node(value);
//        BalancedBinaryTree<Integer, Node> hashTree = new BalancedBinaryTree<>();
//        hashTree.setValue(node.key, node.value);
        CalcTime c = new CalcTime();
        HashTable<Integer, Object> hashTable = new HashTable<>();

        BalancedBinaryTree<Integer, Integer> bTree = new BalancedBinaryTree<>();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~BALANCED TREE~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~1000 ELEMENTS~~~~~~~~~~~~~~~~~~~~~~~");

        c.Start();
        for (int i = 0; i < 1000; i++) {
            bTree.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + c.Finish() + " ms");

        c.Start();
        bTree.getValue(145);
        System.out.println("Search takes " + c.Finish() + " ms");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~10000 ELEMENTS~~~~~~~~~~~~~~~~~~~~~~~");

        c.Start();
        for (int i = 0; i < 10000; i++) {
            bTree.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + c.Finish() + " ms");

        c.Start();
        bTree.getValue(145);
        System.out.println("Search takes " + c.Finish() + " ms");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~100000 ELEMENTS~~~~~~~~~~~~~~~~~~~~~~~");

        c.Start();
        for (int i = 0; i < 100000; i++) {
            bTree.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + c.Finish() + " ms");

        c.Start();
        bTree.getValue(145);
        System.out.println("Search takes " + c.Finish() + " ms");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~200000 ELEMENTS~~~~~~~~~~~~~~~~~~~~~~~");

        c.Start();
        for (int i = 0; i < 200000; i++) {
            bTree.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + c.Finish() + " ms");

        c.Start();
        bTree.getValue(145);
        System.out.println("Search takes " + c.Finish() + " ms");


        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~HASH TABLE~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~1000 ELEMENTS~~~~~~~~~~~~~~~~~~~~~~~");

        LinkList<Integer, Integer> list1 = new LinkList<>();
        for (int i = 0; i < 1000; i++) {
            list1.insertRandom(i, (int) (Math.random() * 100));
        }
        c.Start();
        for (int i = 0; i < 1000; i++) {
            hashTable.setValue(i, list1);
        }
        System.out.println("Insertion takes " + c.Finish() + " ms");

        c.Start();
        hashTable.getValue(145);
        System.out.println("Search takes " + c.Finish() + " ms");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~10000 ELEMENTS~~~~~~~~~~~~~~~~~~~~~~~");

        BinaryTree<Integer, Integer> binTree1 = new BinaryTree<>();
        for (int i = 0; i < 10000; i++) {
            binTree1.insert(i, (int) (Math.random() * 100));
        }

        c.Start();
        for (int i = 0; i < 10000; i++) {
            if(i % 2 == 0)
                hashTable.setValue(i, binTree1);
            else
                hashTable.setValue(i, list1);
        }
        System.out.println("Insertion takes " + c.Finish() + " ms");

        c.Start();
        hashTable.getValue(145);
        System.out.println("Search takes " + c.Finish() + " ms");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~100000 ELEMENTS~~~~~~~~~~~~~~~~~~~~~~~");

        c.Start();
        for (int i = 0; i < 100000; i++) {
            if(i % 2 == 0)
                hashTable.setValue(i, list1);
            else
                hashTable.setValue(i, binTree1);
        }
        System.out.println("Insertion takes " + c.Finish() + " ms");

        c.Start();
        hashTable.getValue(145);
        System.out.println("Search takes " + c.Finish() + " ms");

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~200000 ELEMENTS~~~~~~~~~~~~~~~~~~~~~~~");

        c.Start();
        for (int i = 0; i < 200000; i++) {
            if(i % 2 == 0)
                hashTable.setValue(i, (int) (Math.random() * 100));
            else
                hashTable.setValue(i, (int) (Math.random() * 100));
        }
        System.out.println("Insertion takes " + c.Finish() + " ms");

        c.Start();
        hashTable.getValue(145);
        System.out.println("Search takes " + c.Finish() + " ms");
    }

}
