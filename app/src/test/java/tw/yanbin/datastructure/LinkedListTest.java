package tw.yanbin.datastructure;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LinkedListTest {

    @Test
    public void add_one_element_size_should_equals_one() throws Exception {
        int expectSize = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(1);

        assertEquals(expectSize, linkedList.size());
    }

    @Test
    public void add_one_element_size_should_contain_it() throws Exception {
        Integer element = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(element);

        assertTrue(linkedList.contains(element));
    }

    @Test
    public void should_not_contain_not_exist_element() throws Exception {
        Integer element1 = 1;
        Integer element2 = 2;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(element1);

        assertFalse(linkedList.contains(element2));
    }

    @Test
    public void remove_not_exist_element_should_fail() throws Exception {
        Integer element = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();

        boolean removeSuccess = linkedList.remove(element);

        assertFalse(removeSuccess);
    }


    @Test
    public void add_and_remove_size_should_equals_zero() throws Exception {
        int expectSize = 0;
        Integer element = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(element);
        boolean removeSuccess = linkedList.remove(element);

        assertEquals(expectSize, linkedList.size());
        assertTrue(removeSuccess);
    }

    @Test
    public void add_two_and_remove_one_should_success_and_size_is_one() throws Exception {
        int expectSize = 1;
        Integer element1 = 1;
        Integer element2 = 2;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(element1);
        linkedList.add(element2);
        boolean removeSuccess = linkedList.remove(element1);

        assertEquals(expectSize, linkedList.size());
        assertTrue(removeSuccess);
    }

    @Test
    public void add_and_remove_should_not_contain_that_element() throws Exception {
        Integer element = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(element);
        linkedList.remove(element);

        assertFalse(linkedList.contains(element));
    }

    @Test
    public void add_four_remove_one_should_contain_three_elements() throws Exception {
        Integer element1 = 1;
        Integer element2 = 2;
        Integer element3 = 3;
        Integer element4 = 4;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(element1);
        linkedList.add(element2);
        linkedList.add(element3);
        linkedList.add(element4);
        linkedList.remove(element2);

        assertTrue(linkedList.contains(element1));
        assertTrue(linkedList.contains(element3));
        assertTrue(linkedList.contains(element4));
    }

    @Test
    public void add_four_remove_first_should_contain_three_elements() throws Exception {
        Integer element1 = 1;
        Integer element2 = 2;
        Integer element3 = 3;
        Integer element4 = 4;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(element1);
        linkedList.add(element2);
        linkedList.add(element3);
        linkedList.add(element4);
        linkedList.remove(element1);

        assertTrue(linkedList.contains(element2));
        assertTrue(linkedList.contains(element3));
        assertTrue(linkedList.contains(element4));
    }

    @Test
    public void isEmpty_default_should_be_true() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();

        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void add_element_should_not_empty() throws Exception {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);

        assertFalse(linkedList.isEmpty());
    }

    @Test
    public void add_and_remove_should_be_empty() throws Exception {
        Integer element = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(element);
        linkedList.remove(element);

        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void add_and_clear_size_should_be_zero() throws Exception {
        int expectSize = 0;

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.clear();

        assertEquals(expectSize, linkedList.size());
    }

    @Test
    public void add_and_clear_size_should_not_contain_it() throws Exception {
        Integer element = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(element);
        linkedList.clear();

        assertFalse(linkedList.contains(element));
    }

    @Test
    public void add_and_clear_size_should_be_empty() throws Exception {
        Integer element = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(element);
        linkedList.clear();

        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void add_and_get_should_get_it() throws Exception {
        Integer element1 = 1;
        Integer element2 = 2;
        Integer element3 = 3;
        Integer element4 = 4;
        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(element1);
        linkedList.add(element2);
        linkedList.add(element3);
        linkedList.add(element4);

        assertEquals(element1, linkedList.get(0));
        assertEquals(element2, linkedList.get(1));
        assertEquals(element3, linkedList.get(2));
        assertEquals(element4, linkedList.get(3));

    }
}