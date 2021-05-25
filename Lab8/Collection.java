package lab8;

public interface Collection <K, V> {
    V getValue(K key);
    void setValue(K key, V value);
    void removeValue(K key);
}
