package tw.yanbin.datastructure;

public class Node<E> {

    private Node<E> next;
    private Node<E> before;
    private E element;

    public Node(E element) {
        this.element = element;
    }

    public Node(Node<E> next, E element) {
        this.next = next;
        this.element = element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getBefore() {
        return before;
    }

    public void setBefore(Node<E> before) {
        this.before = before;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
