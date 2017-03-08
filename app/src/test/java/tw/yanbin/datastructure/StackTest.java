package tw.yanbin.datastructure;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class StackTest {

    private Stack<Integer> stack;
    private int stackType;
    private final static int TYPE_LINKED = 0;
    private final static int TYPE_ARRAY = 1;

    @Parameterized.Parameters
    public static Collection<Integer> provideStack(){
        return Arrays.asList(TYPE_LINKED, TYPE_ARRAY);
    }

    public StackTest(Integer type) {
        this.stackType = type;
    }

    @Before
    public void setUp() throws Exception {
        if(stackType == TYPE_LINKED){
            stack = new LinkedStack<>();
        }else{
            stack = new ArrayStack<>();
        }

    }

    @Test
    public void init_and_get_size_should_equals_3() throws Exception {
        int expectLength = 3;

        Integer[] array = {1, 2, 3};
        stack.init(array);

        assertEquals(expectLength, stack.length());
    }

    @Test
    public void init_and_getTop_first_element_should_be_3() throws Exception {
        Integer expectElement = 3;

        Integer[] array = {1, 2, 3};
        stack.init(array);

        assertEquals(expectElement, stack.getTop());

    }

    @Test
    public void init_and_pop_elements_should_be_3_2_1() throws Exception {
        Integer expectElement1 = 3;
        Integer expectElement2 = 2;
        Integer expectElement3 = 1;

        Integer[] array = {1, 2, 3};
        stack.init(array);

        assertEquals(expectElement1, stack.pop());
        assertEquals(expectElement2, stack.pop());
        assertEquals(expectElement3, stack.pop());
    }

    @Test
    public void init_and_pop_three_element_length_should_be_0() throws Exception {
        int expectLength = 0;

        Integer[] array = {1, 2, 3};
        stack.init(array);
        stack.pop();
        stack.pop();
        stack.pop();

        assertEquals(expectLength, stack.length());
    }

    @Test
    public void push_and_pop_should_get_same_elements() throws Exception {
        Integer element1 = 1;
        Integer element2 = 2;
        Integer element3 = 3;

        stack.push(element1);
        stack.push(element2);
        stack.push(element3);

        Integer popElement3 = stack.pop();
        Integer popElement2 = stack.pop();
        Integer popElement1 = stack.pop();

        assertEquals(popElement3, element3);
        assertEquals(popElement2, element2);
        assertEquals(popElement1, element1);
    }

    @Test
    public void init_and_clear_length_should_be_0() throws Exception {
        int expectLength = 0;

        Integer[] array = {1, 2, 3};
        stack.init(array);
        stack.clear();

        assertEquals(expectLength, stack.length());
    }

    @Test
    public void init_and_clear_getTop_should_be_null() throws Exception {
        Integer[] array = {1, 2, 3};
        stack.init(array);
        stack.clear();

        assertNull(stack.getTop());
    }

    @Test
    public void init_and_clear_pop_should_be_null() throws Exception {
        Integer[] array = {1, 2, 3};
        stack.init(array);
        stack.clear();

        assertNull(stack.pop());
    }

    @Test
    public void isEmpty_default_should_be_true() throws Exception {
        assertTrue(stack.isEmpty());
    }

}