package tw.yanbin.datastructure;


public interface Stack<E> {

    void init(E[] elements);
    void clear();
    boolean isEmpty();
    E getTop();
    void push(E element);
    E pop();
    int length();
}
