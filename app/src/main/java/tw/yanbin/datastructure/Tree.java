package tw.yanbin.datastructure;

public class Tree<E> {

    private Tree<E> left;
    private Tree<E> right;
    private Tree<E> parent;
    private boolean isBalanced;
    private E element;

    public Tree(E element) {
        this.element = element;
    }

    public Tree(Tree<E> left, E element) {
        this.left = left;
        this.element = element;
    }

    public Tree<E> getLeft() {
        return left;
    }

    public void addLeft(Tree<E> left) {
        this.left = left;
        left.setParent(this);
    }

    public Tree<E> getRight() {
        return right;
    }

    public void addRight(Tree<E> right) {
        this.right = right;
        right.setParent(this);
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Tree<E> getParent() {
        return parent;
    }

    public void setParent(Tree<E> parent) {
        this.parent = parent;
    }

    public int getDepth(){
        if(element == null){
            return 0;
        }
        int leftDepth = left==null?0 : left.getDepth();
        int rightDepth = right==null?0 : right.getDepth();
        int maxDepth = Math.max(leftDepth, rightDepth);

        return 1 + maxDepth;
    }

    public int getSize(){
        if(element == null){
            return 0;
        }
        int leftSize = left==null?0 : left.getSize();
        int rightSize = right==null?0 : right.getSize();

        return 1 + leftSize + rightSize;
    }

    public boolean isBalanced() {
        return isBalanced;
    }

    public void setBalanced(boolean balanced) {
        isBalanced = balanced;
    }

    public void clear() {
        left = null;
        right = null;
        element = null;
    }

    public boolean isEmpty() {
        return element == null;
    }
}
