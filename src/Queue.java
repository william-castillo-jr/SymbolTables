/**
 * FIFO (first-in, first-out) Queue API
 * @param <E> class / data type of the items in the queue
 */
public interface Queue<E> extends Iterable<E> {
    /**
     * Add an item to the queue.
     * @param item the item to be added
     */
    void enqueue(E item);

    /**
     * Remove an item from the queue.
     * @return the item that was removed
     */
    E dequeue();

    /**
     * Checks to see if the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * Returns a count of the number of items in the queue.
     * @return the number of items in the queue
     */
    int size();
}
