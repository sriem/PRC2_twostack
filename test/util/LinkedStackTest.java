/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author riema
 */
public class LinkedStackTest<E> {
    


    /**
     * Test of push method, of class LinkedStack.
     */
    @Test
    public void testPush() {
        LinkedStack<E> stack = new LinkedStack<>();
        String testObject = "Hallo World";
        // looking on the top Object
        stack.push((E)testObject);
        assertSame(testObject, stack.peek());
    }

    /**
     * Test of pop method, of class LinkedStack.
     */
    @Test
    public void testPop() {
        LinkedStack<E> stack = new LinkedStack<>();
        String testObject = "Hallo World";
        String testObject2 = "Hallo Planet";
        String testObject3 = "Hallo Planet2";
        // looking on the top Object
        stack.push((E)testObject);
        stack.push((E)testObject2);
        stack.push((E)testObject2);
        stack.pop();
        stack.pop();
        assertFalse(stack.isEmpty());
        assertSame(testObject, stack.peek());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    /**
     * Test of peek method, of class LinkedStack.
     */
    @Test
    public void testPeek() {
        LinkedStack<E> stack = new LinkedStack<>();
        String testObject = "Hallo World";
        // looking on the top Object
        stack.push((E)testObject);
        assertSame(testObject, stack.peek());
    }

    /**
     * Test of isEmpty method, of class LinkedStack.
     */
    @Test
    public void testIsEmpty() {
        LinkedStack<E> stack = new LinkedStack<>();
        assertTrue(stack.isEmpty());
    }
    
}
