package ArrayFolder;

/** array based list
 */
//       0 1  2 3 4 5 6 7
// item: [6 9 -1 2 0 0 0 0...]
// size: 4
public class AList<T> {
    private T [] items;
    private int size;

    /** invariants: 
     *  addlast: the next item we want to add, will go into position size
     *  getLast: the item we want to return in position size - 1
     *  size the number in the items in the list should be size.
     */

    /** create an empty list in the ctor */
    public AList() {
        items = (T[]) new Object[100];
        size = 0;
    }

    /** resizes the underlying array to the target capacity */
    public void resize(int capacity) {
        T[] a = (T[]) new Object[capacity];
        System.arraycopy(items, 0, a, 0, size);
        items = a;
    }

    /** insert x into back of the list */
    public void addLast(T x) {
        // check to resize the lenght of the items in the list
        if (size == items.length) {
            resize(size + 1);
        }

        items[size] = x;
        size = size + 1;
    }

    /** return the item from the back of the list */
    public T getLast() {
        return items[size - 1];
    }

    /** gets the ith item in the list (0 is the front) */
    public T get(int i) {
        return items[i];
    }

    /** returns the number in the list */
    public int size() {
        return size; 
    }

    /** deletes item from back of the list and
      * returns deleted item. */
      public T removeLast() {
        T x = getLast();
        items[size - 1] = null;
        size = size - 1;
        return x;
    }
    
}
