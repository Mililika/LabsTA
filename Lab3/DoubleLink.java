class DoubleLink<E>{
    public E key; // інформація
    public DoubleLink prev;
    public DoubleLink next; // посилання на наступний елемент списку

    public DoubleLink(E iData) {
        this.key = iData;
    }

    public void displayDoubleLinkedList() {
        System.out.println(" {" + key + "}");
        System.out.println((prev == null ? "null":  prev.key) + " - "+ key +  " - " + (next == null ? "null" : String.valueOf(next.key)));
    }
}
class DoubleLinkList<E> {
    DoubleLink first;
    DoubleLink last;
    public DoubleLinkList() {
        first = null;
    }

    public void insertFirst(E iD) {
        DoubleLink newLink = new DoubleLink(iD); //створюємо новий елемент списку
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
    public void insertLast(E iD) {
        DoubleLink newLink = new DoubleLink(iD); //створюємо новий елемент списку
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
    public void insertRandom(E iD,E key)
    {
        DoubleLink newLink = new DoubleLink(iD);
        if(first == null){
            insertFirst(iD);
        }
        else {
            DoubleLink foundLink = find(key);
            if(foundLink != null) {
                DoubleLink a = foundLink.next;
                newLink.next = a;
                newLink.prev = foundLink;
                foundLink.next = newLink;
            }
        }
    }
    public DoubleLink find(E key) { // пошук елемента с заданим ключем
        DoubleLink current = first; // починаємо пошук з першого елемента
        while (current.key != key) { // якщо, ключ не знайдено,то..
            if (current.next == null) { //якщо ключа немає в списку взагалі, повертаємо null
                return null;
            } else {
                current = current.next; //то переходимо до наступного елемента і шукаємо ключ
            }
        }
        return current;
    }

    public void deleteFirst(){
        if(first != null){
            first = first.next;
        }
        else{
            System.out.println("Your list is empty");
        }
    }

    public void delete(E key) { //видалення елементу по заданому ключу
        DoubleLink x = first;
        while (x != null){
            DoubleLink current = x;
            if(current.key == key){
                DoubleLink before = current.prev;
                DoubleLink after = current.next;
                before.next = after;
                after.prev = before;

            }
            if(first.key == key){
                first = first.next;
            }
            x = x.next;
        }

    }

    public void deleteLast() { //видалення елементу по заданому ключу
        if (first != null){
            DoubleLink before = last.prev;
            before.next = null;
            last = before;
        }
        else {
            System.out.println("Your list is empty");
        }

    }

    public void displayDoubleLinkList() {
        DoubleLink current = first;
        System.out.print("List (first --> last): ");

        while(current != null) { //доки список не закінчився, відображаємо дані
            current.displayDoubleLinkedList(); // відображаємо дані елементу, на якому знаходимося
            current = current.next; // переходимо до наступного елементу
        }
        System.out.println();
    }
}
