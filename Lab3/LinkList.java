class Link<E> {
    public E key; // інформація
    public Link next; // посилання на наступний елемент списку

    public Link(E iData) {
        this.key = iData;
    }

    public void displayLink() {
        System.out.print(" {" + key + "}");

    }
}

public class LinkList<E> {
    Link first;
    Link last;
    public LinkList() {
        first = null;
    }

    public void insertFirst(E iD) {
        Link newLink = new Link(iD); //створюємо новий елемент списку

        newLink.next = first; //вказали на старий "перший" елемент і таким чином зробили його другим
        if(first == null){
            last = newLink;
        } // список ще пустий
        first = newLink; // позначили створений елемент, як перший

    }

    public void insertLast(E iD) {
        Link newLink = new Link(iD); //створюємо новий елемент списку
        if(last != null){
            last.next = newLink;
        }
        else {
            first = newLink;
        }
        last = newLink;
        last.next = null;// позначили створений елемент, як перший

    }

    public void insertRandom(E iD,E key)
    {
        Link newLink = new Link(iD);
        if(first == null){
            insertFirst(iD);
        }
        else {
            Link foundLink = find(key);
            if(foundLink != null){
                Link a = foundLink.next;
                newLink.next = a;
                foundLink.next = newLink;
            }
        }
    }

    public Link find(E key) { // пошук елемента с заданим ключем
        Link current = first; // починаємо пошук з першого елемента
        while (current.key != key) { // якщо, ключ не знайдено,то..
            if (current.next == null) { //якщо ключа немає в списку взагалі, повертаємо null
                return null;
            } else {
                current = current.next; //то переходимо до наступного елемента і шукаємо ключ
            }
        }
        return current;
    }

    public void deleteFirst() { //видалення елементу по заданому ключу
        if (first != null){
            first = first.next;
        }
        else {
            System.out.println("Your list is empty");
        }
    }

    public void delete(E key) { //видалення елементу по заданому ключу
        Link x = first;
        while (x != null){
            Link current = x;
            Link currentNext = current.next;
            x = currentNext;
            if(currentNext!=null && currentNext.key == key){
                Link before = current;
                Link after = currentNext.next;
                before.next = after;

            }
            if(first.key == key){
                first = first.next;
            }
        }

    }

    public void displayList() {
        Link current = first;
        System.out.print("List (first --> last): ");

        while(current != null) { //доки список не закінчився, відображаємо дані
            current.displayLink(); // відображаємо дані елементу, на якому знаходимося
            current = current.next; // переходимо до наступного елементу
        }
        System.out.println();
    }
}
