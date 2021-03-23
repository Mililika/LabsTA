class StackList {
    public  int key; // ключ
    public double data;
    public StackList prev;
    public StackList next; // посилання на наступний елемент списку

    public StackList(int iData) {
        this.key = iData;
    }

    public void displayStack() {
        System.out.println(" {" + key + "}");
        //System.out.println((prev == null ? "null":  prev.key) + " - "+ key +  " - " + (next == null ? "null" : String.valueOf(next.key)));

        }
    }

public class StackLinkList {
    StackList first;
    StackList last;
    public StackLinkList() {
        first = null;
    }
    public void addLast(int iD) {
        StackList newLink = new StackList(iD); //створюємо новий елемент списку
        if(last != null){
            last.next = newLink;
            newLink.prev = last;

        }
        else {
            first = newLink;//no one element in list
        }
        last = newLink;
        last.next = null;

    }
    public void addFirst(int iD) {
        StackList newLink = new StackList(iD); //створюємо новий елемент списку
        newLink.next = first;

        //вказали на старий "перший" елемент і таким чином зробили його другим
        if(first == null){
            //set prev
            last = newLink;
        }
        else{
            first.prev = newLink;
        }
        first = newLink; // позначили створений елемент, як перший

    }

    public StackList peekFirst() {
        return first;//переключаем указатель начала на второй элемент         //и выходим
    }

    public StackList peekLast() {
        return last;//переключаем указатель начала на второй элемент         //и выходим
    }

    public StackList pollFirst() {
        StackList temp = first;
        delete(first.key);
        return temp;//переключаем указатель начала на второй элемент         //и выходим
    }

    public StackList pollLast() {
        StackList temp = last;
        delete(last.key);
        return temp;//переключаем указатель начала на второй элемент         //и выходим
    }

    private void delete(int key) { //видалення елементу по заданому ключу
        StackList x = first;
        while (x != null){
            StackList current = x;
//            DoubleLink currentNext = current.next;
            if(current.key == key){
                StackList before = current.prev;
                StackList after = current.next;
                if(before != null) {
                    before.next = after;
                }
                if (after != null) {
                    after.prev = before;
                }

            }
            if(first != null && first.key == key){
                first = first.next;
            }
            x = x.next;
        }

    }

    public void displayStackLinkList() {
        StackList current = first;
        System.out.print("List (first --> last): ");

        while(current != null) { //доки список не закінчився, відображаємо дані
            current.displayStack(); // відображаємо дані елементу, на якому знаходимося
            current = current.next; // переходимо до наступного елементу
        }
        System.out.println("");
    }
}
