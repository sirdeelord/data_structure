package ArrayFolder;

/** array based list
 */
//       0 1  2 3 4 5 6 7
// item: [6 9 -1 2 0 0 0 0...]
// size: 4
public class AList {
    int [] items;
    int size;

    /** invariants: 
     *  addlast: the next item we want to add, will go into position size
     *  getLast: the item we want to return in position size - 1
     *  size the number in the items in the list should be size.
     */

    /** create an empty list in the ctor */
    public AList() {
        items = new int[100];
        size = 0;
    }

    /** insert x into back of the list */
    public void addLast(int x) {
        items[size] = x;
        size = size + 1;
    }

    /** return the item from the back of the list */
    public int getLast() {
        return items[size - 1];
    }

    /** gets the ith item in the list (0 is the front) */
    public int get(int i) {
        return items[i];
    }

    /** returns the number in the list */
    public int size() {
        return size; 
    }

    /** deletes item from back of the list and
      * returns deleted item. */
      public int removeLast() {
        int x = getLast();
        size = size - 1;
        return x;
    }
    
}
