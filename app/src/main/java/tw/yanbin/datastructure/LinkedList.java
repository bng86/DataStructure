package tw.yanbin.datastructure;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.Iterator;

public class LinkedList<E> implements Collection<E>{

    private Node<E> currentNode;
    private Node<E> firstNode;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(firstNode == null){
            return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> node = firstNode;

        while (node != null){
            E element = node.getElement();
            if(element.equals(o)){
                return true;
            }else {
                node = node.getNext();
            }
        }
        return false;
    }

    @NonNull
    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] a) {
        return null;
    }

    public E get(int i){
        int counter = 0;
        if(firstNode ==null){
            return null;
        }else{
            Node<E> node = firstNode;
            if(i > size - 1){
                throw new IndexOutOfBoundsException("size:" + size + ", i:" + i);
            }
            while (counter < i){
                counter ++;
                node = node.getNext();
            }
            return node.getElement();
        }
    }

    @Override
    public boolean add(E e) {
        if(firstNode == null){
            firstNode = new Node<>(e);
            currentNode = firstNode;
        }else {
            Node<E> newNode = new Node<>(e);
            currentNode.setNext(newNode);
            currentNode = newNode;
        }
        size ++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> node = firstNode;
        Node<E> previousNode = null;

        while (node != null){
            E element = node.getElement();
            if(element.equals(o)){
                return removeNode(previousNode, node);
            }else{
                previousNode = node;
                node = node.getNext();
            }
        }

        return false;
    }

    private boolean removeNode(Node<E> previousNode, Node<E> node){
        Node<E> nextNode = node.getNext();
        if(node.equals(firstNode)){
            if(nextNode == null){
                firstNode = null;
                currentNode = null;
            }else{
                firstNode = nextNode;
            }

            size --;
            return true;
        }else{
            previousNode.setNext(nextNode);
            size --;
            return true;
        }
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        firstNode = null;
        currentNode = null;
    }
}
