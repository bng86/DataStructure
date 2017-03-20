package tw.yanbin.datastructure;

import org.junit.Assert;
import org.junit.Test;

public class TreeTest {

    @Test
    public void createTree_size_should_be_3() throws Exception {
        int expectSize = 3;
        Tree<Integer> tree = new Tree<>(3);
        tree.addLeft(new Tree<>(2));
        tree.addRight(new Tree<>(5));

        Assert.assertEquals(expectSize, tree.getSize());
    }

    @Test
    public void createTree_size_should_be_5() throws Exception {
        int expectSize = 5;
        Tree<Integer> tree = new Tree<>(3);
        tree.addLeft(new Tree<>(2));
        tree.addRight(new Tree<>(5));

        Tree<Integer> leftTree = tree.getLeft();
        leftTree.addLeft(new Tree<>(1));
        leftTree.addRight(new Tree<>(6));

        Assert.assertEquals(expectSize , tree.getSize());
    }

    @Test
    public void createTree_depth_should_be_2() throws Exception {
        int expectDepth = 2;

        Tree<Integer> tree = new Tree<>(3);
        tree.addLeft(new Tree<>(2));
        tree.addRight(new Tree<>(5));

        Assert.assertEquals(expectDepth, tree.getDepth());
    }

    @Test
    public void createTree_depth_should_be_4() throws Exception {
        int expectDepth = 4;
        Tree<Integer> tree = new Tree<>(3);
        tree.addLeft(new Tree<>(2));
        tree.addRight(new Tree<>(5));

        Tree<Integer> leftTree = tree.getLeft();
        leftTree.addLeft(new Tree<>(1));

        Tree<Integer> leftLeftTree = leftTree.getLeft();
        leftLeftTree.addLeft(new Tree<>(0));

        Assert.assertEquals(expectDepth , tree.getDepth());
    }

    @Test
    public void createTree_and_clear_size_should_be_0() throws Exception {
        int expectSize = 0;
        Tree<Integer> tree = new Tree<>(3);
        tree.addLeft(new Tree<>(2));
        tree.addRight(new Tree<>(5));

        tree.clear();

        Assert.assertEquals(expectSize, tree.getSize());
    }

    @Test
    public void createTree_and_clear_depth_should_be_0() throws Exception {
        int expectDepth = 0;
        Tree<Integer> tree = new Tree<>(3);
        tree.addLeft(new Tree<>(2));
        tree.addRight(new Tree<>(5));

        tree.clear();

        Assert.assertEquals(expectDepth, tree.getDepth());
    }

    @Test
    public void createTree_and_clear_getElement_should_be_null() throws Exception {
        Integer expectElement = null;
        Tree<Integer> tree = new Tree<>(3);
        tree.addLeft(new Tree<>(2));
        tree.addRight(new Tree<>(5));

        tree.clear();

        Assert.assertEquals(expectElement, tree.getElement());
    }

    @Test
    public void createTree_should_not_empty() throws Exception {
        Tree<Integer> tree = new Tree<>(3);

        Assert.assertTrue(!tree.isEmpty());
    }

    @Test
    public void createTree_and_clear_should_be_empty() throws Exception {
        Tree<Integer> tree = new Tree<>(3);
        tree.clear();

        Assert.assertTrue(tree.isEmpty());
    }
    
}