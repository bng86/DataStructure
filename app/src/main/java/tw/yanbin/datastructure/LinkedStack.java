package tw.yanbin.datastructure;


public class LinkedStack<E> implements Stack<E> {

    private Node<E> topNode;
    private int length;

    @Override
    public void init(E[] elements) {
        topNode = new Node<>(elements[0]);
        length = 1;
        for (int i = 1; i < elements.length; i++) {
            push(elements[i]);
        }
    }

    @Override
    public void clear() {
        length = 0;
        topNode = null;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public E getTop() {
        if(topNode == null){
            return null;
        }
        return topNode.getElement();
    }

    @Override
    public void push(E element) {
        Node<E> nextNode = new Node<>(topNode, element);
        topNode = nextNode;
        length ++;
    }

    @Override
    public E pop() {
        if(length == 0){
            return null;
        }
        E element = topNode.getElement();
        topNode = topNode.getNext();
        length --;
        return element;
    }

    @Override
    public int length() {
        return length;
    }
}
