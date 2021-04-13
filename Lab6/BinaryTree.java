package Lab6;

public class BinaryTree<T> {
    private int size;
    private Node root;

    private class Node {
        int key;
        T value;
        Node l;
        Node r;

        public Node(T value, int key) {
            this.value = value;
            this.key = key;
            this.l = null;
            this.r = null;
        }
    }

    public void insert(int key, T value) throws IllegalArgumentException {
        if (root == null) {
            root = new Node(value, key);
        } else {
            Node temp = root;
            Node prev = temp;
            while (temp != null) {
                prev = temp;
                if (key > temp.key) {
                    temp = temp.r;
                } else if (key < temp.key) {
                    temp = temp.l;
                } else {//(key == temp.key){
                    throw new IllegalArgumentException("Key already exists");
                }
            }
            temp = new Node(value, key);
            size++;
            if (key > prev.key) {
                prev.r = temp;
            } else {
                prev.l = temp;
            }
        }

    }

    public void remove(int key) throws IllegalArgumentException {
        Node current = root, parent = null;

        // Находим удаляемый узел.
        for(int i = 0; i < key && current != null; i++) {
            if (current.key > key) {
                // Если искомое значение меньше, идем налево.
                parent = current;
                current = current.l;
            } else if (key > current.key) {
                // Если искомое значение больше, идем направо.
                parent = current;
                current = current.r;
            } else {
                // Если равны, то останавливаемся
                break;
            }
        }

        if (current == null) {
            throw new IllegalArgumentException("Remove elem - bad key");
        }

        // Случай 1: Если нет детей справа, левый ребенок встает на место удаляемого.
        if (current.r == null) {
            if (parent == null) {
                root = current.l;
            } else {
                if (parent.key > current.key) {
                    // Если значение родителя больше текущего,
                    // левый ребенок текущего узла становится левым ребенком родителя.
                    parent.l = current.l;
                } else if (parent.key < current.key) {// Если значение родителя меньше текущего,
                    // левый ребенок текущего узла становится правым ребенком родителя.
                    parent.r = current.l;
                }
            }
        }

        // Случай 2: Если у правого ребенка нет детей слева то он занимает место удаляемого узла.
        else if (current.r.l == null) {
            current.r.l = current.l;
            if (parent == null) {
                root = current.r;
            } else {
                if (parent.key > current.key) {
                    // Если значение родителя больше текущего,
                    // правый ребенок текущего узла становится левым ребенком родителя.
                    parent.l = current.r;
                } else if (parent.key < current.key) { // Если значение родителя меньше текущего,
                    // правый ребенок текущего узла становится правым ребенком родителя.
                    parent.r = current.r;
                }
            }
        }
        // Случай 3: Если у правого ребенка есть дети слева, крайний левый ребенок // из правого поддерева заменяет удаляемый узел.
        else { // Найдем крайний левый узел.
            Node lMost = current.r.l;
            Node lParent = current.r;
            while (lMost.l != null) {
                lParent = lMost;
                lMost = lMost.l;
            } // Левое поддерево родителя становится правым поддеревом крайнего левого узла.
            lParent.l = lMost.r; // Левый и правый ребенок текущего узла становится левым и правым ребенком крайнего левого.
            lMost.l = current.l;
            lMost.r = current.r;
            if (parent == null) {
                root = lMost;
            } else {
                if (parent.key > current.key) {
                    // Если значение родителя больше текущего,
                    // крайний левый узел становится левым ребенком родителя.
                    parent.l = lMost;
                } else if (parent.key < current.key) {
                    // Если значение родителя меньше текущего,
                    // крайний левый узел становится правым ребенком родителя.
                    parent.r = lMost;
                }
            }
        }
        size--;
    }

    public T getValue(int key) throws IllegalArgumentException {
        Node current = root;

        // До тех пор, пока не нашли...
        for(int i = 0; i < key && current != null; i++) {
            if (current.key > key) {
                // Если искомое значение меньше, идем налево.
                current = current.l;
            } else if (key > current.key) {
                // Если искомое значение больше, идем направо.
                current = current.r;
            } else {
                // Если равны, то останавливаемся
                break;
            }
        }
        if (current == null) {
            throw new IllegalArgumentException("Find elem - bad key");
        }
        return current.value;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("TreeList{");
        for(int i = 0; i <= size; i++){
            sb.append(i).append("=").append(getValue(i)).append(", ");
        }
        sb.append("}");
        return sb.toString().replaceFirst(", }$","}");
    }
}
