/**
 * Symbol Table API
 * A symbol table is a data structure for key-value pairs
 * that supports two operations insert (put) a new pair
 * into the table and search for (get) the value associated
 * with a given key.
 * Refer to 3.1 (p. 361-365) in the Algorithms textbook.
 */
public interface SymbolTable<Key, Value> {

    /**
     * Put a key-value pair into the table
     */
    void put(Key key, Value val);

    /**
     * Returns the value paired with the given key.
     */
    Value get(Key key);

    /**
     * Remove key (and it's value) from the table.
     */
    default void delete(Key key) {
        // find the key in the table and set
        // its associated value to null
        // (this is called "lazy deletion")
        put(key, null);
    }

    /**
     * Returns true if there is a value paired with a key.
     */
    default boolean contains(Key key) {
        return get(key) != null;
    }

    /**
     * Returns true if the table is empty.
     * @return
     */
    default boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Returns the number of key-value pairs in the table.
     * @return
     */
    int size();

    /**
     * Returns an iterator that refers to all the keys
     * in the table.
     */
    Iterable<Key> keys();
}
