package util;

import org.junit.Assert;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Base class for stack tests. The extending classes should provide the factory
 * method createInstance.
 *
 * @author hom
 */
public class StackTestBase<E> {

    static String[] testData = {"A", "B", "C", "D", "E", "F"};

    @Test
    public void testIsEmpty() {
        ArrayStack stack = new ArrayStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testPush() {
        ArrayStack stack = new ArrayStack();
        Object o = new Object();
        assertTrue(stack.isEmpty());
        stack.push(o);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPop() {
        ArrayStack stack = new ArrayStack();
        Object o = new Object();

        // put an object inside stack
        stack.push(o);
        Assert.assertFalse(stack.isEmpty());

        // get the object back
        stack.pop();
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void testPeek() {
        ArrayStack stack = new ArrayStack();
        String testObject = "Hallo World";

        // looking on the top Object
        stack.push(testObject);
        Assert.assertSame(testObject, stack.peek());

    }

    @Test
    public void testAdvancedStuff() {
        ArrayStack stack = new ArrayStack();

        Assert.assertTrue(stack.isEmpty());

        //adding { "A", "B", "C", "D", "E", "F" }; to the Stack
        for (String letter : testData) {
            stack.push(letter);
            Assert.assertSame(letter, stack.peek());
        }
        
        // Stack is not empty anymore
        Assert.assertFalse(stack.isEmpty());

        //Stack should now have a Size of 6
        Assert.assertEquals(6, stack.size());
        
        //expecting in Return { "F", "E", "D", "C", "B", "A" };
        //EXPECT LETTER F
        String letterF = (String) stack.pop();
        Assert.assertEquals("F", letterF);
        Assert.assertEquals(5, stack.size());

        //EXPECT LETTER E
        String letterE = (String) stack.pop();
        Assert.assertEquals("E", letterE);
        Assert.assertEquals(4, stack.size());
        
        //EXPECT LETTER D
        String letterD = (String) stack.pop();
        Assert.assertEquals("D", letterD);
        Assert.assertEquals(3, stack.size());
        
        //EXPECT LETTER C
        String letterC = (String) stack.pop();
        Assert.assertEquals("C", letterC);
        Assert.assertEquals(2, stack.size());

        //EXPECT LETTER B
        String letterB = (String) stack.pop();
        Assert.assertEquals("B", letterB);
        Assert.assertEquals(1, stack.size());

        //EXPECT LETTER A
        String letterA = (String) stack.pop();
        Assert.assertEquals("A", letterA);
        Assert.assertEquals(0, stack.size());
        
        
        //Stack must be empty by now:
        Assert.assertTrue(stack.isEmpty());
    }

}
