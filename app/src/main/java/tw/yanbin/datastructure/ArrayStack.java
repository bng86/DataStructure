package tw.yanbin.datastructure;


public class ArrayStack<E> implements Stack<E>{

    private final static int INDEX_EMPTY = -1;
    private int topIndex = INDEX_EMPTY;
    private Object[] elements = new Object[1000];

    @Override
    public void init(E[] elements) {
        for (int i = 0; i < elements.length; i++) {
            this.elements[i] = elements[i];
            topIndex ++;
        }
    }

    @Override
    public void clear() {
        topIndex = INDEX_EMPTY;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == INDEX_EMPTY;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E getTop() {
        if(topIndex == INDEX_EMPTY){
            return null;
        }
        return (E) elements[topIndex];
    }

    @Override
    public void push(E element) {
        elements[++topIndex] = element;
    }

    @SuppressWarnings("unchecked")
    @Override
    public E pop() {
        if(topIndex == INDEX_EMPTY){
            return null;
        }
        E element = (E) elements[topIndex];
        topIndex --;
        return element;
    }

    @Override
    public int length() {
        return topIndex + 1;
    }
}
