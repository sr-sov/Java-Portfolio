import java.util.ArrayDeque;
import java.util.Deque;
//import java.util.Stack;

public class DemoDeque {
    public static void runFunc() {
        //Stack<String> games = new Stack<String>();
        //use Dequeue instead, can be implemented as stack or queue
        Deque<String> deque = new ArrayDeque<String>();
        deque.addFirst("P1");
        deque.addFirst("P2");
        deque.addFirst("P3");
        deque.poll();
        deque.pop();
        deque.push("P4");//add to head
        deque.add("P5");//add to end
        System.out.println(deque);
    }
}
