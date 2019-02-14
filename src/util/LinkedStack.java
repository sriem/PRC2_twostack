package util;

/**
 * Linked Node stack. This implementation uses an internal Link container
 * forming a linked stack.<br>
 * <p>
 * <a href='doc-files/linkedstack.jpg'>
 * <img width='480' src='doc-files/linkedstack.jpg' alt='Link stack design'></a>
 * <p>
 * <p>
 * The stack always "hangs" by it's top, which is where the {@code push()} an
 * {@code pop()} operations take place.</p>
 * <p>
 * This implementation has no constraint on its size, so it can take all
 * elements you throw at it until all the JVM's memory is consumed. There is no
 * (integer) indexing, which limits an array implementation to the
 * Integer.MAX_INT (2147483647) elements in a stack. It is unsure if this is a
 * deciding feature.</p>
 *
 *
 * @author hom
 * @param <E> type on this Stack.
 */
public class LinkedStack<E> implements Stack<E> {
    
    
    private Link<E> top = new Link(null);
    private Link<E> last = top;
    
    private static class Link<E> {

        private Link<E> next;
        private E item;

        public Link(E item) {
            // head
            this.item = item;
            this.next = null;
        }

        public Link(E item, Link<E> next) {
            this.item = item;
            this.next = next;
        }

    }

    @Override
    public void push(E e) {
        Link<E> newElement = new Link<>(e);
        newElement.next = top;
        top = newElement;
    }

    @Override
    public E pop() {
        E result = top.item;
        top = top.next;
        return result;
    }

    @Override
    public E peek() {
        return top.item;
    }

    @Override
    public boolean isEmpty() {
        return top.item == null;
    }
    //TODO impleemnt all methods of LinkedStack

}
