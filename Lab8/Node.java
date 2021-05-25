package lab8;

public class Node {
    int key;
    Point value;

    public Node(Point value) {
        this.key = generateHashCode(value);
        this.value = value;
    }

    public int generateHashCode(Point value){
        HashFunction hf = new HashFunction(value.x, value.y);
        return hf.hashCode();
    }
}
