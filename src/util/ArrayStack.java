package util;

import java.util.ArrayList;

/**
 * Array based implementation of Stack. This implementation grows by doubling
 * its capacity when a {@code Stack#push(E e)} is performed and the current
 * capacity is completely used.
 *
 * @author hom
 * @param <E> type of elements in stack.
 */
public class ArrayStack<E> implements Stack<E> {

    ArrayList<E> storage = new ArrayList<>();
    int top = storage.size();
   

    @Override
    public void push(E e) {
        if (storage.isEmpty()) {
            storage.add(e);
        } else {
            storage.add(e);
            top++;
        }

    }

    @Override
    public E pop() {
        E result;
        if (top == 0) {
            result = storage.get(top);
            storage.clear();
            top = 0;
        } else {
            result = storage.get(top);
            storage.remove(top);
            top--;
        }
        
        return result;

    }

    @Override
    public E peek() {
        return storage.get(top);
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int size(){
        return storage.size();
    }

}
