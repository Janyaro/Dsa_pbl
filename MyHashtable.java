public class MyHashtable<K, V> {
    private int capacity;
    private int size;
    private Object[] table;

    public MyHashtable(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.table = new Object[capacity];
    }

    private int hash(K key) {
        return Math.abs(key.hashCode() % capacity);
    }

    public void put(K key, V value) {
        int index = hash(key);
        while (table[index] != null) {
            index = (index + 1) % capacity;
        }
        table[index] = new Entry<>(key, value);
        size++;
    }

    public V get(K key) {
        int index = hash(key);
        while (table[index] != null) {
            Entry<K, V> entry = (Entry<K, V>) table[index];
            if (entry.getKey().equals(key)) {
                return entry.getValue();
            }
            index = (index + 1) % capacity;
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        while (table[index] != null) {
            Entry<K, V> entry = (Entry<K, V>) table[index];
            if (entry.getKey().equals(key)) {
                table[index] = null;
                size--;
                return;
            }
            index = (index + 1) % capacity;
        }
    }

    public int size() {
        return size;
    }

    private static class Entry<K, V> {
        private final K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
}
