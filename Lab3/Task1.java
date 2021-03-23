public class Task1<E> {
    public static void main(String[] args) {

        LinkList newList = new LinkList();
        DoubleLinkList newDoubleList = new DoubleLinkList();
        calcTime c = new calcTime();

        for (int i = 0; i < 1000; i++) {
            newList.insertFirst(Math.round(Math.random() * 100));
            newDoubleList.insertFirst(Math.round(Math.random() * 100));
        }

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~LINKED LIST~~~~~~~~~~~~~~~~~~~~~~~");

        c.Start();
        newList.insertFirst(6);
        System.out.println("Front insert takes " + c.Finish() + " ms");

        c.Start();
        newList.insertLast(7);
        System.out.println("Last insert takes " + c.Finish() + " ms");

        c.Start();
        newList.insertRandom(4, 3);
        System.out.println("Random insert takes " + c.Finish() + " ms");

        //newList.displayList();

        c.Start();
        newList.deleteFirst();
        System.out.println("First deletion takes " + c.Finish() + " ms");

        c.Start();
        newList.delete(2);
        System.out.println("Random deletion takes " + c.Finish() + " ms");

        //newList.displayList();

        c.Start();
        Link f = newList.find(-1);
        if (f != null) {
            System.out.println("Ми знайшли: " + f.key + " і це зайняло " + c.Finish());
        } else {
            System.out.println("Ми не знайшли елемент і це зайняло " + c.Finish() + " ms");
        }

        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~DOUBLY LINKED LIST~~~~~~~~~~~~~~~~~~~~~~~");

        c.Start();
        newDoubleList.insertFirst(6);
        System.out.println("Front insert takes " + c.Finish() + " ms");

        c.Start();
        newDoubleList.insertLast(8);
        System.out.println("Last insert takes " + c.Finish() + " ms");

        c.Start();
        newDoubleList.insertRandom(4, 3);
        System.out.println("Random insert takes " + c.Finish() + " ms");

        c.Start();
        newDoubleList.deleteFirst();
        System.out.println("First deletion takes " + c.Finish() + " ms");

        c.Start();
        newDoubleList.deleteLast();
        System.out.println("Last deletion takes " + c.Finish() + " ms");

        c.Start();
        newDoubleList.delete(5);
        System.out.println("Random deletion takes " + c.Finish() + " ms");

        //newDoubleList.displayDoubleLinkList();

        c.Start();
        DoubleLink k = newDoubleList.find(-1);
        if (k != null) {
            System.out.println("Ми знайшли: " + k.key + " і це зайняло " + c.Finish() + " ms");
        } else {
            System.out.println("Ми не знайшли елемент і це зайняло " + c.Finish() + " ms");
        }


    }
}
