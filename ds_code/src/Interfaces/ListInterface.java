package Interfaces;

public interface ListInterface<T> {
    public void addLast(T x);
    public T getLast();
    public T get(int i);
    public int size();
    public T removeLast();
    // public void insert(T x, int position);
    // public void addFirst(T x);
    // public T getFirst();
}
