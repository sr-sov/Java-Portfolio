package util;
import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<String> stack = new LinkedList<String>();
    public void push(String s) {
        stack.addFirst(s);
    }
    public Object top() {
        return stack.getFirst();
    }
    public String pop() {
        return stack.removeFirst();
    }
}
